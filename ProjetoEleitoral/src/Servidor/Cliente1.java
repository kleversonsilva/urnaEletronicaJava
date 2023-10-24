package Servidor;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Nóbrega
 */
// Observei que o método readUTF, da classe DataInputStream, realiza a leitura de dados uma vez, pois se chamá-la novamente
// não vai ler dado algum. Então, observei que é usada uma variável de tipo String, ao qual vai receber os dados que ele leu,
// para ficar armazanada nesta variável, para assim ser usada em outras partes do programa.
public class Cliente1 {

    private static int[] votacao;
    private static ArrayList<String> eleitor, candidato;
    private static String cpfE, cpfC;

    private static boolean enviarVoto = false, enviarEleitor = false, enviarCandidato = false, voltar = false;

    public static void main(String[] args) {
        try {

            System.out.printf("\nAguardando conexão com o servidor.\n");

            try (Socket client = new Socket("localhost", 2900)) {
                System.out.printf("\nConexão feita com o servidor.\n");
                JOptionPane.showMessageDialog(null, "Conexão efetuada");

                DataInputStream in = new DataInputStream(client.getInputStream());
                DataOutputStream out = new DataOutputStream(client.getOutputStream());
                BufferedReader entr = new BufferedReader(new InputStreamReader(System.in));
//                ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
//                ObjectInputStream in = new ObjectInputStream(client.getInputStream());

                while (true) {
                    String mens, mens1;
                    int q, w = 0, z = 0;
                    char op;
                    // 1 conversa - bom dia
                    mens = in.readUTF();
//                    JOptionPane.showMessageDialog(null, "Servidor 1 " + mens);
//                    System.out.println(mens);
                    out.writeUTF("Bom dia!");
                    int sair = 1;

                    while (sair == 1) {
                        // perguntando o cargo
                        mens1 = in.readUTF();
//                    JOptionPane.showMessageDialog(null, "Servidor 2: " + mens1);
//                    System.out.println(mens);
//                    mens = entr.readLine();
                        mens = JOptionPane.showInputDialog("1 - PARA FUNCIONÁRIO;\n"
                                + "2 - PARA ELEITOR.");

                        q = Integer.parseInt(mens);
                        out.writeInt(q);

                        // 3 conversa - recebendo a resposta do protocolo
                        q = in.readInt();

                        if (q == 1) {
                            mens1 = in.readUTF();
//                        JOptionPane.showMessageDialog(null, "Servidor 3: " + mens1);
                            mens = JOptionPane.showInputDialog("1 - PARA CADASTRAR ELEITOR;\n"
                                    + "2 - PARA CADASTRAR CANDIDATO;\n"
                                    + "3 - PARA EMITIR RELATÓRIO.");
                            w = Integer.parseInt(mens);
                            out.writeInt(w);
                            w = in.readInt();
                            if (w == 1) {
                                // cadastrar eleitor
                                mens1 = in.readUTF();
//                            JOptionPane.showMessageDialog(null, "Servidor 4: " + mens1);
                                mens = JOptionPane.showInputDialog("1 - PARA INCLUIR ELEITOR;\n"
                                        + "2 - PARA REMOVER ELEITOR;");
                                z = Integer.parseInt(mens);
                                out.writeInt(z);
                                z = in.readInt();

                                CadastroEleitor ce = new CadastroEleitor();

                                if (z == 1) {
                                    // Para incluir Eleitor
                                    boolean y = true;
                                    while (y) {
                                        ce.setVisible(true);
                                        ce.setLocation(600, 100);
                                        while (true) {
                                            if (certificar2()) {
                                                break;
                                            }
                                        }

//                                        if (voltar) {
                                        for (String eleitor1 : eleitor) {
                                            out.writeUTF(eleitor1);
                                        }
//                                        }
                                        enviarEleitor = false;
                                        voltar = false;
                                        int b = JOptionPane.showConfirmDialog(null, "Desseja cadastrar um novo Eleitor?");
                                        if (b == 1) {
                                            y = false;
                                        }
                                        out.writeBoolean(y);
                                    }
                                    in.close();
                                    out.close();
                                    System.exit(0);// encerra o cliente após a inclusão de eleitor;
//                                    ce.setVisible(false);
                                }
                                if (z == 2) {
                                    boolean y = true;
                                    while (y) {
                                        // Para remover Eleitor
                                        ce.setVisible(true);
                                        ce.setLocation(600, 100);
                                        while (true) {
                                            if (certificar2()) {
                                                break;
                                            }
                                        }
//                                        if (voltar) {
                                        mens = cpfE;
                                        out.writeUTF(mens);
//                                        }
                                        enviarEleitor = false;
                                        voltar = false;
                                        int b = JOptionPane.showConfirmDialog(null, "Desseja remover outro Eleitor?");
                                        if (b == 1) {
                                            y = false;
                                        }
                                        out.writeBoolean(y);
                                    }
                                    in.close();
                                    out.close();
                                    System.exit(0);// encerra o cliente após a remoção de eleitor;
//                                    ce.setVisible(false);
                                }

                            } else if (w == 2) {
                                // cadastrar candidato
                                System.out.println("CADASTRAR CANDIDATO");
                                mens1 = in.readUTF();
//                            JOptionPane.showMessageDialog(null, "Servidor 4: " + mens1);
                                mens = JOptionPane.showInputDialog("1 - PARA INCLUIR CANDIDATO;\n"
                                        + "2 - PARA REMOVER CANDIDATO;");
                                z = Integer.parseInt(mens);
                                out.writeInt(z);
                                z = in.readInt();

                                CadastroCandidato cc = new CadastroCandidato();

                                if (z == 1) {
                                    // Para incluir Candidato
                                    boolean y = true;
                                    while (y) {
                                        cc.setVisible(true);
                                        cc.setLocation(600, 100);
                                        while (true) {
                                            if (certificar3()) {
                                                break;
                                            }
                                        }
                                        for (String candidato1 : candidato) {
                                            out.writeUTF(candidato1);
                                        }
                                        int b = JOptionPane.showConfirmDialog(null, "Desseja gravar outro candidato?");
                                        if (b == 1) {
                                            y = false;
                                        }
                                        out.writeBoolean(y);
                                        enviarCandidato = false;
                                    }
//                                    cc.setVisible(false);
                                    
                                    voltar = false;
                                    in.close();
                                    out.close();
                                    System.exit(0);// encerra o cliente após a inclusão de candidato;
                                }
                                if (z == 2) {
                                    // Para remover Eleitor
                                    boolean y = true;
                                    while (y) {
                                        cc.setVisible(true);
                                        cc.setLocation(600, 100);
                                        while (true) {
                                            if (certificar3()) {

                                                break;
                                            }
                                        }
                                        mens = cpfC;
                                        out.writeUTF(mens);
                                    }
                                    int b = JOptionPane.showConfirmDialog(null, "Desseja remover outro candidato?");
                                    if (b == 1) {
                                        y = false;

                                        out.writeBoolean(y);
                                        enviarCandidato = false;
                                    }
//                                    cc.setVisible(false);
                                    
                                    voltar = false;
                                    in.close();
                                    out.close();
                                    System.exit(0);// encerra o cliente após a remoção de candidato;
                                }

                            } else if (w == 3) {
                                // emitir relatório
                                System.out.println("VER RELATÓRIOS");
                                Relatorio r = new Relatorio();
                                r.setVisible(true);
                                r.setLocation(600, 100);
                                while (true) {
                                    if (certificar3()) {
                                        break;
                                    }
                                }

                                enviarCandidato = false;
                                in.close();
                                out.close();
                                System.exit(0);// encerra o cliente após a exibição de relatório;
                            }

                        } else if (q == 2) {
                            mens = JOptionPane.showInputDialog("Digite o nº do seu CPF:");
//                        mens = entr.readLine();
                            out.writeUTF(mens);

                            mens = in.readUTF();

                            System.out.println("a=" + mens);

                            if (mens.equals("OK")) {
                                UrnaAAA urna = new UrnaAAA();
                                urna.setVisible(true);
                                urna.setLocation(600, 100);
                                while (true) {
                                    if (certificar1()) {
                                        enviarVoto = false;
                                        break;
                                    }
                                }
                            }

                            for (int i = 0; i < 5; i++) {
                                out.write(votacao[i]);
                            }
                            in.close();
                            out.close();
                            System.exit(0);// encerra o cliente após a votação;
                        }
                        if (mens.equalsIgnoreCase("sair")) {

                            JOptionPane.showConfirmDialog(null, "Saindo do servidor.");

                            break;

                        }

                        String mensage = in.readUTF();

                        JOptionPane.showMessageDialog(null, mensage);
                        sair = JOptionPane.showConfirmDialog(null, "Desseja continuar no sistema?");
                        out.write(sair);
//                    }

                        in.close();
                        out.close();
                    }
                }
            }
        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Erro");

        }

    }

