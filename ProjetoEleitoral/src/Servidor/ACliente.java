package Servidor;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetoeleitoral.Principal;

/**

 */
public class ACliente {

    Socket client = null;

//    ObjectOutputStream out = null;
//    ObjectInputStream in = null;
    Principal p = new Principal();

    public ACliente() throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            while (true) {
                client = new Socket("localhost", 3000);

                System.out.println("Cliente ligado. Conectando ...");

                String mensagem;
                mensagem = in.readUTF();
                System.out.println("resposta =" + mensagem);

                mensagem = JOptionPane.showInputDialog("Digite o nº do seu CPF:");
                out.writeUTF(mensagem);
                mensagem = in.readUTF();
                System.out.println("resposta =" + mensagem);

                UrnaAAA urna = (UrnaAAA) in.readObject();

//            if (mensagem.equals("OK")) {
//                Urna urna = new Urna();
                urna.setVisible(true);
                urna.setLocation(600, 100);
//            }
                if (mensagem.equalsIgnoreCase("sair")) {

                    JOptionPane.showConfirmDialog(null, "Saindo do servidor.");
                    break;
                }
            }
            in.close();
            out.close();
            client.close();
            out.flush();

        } catch (IOException | HeadlessException | ClassNotFoundException e) {
        } finally {

        }
    }

    public static void main(String[] args) {
        try {
            new ACliente();
        } catch (IOException ex) {
            Logger.getLogger(ACliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
