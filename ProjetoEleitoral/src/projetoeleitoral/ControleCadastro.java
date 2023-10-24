package projetoeleitoral;

/**
 *

 * NÃO ESTA SENDO USADA
 */
import java.io.DataInputStream; // DataInputStream é usado para ler dados que foram escritos por um DataOutputStream.
// Se o System.in for o teclado, não é muito correto usar o DataInputStream pois esse somente deveria ser usado para ler dados escritos pelo DataOutputStream.
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

// Stream são fluxos de dados (I/O), agrupados em bytes (8 bits) - ByteStream. É um objeto que entrega dados a um destino ou
// recebe dados de uma fonte. Ele age como buffer entre a fonte de dados e o destino.
// Em Java, basicamente, há dois formatos possíveis para gravar dados em arquivos.
// * Serialização : um arquivo vai guardar uma fila de objetos serializados.
// Quando há necessidade de recuperar o objeto a partir do arquivo, ele é inflado e enviado a memória automaticamente.
// O fluxo é baseado em bytes, uma sequência de dados armazenando seus valores em formato binário.
// * Texto/Caracteres : Um arquivo irá guardar uma cadeia de caracteres.
// Neste processo, o programador cria seu formato pessoal de armazenamento e pode compreendê-lo.
// Usa-se, geralmente, algum delimitador para materializar este formato.
// O fluxo é baseado em caracteres onde cada um dos caracteres é armazenado utilizando o valor unicode dele.
// InputStream : classe abstrata que lê fluxos binários de informação.
// OutputStream : classe abstrata que escreve fluxos binários de informação.
// Reader : classe abstrata que lê fluxos de texto.
// Writer : classe abstrata que escreve fluxos de texto.
// FileWriter : saída de caracteres.
// FileReader : entrada de caracteres.
public class ControleCadastro {
    
    ControleCadastro() {
        
    }
    