    /**
     * @param aVoltar the voltar to set
     */
    public void setVoltar(boolean aVoltar) {
        voltar = aVoltar;
    }

    /**
     * @return the candidato
     */
    public ArrayList<String> getCandidato() {
        return candidato;
    }

    /**
     * @param aCandidato the candidato to set
     */
    public void setCandidato(ArrayList<String> aCandidato) {
        candidato = aCandidato;
    }

    /**
     * @return the enviarCandidato
     */
    public boolean isEnviarCandidato() {
        return enviarCandidato;
    }

    /**
     * @param aEnviarCandidato the enviarCandidato to set
     */
    public void setEnviarCandidato(boolean aEnviarCandidato) {
        enviarCandidato = aEnviarCandidato;
    }

    /**
     * @return the cpf
     */
    public String getCpfE() {
        return cpfE;
    }

    /**
     * @param aCpf the cpf to set
     */
    public void setCpfE(String aCpf) {
        cpfE = aCpf;
    }

    public String getCpfC() {
        return cpfC;
    }

    /**
     * @param aCpf the cpf to set
     */
    public void setCpfC(String aCpf) {
        cpfC = aCpf;
    }

    /**
     * @return the enviarEleitor
     */
    public boolean isEnviarEleitor() {
        return enviarEleitor;
    }

