package Servidor;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author Roberto Nóbrega
 */
// Observei que o método readUTF, da classe DataInputStream, realiza a leitura de dados uma vez, pois se chamá-la novamente
// não vai ler dado algum. Então, observei que é usada uma variável de tipo String, ao qual vai receber os dados que ele leu,
// para ficar armazanada nesta variável, para assim ser usada em outras partes do programa.
public class Servidor implements Runnable {

    Socket client;
    Protocolo prot;

    public Servidor(Socket s, Protocolo prt) {
        client = s;
        this.prot = prt;
    }

    @Override
    public void run() {
//        Protocolo prot = new Protocolo();
        System.out.print("Conexão feita com o cliente.\n");

        try {
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            BufferedReader entr = new BufferedReader(new InputStreamReader(System.in));
//            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
//            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            while (true) {
                String mens;
                int q = 0, w = 0, z = 0;
                // 1 conversa só bom dia
                out.writeUTF("Bom dia!");
                mens = in.readUTF();
                System.out.println(mens);

                int sair = 1;
                while (sair == 1) {
                    // 2 conversa prguntando o cargo
                    out.writeUTF("Digite a opção:\n1 - Funcionário\n2 - Eleitor");
                    q = in.readInt();
                    out.writeInt(q);

                    if (q == 1) {
                        // Funcionário
                        System.out.println("O Funcionário entrou no Sistema.");
                        out.writeUTF("Digite a opção:\n1 - Cadastrar Eleitor\n2 - Cadastrar Candidato\n3 - Emitir Relatórios");
                        w = in.readInt();
                        out.writeInt(w);
                        if (w == 1) {
                            // Funcionário para Cadastrar Eleitor
                            System.out.println("O Funcionário entrou na tela Cadastrar Eleitor.");
                            out.writeUTF("Digite a opção:\n1 - Incluir Eleitor\n2 - Remover Eleitor");
                            z = in.readInt();
                            out.writeInt(z);

                            if (z == 1) {
                                boolean y = true;
                                while (y) {
                                    // incluindo um Eleitor
                                    System.out.println("O Funcionário deseja incluir um Eleitor.");
                                    ArrayList<String> eleitor = new ArrayList<>();
                                    for (int i = 0; i < 6; i++) {
                                        mens = in.readUTF();
                                        System.out.println("Servidor 72 " + mens);
                                        eleitor.add(mens);
                                    }
                                    // ERRO AQUI. NÃO ESTÁ ENVIANDO A CLASSE PROTOCOLO
                                    prot.incluirEleitor(eleitor);
                                    eleitor.clear();
                                    y = in.readBoolean();
                                }
                            }
                            if (z == 2) {
                                // Removendo um Eleitor
                                System.out.println("O Funcionário deseja remover um Eleitor.");
                                boolean y = true;
                                while (y) {
                                    mens = in.readUTF();
                                    prot.removerEleitor(mens);
                                    y = in.readBoolean();
                                }
                            }
                        }
                        if (w == 2) {
                            // Funcionário para Cadastrar Candidato
                            System.out.println("O Funcionário entrou na tela Cadastrar Candidato.");
                            out.writeUTF("Digite a opção:\n1 - Incluir Candidato\n2 - Remover Candidato");
                            z = in.readInt();
                            out.writeInt(z);
                            if (z == 1) {
                                // incluindo um Candidato
                                System.out.println("O Funcionário deseja incluir um Candidato.");
                                boolean y = true;
                                while (y) {
                                    ArrayList<String> candidato = new ArrayList<>();
                                    for (int i = 0; i < 5; i++) {
                                        mens = in.readUTF();
                                        candidato.add(mens);
                                    }
                                    prot.incluirCandidato(candidato);
                                    candidato.clear();
                                    y = in.readBoolean();
                                }
                            }
                            if (z == 2) {
                                // Removendo um Candidato
                                System.out.println("O Funcionário deseja remover um Candidato.");
                                boolean y = true;
                                while (y) {
                                    mens = in.readUTF();
                                    prot.removerCandidato(mens);
                                    y = in.readBoolean();
                                }
                            }

                        }
                        if (w == 3) {
                            // Funcionário para Emitir Relatórios
                            System.out.println("O Funcionário entrou na tela Relatório.");
                            out.writeUTF("Exibir Relatórios");
                        }
                    }
                    if (q == 2) {
                        // Eleitor
                        System.out.println("Eleitor entrou no Sistema para votar.");
                        mens = in.readUTF();
                        System.out.println("mensagem recebida: " + mens);
                        out.writeUTF("OK");

                        int[] votacao = new int[5];
//                        synchronized (this) {
                        for (int i = 0; i < 5; i++) {
                            votacao[i] = in.read();
                        }
                        prot.capitalizarVotacao(votacao);
//                        }
                    }
                    System.out.println("Funcionário permanece no Sistema.");
                    sair = in.read();
                }

                if (mens.equalsIgnoreCase("sair")) {
                    break;
                }
            }

            in.close();
            out.close();
            client.close();

        } catch (IOException e) {

            System.out.print("\nHouve algum erro ou o cliente saiu da conexão.\n");

        }
    }

}

class Criando {

    public static void main(String[] args) throws IOException {
        Protocolo prot = new Protocolo();
        try {
            ServerSocket server = new ServerSocket(2900);
            System.out.printf("\n\tAguardando conexão com o cliente.\n");
            while (true) {
                Socket soc = server.accept();
                // System.out.print("\n\tConexão feita.\n");
                new Thread(new Servidor(soc, prot)).start();
            }
        } catch (IOException e) {
            System.out.print("\n\tErro neste servidor.\n");
        }

//        Executor exec = Executors.newCachedThreadPool();
//        ServerSocket sever = new ServerSocket(2900);
//
//        while (true) {
//            Socket ns = sever.accept();
//            exec.execute(new Servidor(ns, prot));
//        }
    }

}
