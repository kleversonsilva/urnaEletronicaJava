package Servidor;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;
import projetoeleitoral.Principal;
import projetoeleitoral.Urna;

/**
 *
 *
 */
// Observei que o método readUTF, da classe DataInputStream, realiza a leitura de dados uma vez, pois se chamá-la novamente
// não vai ler dado algum. Então, observei que é usada uma variável de tipo String, ao qual vai receber os dados que ele leu,
// para ficar armazanada nesta variável, para assim ser usada em outras partes do programa.
public class Teste {

    public static void main(String[] args) {
        Principal p = new Principal();
        try {

            System.out.printf("\n\tAguardando conexão com o servidor.\n");

            try (Socket client = new Socket("localhost", 2900)) {
                System.out.printf("\n\tConexão feita com o servidor.\n");

                DataInputStream in = new DataInputStream(client.getInputStream());
                DataOutputStream out = new DataOutputStream(client.getOutputStream());
//                ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
//                ObjectInputStream in = new ObjectInputStream(client.getInputStream());

                while (true) {

                    String mensagem = JOptionPane.showInputDialog("Digite o nº do seu CPF:");
                    out.writeUTF(mensagem);
                    
                    mensagem = in.readUTF();
                    
                    System.out.println("a=" + mensagem);

                    if (mensagem.equals("OK")) {
                        Urna urna = new Urna(p);
                        urna.setVisible(true);
                        urna.setLocation(600, 100);
                    }
                    if (mensagem.equalsIgnoreCase("sair")) {

                        JOptionPane.showConfirmDialog(null, "Saindo do servidor.");

                        break;

                    }

                    String mensage = in.readUTF();

                    JOptionPane.showMessageDialog(null, mensage);

                }

                in.close();
                out.close();
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Erro");

        }
    }

}