    /**
     * @param aEnviarEleitor the enviarEleitor to set
     */
    public void setEnviarEleitor(boolean aEnviarEleitor) {
        enviarEleitor = aEnviarEleitor;
    }

    /**
     * @return the eleitor
     */
    public ArrayList<String> getEleitor() {
        return eleitor;
    }

    /**
     * @param aEleitor the eleitor to set
     */
    public void setEleitor(ArrayList<String> aEleitor) {
        eleitor = aEleitor;
    }

    /**
     * @return the enviar
     */
    public boolean isEnviar() {
        return enviarVoto;
    }

    /**
     * @param aEnviar the enviar to set
     */
    public void setEnviar(boolean aEnviar) {
        enviarVoto = aEnviar;
    }

    /**
     * @return the votacao
     */
    public int[] getVotacao() {
        return votacao;
    }

    /**
     * @param votacao the votacao to set
     */
    public void setVotacao(int[] votacao) {
        Cliente1.votacao = votacao;
    }

    public static boolean certificar1() {
        boolean z = false;
        if (enviarVoto) {
            z = true;
        }
        return z;
    }

    public static boolean certificar2() {
        boolean z = false;
        if (enviarEleitor) {
            z = true;
        }
        return z;
    }

    public static boolean certificar3() {
        boolean z = false;
        if (enviarCandidato) {
            z = true;
        }
        return z;
    }

    public static boolean certificar4() {
        boolean z = false;
        if (voltar) {
            z = true;
        }
        return z;
    }
}