    public void armazenarEleitor(String arq, ArrayList<Eleitor> eleitores) {
        String arquivo = arq;
        DataOutputStream c = null;
        try {
            c = new DataOutputStream(new FileOutputStream(new File(arquivo), false)); // Instanciando um objeto da classe DataOutputStream.
            // new File, neste caso, define operações sobre arquivos.

            for (Eleitor eleitor1 : eleitores) {
                c.writeUTF(eleitor1.getCpf()); // writerUTF converte para bytes em formato especial, que contém no início um pequeno cabeçalho com a quntidade de bytes que aquela String vai ocupar.
                c.writeUTF(eleitor1.getNome());
                c.writeUTF(eleitor1.getIdentidade());
                c.writeUTF(eleitor1.getTituloeleitoral());
                c.writeUTF(eleitor1.getZonaeleitoral());
                c.writeUTF(eleitor1.getSecao());
                c.writeUTF(eleitor1.getComparecimento());
                c.writeUTF(eleitor1.getSerCandidato());
                
                c.writeChars("\n");
            }
            c.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    
    public void recuperarEleitor(String arq, ArrayList<Eleitor> e) throws IOException {
        String arquivo = arq;
        ArrayList<Eleitor> eleitores = e;
        DataInputStream in = null;
        try {
            in = new DataInputStream(new FileInputStream(new File(arquivo)));
            String cpf, id, nome, sec, tit, zona;
            Eleitor eleitor1;
            String comp, ser;
            while (true) {
                cpf = in.readUTF();
                nome = in.readUTF();
                id = in.readUTF();
                tit = in.readUTF();
                zona = in.readUTF();
                sec = in.readUTF();
                comp = in.readUTF();
                ser = in.readUTF();
                eleitor1 = new Eleitor(cpf, nome, id, tit, zona, sec);
                eleitor1.setComparecimento(comp);
                eleitor1.setSerCandidato(ser);
                eleitores.add(eleitor1);
            }
            
        } catch (EOFException eof) {
            in.close();
            
        } catch (FileNotFoundException ex) {
            
        }
        
    }
    
    public void armazenarCandidato(String arq, ArrayList<Candidato> candidatos) {
        
        String arquivo1 = arq;
        DataOutputStream c = null;
        try {
            c = new DataOutputStream(new FileOutputStream(new File(arquivo1), false));
            for (Candidato candidato1 : candidatos) {
                
                c.writeUTF(tipo(candidato1));
                c.writeUTF(candidato1.getCpf());
                c.writeUTF(candidato1.getNome());
                c.writeUTF(candidato1.getPartido());
                c.writeUTF(candidato1.getNumero());
                c.writeInt(candidato1.getQuantVotos());
            }
            
            c.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    
    public void recuperarCandidato(String arq, ArrayList<Candidato> c) throws IOException {
        String arquivo1 = arq;
        ArrayList<Candidato> candidatos = c;
        DataInputStream in = null;
        
        try {
            in = new DataInputStream(new FileInputStream(new File(arquivo1)));
            String cargo, cpf, nome, partido, numero;
            int quantVotos;
            
            Candidato candidato1;
            
            while (true) {
                cargo = in.readUTF();
                cpf = in.readUTF();
                nome = in.readUTF();
                partido = in.readUTF();
                numero = in.readUTF();
                quantVotos = in.readInt();
                
                switch (cargo) {
                    case "Presidente":
                        candidato1 = new Presidente(cpf, nome, partido, numero);
                        candidato1.setQuantVotos(quantVotos);
                        candidatos.add(candidato1);
                        break;
                    case "Senador":
                        candidato1 = new Senador(cpf, nome, partido, numero);
                        candidato1.setQuantVotos(quantVotos);
                        candidatos.add(candidato1);
                        break;
                    case "DeputadoFederal":
                        candidato1 = new DeputadoFederal(cpf, nome, partido, numero);
                        candidato1.setQuantVotos(quantVotos);
                        candidatos.add(candidato1);
                        break;
                    case "Governador":
                        candidato1 = new Governador(cpf, nome, partido, numero);
                        candidato1.setQuantVotos(quantVotos);
                        candidatos.add(candidato1);
                        break;
                    default:
                        candidato1 = new DeputadoEstadual(cpf, nome, partido, numero);
                        candidato1.setQuantVotos(quantVotos);
                        candidatos.add(candidato1);
                        break;
                }
            }
        } catch (EOFException eof) {
            in.close();
            
        } catch (FileNotFoundException ex) {
            
        }
        
    }
    
    public String tipo(Candidato c) {
        if (c instanceof Presidente) {
            return "Presidente";
        } else if (c instanceof Senador) {
            return "Senador";
        } else if (c instanceof DeputadoFederal) {
            return "DeputadoFederal";
        } else if (c instanceof Governador) {
            return "Governador";
        } else {
            return "DeputadoEstadual";
        }
    }
    
    public void armazenarVotoBranco(String arq, int[] vB, int[] vN) {
        String arquivo2 = arq;
        DataOutputStream c = null;
        try {
            c = new DataOutputStream(new FileOutputStream(new File(arquivo2), false)); // Instanciando um objeto da classe DataOutputStream.
            // new File, neste caso, define operações sobre arquivos.

            for (int i = 0; i < vB.length; ++i) {
                
                c.writeInt(vB[i]);
            }
            
            for (int z = 0; z < vN.length; ++z) {
                
                c.writeInt(vN[z]);
                
            }
            c.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    
    public void recuperarVotoBranco(String arq, int[] vB, int[] vN) throws IOException {
        String arquivo2 = arq;
        int[] votoBranco = vB;
        int[] votoNulo = vN;
        
        DataInputStream in = null;
        try {
            in = new DataInputStream(new FileInputStream(new File(arquivo2)));
            
            for (int i = 0; i < votoBranco.length; i++) {
                vB[i] = in.readInt();
            }
            for (int i = 0; i < votoNulo.length; i++) {
                vN[i] = in.readInt();
            }
            
        } catch (EOFException eof) {
            in.close();
            
        } catch (FileNotFoundException ex) {
            
        }
        
    }
    
}
