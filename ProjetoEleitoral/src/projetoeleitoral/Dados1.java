package projetoeleitoral;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**

 */

public class Dados1 {

    String arquivo0 = "src/Arquivos/eleitor1.txt", arquivo1 = "src/Arquivos/candidatos1.txt",
            arquivo2 = "src/Arquivos/votobranco1.txt", arquivo3 = "src/Arquivos/votonulo1.txt";
    Path caminhoEleitor = Paths.get(arquivo0);
    Path caminhoCandidato = Paths.get(arquivo1);
    Path caminhoVotoBranco = Paths.get(arquivo2);
    Path caminhoVotoNulo = Paths.get(arquivo3);
    Charset utf8 = StandardCharsets.UTF_8;
    String token = ";";

    public synchronized void armazenarEleitor(ArrayList<Eleitor> vetor, int tam) {
        String[] gravar = new String[tam];

        try (BufferedWriter escritor = Files.newBufferedWriter(caminhoEleitor, utf8)) {
            for (Eleitor v : vetor) {
                gravar[0] = v.getCpf() + token;
                gravar[1] = v.getNome() + token;
                gravar[2] = v.getIdentidade() + token;
                gravar[3] = v.getTituloeleitoral() + token;
                gravar[4] = v.getZonaeleitoral() + token;
                gravar[5] = v.getSecao() + token;
                gravar[6] = v.getComparecimento() + token;
                gravar[7] = v.getSerCandidato() + token;

                for (int i = 0; i < tam; i++) {
                    escritor.write(gravar[i]);
                }
                escritor.newLine(); // para quebrar linha ao armazenar
            }
        } catch (IOException e) {
            System.err.println("Erro no armazenar Eleitor");
        }
    }

    public synchronized ArrayList<Eleitor> recuperarEleitor() {
        ArrayList<Eleitor> vetor = new ArrayList<>();
        Eleitor e;
        String cpf, nome, identidade, tituloeleitoral, zonaeleitoral, secao, comparecimento, serCandidato;

        try (BufferedReader leitor = Files.newBufferedReader(caminhoEleitor, utf8)) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] t = linha.split(token); // recuperando um linha
                cpf = t[0];
                nome = t[1];
                identidade = t[2];
                tituloeleitoral = t[3];
                zonaeleitoral = t[4];
                secao = t[5];
                comparecimento = t[6];
                serCandidato = t[7];

                e = new Eleitor(cpf, nome, identidade, tituloeleitoral, zonaeleitoral, secao);
                e.setComparecimento(comparecimento);
                e.setSerCandidato(serCandidato);

                vetor.add(e);
            }
        } catch (IOException ioe) {
            System.err.println("Erro no recuperar Eleitor");
        }
        return vetor;
    }

    public synchronized void armazenarCandidato(ArrayList<Candidato> vetor, int tam) {
        String[] gravar = new String[tam];
        String cargo;

        try (BufferedWriter escritor = Files.newBufferedWriter(caminhoCandidato, utf8)) {
            for (Candidato v : vetor) {
                gravar[0] = v.getCpf() + token;
                gravar[1] = v.getNome() + token;
                gravar[2] = this.tipo(v) + token;
                gravar[3] = v.getPartido() + token;
                gravar[4] = v.getNumero() + token;
                gravar[5] = v.getQuantVotos() + token;

                for (int i = 0; i < tam; i++) {
                    escritor.write(gravar[i]);
                }
                escritor.newLine(); // para quebrar linha ao armazenar
            }
        } catch (IOException e) {
            System.err.println("Erro no armazenar Candidato");
        }
    }

    public synchronized String tipo(Candidato c) {
        if (c instanceof Presidente) {
            return "Presidente";
        } else if (c instanceof Senador) {
            return "Senador";
        } else if (c instanceof DeputadoFederal) {
            return "Deputado_Federal";
        } else if (c instanceof Governador) {
            return "Governador";
        } else {
            return "Deputado_Estadual";
        }
    }

    public synchronized ArrayList<Candidato> recuperarCandidato() {
        ArrayList<Candidato> vetor = new ArrayList<>();
        Candidato c;
        String cpf, nome, cargo, partido, numero, quantVotos;

        try (BufferedReader leitor = Files.newBufferedReader(caminhoCandidato, utf8)) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] t = linha.split(token); // recuperando um linha
                cpf = t[0];
                nome = t[1];
                cargo = t[2];
                partido = t[3];
                numero = t[4];
                quantVotos = t[5];

                switch (cargo) {
                    case "Presidente":
                        c = new Presidente(cpf, nome, partido, numero);
                        c.setQuantVotos(Integer.parseInt(quantVotos));
                        vetor.add(c);
                        break;
                    case "Senador":
                        c = new Senador(cpf, nome, partido, numero);
                        c.setQuantVotos(Integer.parseInt(quantVotos));
                        vetor.add(c);
                        break;
                    case "Deputado_Federal":
                        c = new DeputadoFederal(cpf, nome, partido, numero);
                        c.setQuantVotos(Integer.parseInt(quantVotos));
                        vetor.add(c);
                        break;
                    case "Governador":
                        c = new Governador(cpf, nome, partido, numero);
                        c.setQuantVotos(Integer.parseInt(quantVotos));
                        vetor.add(c);
                        break;
                    default:
                        c = new DeputadoEstadual(cpf, nome, partido, numero);
                        c.setQuantVotos(Integer.parseInt(quantVotos));
                        vetor.add(c);
                        break;
                }

            }
        } catch (IOException ioe) {
            System.err.println("Erro no recuperar Eleitor");
        }
        return vetor;
    }

    public synchronized void armazenarVotoBranco(int[] vetor) {
        String[] gravar = new String[vetor.length];

        try (BufferedWriter escritor = Files.newBufferedWriter(caminhoVotoBranco, utf8)) {

            for (int i = 0; i < vetor.length; i++) {
                gravar[i] = String.valueOf(vetor[i]);
                escritor.write(gravar[i] + token);
            }
        } catch (IOException ioe) {
            System.err.println("Erro no armazenar Voto Branco");
        }
    }

    public synchronized void armazenarVotoNulo(int[] vetor) {
        String[] gravar = new String[vetor.length];

        try (BufferedWriter escritor = Files.newBufferedWriter(caminhoVotoNulo, utf8)) {

            for (int i = 0; i < vetor.length; i++) {
                gravar[i] = String.valueOf(vetor[i]);
                escritor.write(gravar[i] + token);
            }
        } catch (IOException ioe) {
            System.err.println("Erro no armazenar Voto Nulo");
        }
    }
    
    public synchronized int[] recuperarVotoBranco() {
        int[] vetor = new int[5];
        
        try (BufferedReader leitor = Files.newBufferedReader(caminhoVotoBranco, utf8)) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] t = linha.split(token); // recuperando um linha
                for (int i = 0; i < 5; i++) {
                    vetor[i] = Integer.parseInt(t[i]);
                }
            }
        } catch (IOException ioe) {
            System.err.println("Erro no recuperar Voto Branco");
        }
        return vetor;
    }
   

    public synchronized int[] recuperarVotoNulo() {
        int[] vetor = new int[5];
        
        try (BufferedReader leitor = Files.newBufferedReader(caminhoVotoNulo, utf8)) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] t = linha.split(token); // recuperando um linha
                for (int i = 0; i < 5; i++) {
                    vetor[i] = Integer.parseInt(t[i]);
                }
            }
        } catch (IOException ioe) {
            System.err.println("Erro no recuperar Voto Nulo");
        }
        return vetor;
    }
}
