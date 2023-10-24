package projetoeleitoral;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**

 * NÃO ESTÁ SENDO USADO
 */
public class Certificao {
    

//     public boolean addEleitores(ArrayList<String> e) {
    /* verifica se o CPF está no formato correto */
//        boolean var1 = cc.get(0).matches("\\d{9}.\\d{2}");
        // matches é uma espécie de formato. Ele recebe como parâmetro a formatação. Neste caso, \\d{9} exige que seja digitado 9 números
        // O ponto significa que pede um traço e o \\d{2} pede dois números.
    
//     boolean var1 = (cpf.length() == 0) || (nome.length() == 0) || (identidade.length() == 0)
//                || (titulo.length() == 0) || (zona.length() == 0) || (secao.length() == 0);
//
//        /* matches é regex ou expressão regular que valida valores.
//         Ele funciona semelhante ao equals. \\d{9} reconhece 9 números, \\d{2} reconhece 2 dígitos.*/
//        boolean var2 = nome.matches("\\w{3,}.*"); // lê regex para melhorar, pois não está reconhecendo espaço em branco.
//        boolean var3 = cpf.matches("\\d{9}.\\d{2}");
//        boolean var4 = identidade.matches("\\d{5}");
//        boolean var5 = titulo.matches("\\d{5}");
//        boolean var6 = zona.matches("\\d{3}");
//        boolean var7 = secao.matches("\\d{3}");
//
//        boolean var8 = true;
//        boolean var9 = true;
//        boolean var10 = true;
//
//        // recebe um cpf e verifica se ele já existe. Se sim, var8= true, se não, var8 = false;
//        for (Eleitor e : getEleitores()) {
//            System.out.println("e.getCpf = " + e.getCpf() + "  -  Cpf = " + cpf);
//            if (e.getCpf().equals(cpf)) {
//                nome1 = e.getNome();
//                var8 = false;
//            }
//        }
//
//        for (Eleitor e : getEleitores()) {
//            if (e.getIdentidade().equals(identidade)) {
//                nome1 = e.getNome();
//                identidade1 = e.getIdentidade();
//                var9 = false;
//            }
//        }
//
//        for (Eleitor e : getEleitores()) {
//            if (e.getTituloeleitoral().equals(titulo)) {
//                nome1 = e.getNome();
//                titulo1 = e.getTituloeleitoral();
//                var10 = false;
//            }
//        }
//
//        /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E O NOME CONTER MENOS DE TRÊS LETRAS */
//        if (var2 == false) {
//            JOptionPane.showMessageDialog(null, "O Nome deve conter no mínimo três letras");
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E O CPF NÃO ESTIVER NO FORMATO ESTABELECIDO*/
//        } else if (var3 == false) {
//            JOptionPane.showMessageDialog(null, "CPF inválido");
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE A IDENTIDADE NÃO ESTIVER NO FORMADO ESTABELECIDO */
//        } else if (var4 == false) {
//            JOptionPane.showMessageDialog(null, "Identidade inválida");
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE A TÍTULO NÃO ESTIVER NO FORMADO ESTABELECIDO */
//        } else if (var5 == false) {
//            JOptionPane.showMessageDialog(null, "Título inválido");
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE A ZONA ELEITORAL NÃO ESTIVER NO FORMADO ESTABELECIDO */
//        } else if (var6 == false) {
//            JOptionPane.showMessageDialog(null, "Zona Eleitoral inválida");
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE A SEÇÃO ELEITORAL NÃO ESTIVER NO FORMADO ESTABELECIDO */
//        } else if (var7 == false) {
//            JOptionPane.showMessageDialog(null, "Seção Eleitoral inválida");
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE O CPF JÁ ESTIVER SIDO CADASTRADO */
//        } else if ((var3 == true) && (var8 == false)) {
//            JOptionPane.showMessageDialog(null, "O CPF " + cpf + " já está cadastrado no nome de " + nome1);
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE O IDENTIDADE JÁ ESTIVER SIDO CADASTRADO */
//        } else if ((var3 == true) && (var9 == false)) {
//            JOptionPane.showMessageDialog(null, "A identidade " + identidade + " já está cadastrado no nome de " + nome1);
//
//            /* SE NÃO HÁ CAMPOS NO CADASTRO EM BRANCO E SE O TÍTULO JÁ ESTIVER SIDO CADASTRADO */
//        } else if ((var3 == true) && (var10 == false)) {
//            JOptionPane.showMessageDialog(null, "O Titulo Eleitoral " + titulo + " já está cadastrado no nome de " + nome1);
//
//            /* SE TUDO ESTIVER OK */
//        } else if ((var3 == true) && (var8 == true) && (var9 == true) && (var10 == true)) {

//}
    
//     public boolean addCandidato(ArrayList<String> cc) {
//    
//        boolean ret = false;
//
//        /* Solicitando do usuários novos dados de objetos tipo Eleitor para serem gravados */
//        String cpf, cargo, nome, partido, numero;
//
//        boolean serCandidato = false;
//
//        /* verifica se o CPF está no formato correto */
//        // matches é uma espécie de formato. Ele recebe como parâmetro a formatação. Neste caso, \\d{9} exige que seja digitado 9 números
//        // O ponto significa que pede um traço e o \\d{2} pede dois números.
//        boolean var1 = cc.get(0).matches("\\d{9}.\\d{2}");
//
//        /* método verificar se o Eleitor deste CPF já é candidato a algum cargo */
//        for (Eleitor e : eleitores) {
//            if ((e.getCpf().equals(cc.get(0))) && (e.getSerCandidato().equals("Sim"))) {
//                serCandidato = true;
//                break;
//            }
//        }
//
//        cpf = cc.get(0);
//        nome = cc.get(1);
//        cargo = cc.get(2);
//        partido = cc.get(3);
//        numero = cc.get(4);
//
//        /* verificando as hipóteses de CPF ser válido e o Eleitor não ser candidato */
//        if (var1 == false) {
//            JOptionPane.showMessageDialog(null, "CPF INVÁLIDO.");
//            if (serCandidato == true) {
//                JOptionPane.showMessageDialog(null, "JÁ EXISTE UMA CANDIDATURA REGISTRADA COM ESTE CPF.");
//            }
//        } else if (serCandidato == false) {
//
//            /* Selecionando qual o cargo e adicionando o objeto correspondente ao ArrayList candidatos */
//            switch (Integer.parseInt(cargo)) {
//
//                case 1:
//                    /* verifica se o numero do candidato a Presidente está no formato correto.
//                     * Este método se repete para os demais cargo.
//                     */
//                    boolean var2 = numero.matches("\\d{2}");
//
//                    /* verifica se já existe candidato a Presidente registrado com o mesmo número.
//                     * Este método se repete para os demais cargo.
//                     */
//                    boolean var3 = false;
//
//                    for (Candidato c : getCandidatos()) {
//                        if (c instanceof Presidente) {
//                            if (c.getNumero().equals(numero)) {
//                                var3 = true;
//                            }
//                        }
//                    }
//                    /* verificando as hipóteses do número ser válido e de não haver nenhum candidato
//                     * já registrado com o mesmo número.
//                     * Este método se repete para os demais cargo.
//                     */
//                    if (var2 == false) {
//
//                        JOptionPane.showMessageDialog(null, "NÚMERO INVÁLIDO.");
//
//                    } else if (var3 == true) {
//
//                        JOptionPane.showMessageDialog(null, "JÁ EXISTE CANDIDATO REGISTRADO COM ESSE NÚMERO.");
//
//                    } else if ((var2 == true) && (var3 == false)) {
//
//                        /* add é um método que serve para adicionar um objeto a um ArrayList. */
//                        presidente1 = new Presidente(cpf, nome, partido, numero);
//                        this.addCandidato(presidente1);
//                        this.gravarCandidato2();
//                        this.recuperarCandidato2();
//                        JOptionPane.showMessageDialog(null, "CANDIDATO GRAVADO COM SUCESSO.");
//                        break;
//                    }
//                case 2:
//                    boolean var4 = numero.matches("\\d{3}");
//                    boolean var5 = false;
//
//                    for (Candidato c : getCandidatos()) {
//                        if (c instanceof Senador) {
//                            if (c.getNumero().equals(numero)) {
//                                var4 = true;
//                            }
//                        }
//                    }
//
//                    if (var4 == false) {
//
//                        JOptionPane.showMessageDialog(null, "NÚMERO INVÁLIDO.");
//
//                    } else if (var5 == true) {
//
//                        JOptionPane.showMessageDialog(null, "JÁ EXISTE CANDIDATO REGISTRADO COM ESSE NÚMERO.");
//
//                    } else if ((var4 == true) && (var5 == false)) {
//
//                        senador1 = new Senador(cpf, nome, partido, numero);
//                        this.addCandidato(senador1);
//                        this.gravarCandidato2();
//                        this.recuperarCandidato2();
//                        JOptionPane.showMessageDialog(null, "CANDIDATO GRAVADO COM SUCESSO.");
//                        break;
//                    }
//                case 3:
//                    boolean var6 = numero.matches("\\d{4}");
//                    boolean var7 = false;
//
//                    for (Candidato c : getCandidatos()) {
//                        if (c instanceof DeputadoFederal) {
//                            if (c.getNumero().equals(numero)) {
//                                var7 = true;
//                            }
//                        }
//                    }
//
//                    if (var6 == false) {
//
//                        JOptionPane.showMessageDialog(null, "NÚMERO INVÁLIDO.");
//
//                    } else if (var7 == true) {
//
//                        JOptionPane.showMessageDialog(null, "JÁ EXISTE CANDIDATO REGISTRADO COM ESSE NÚMERO.");
//
//                    } else if ((var6 == true) && (var7 == false)) {
//                        deputadoFederal1 = new DeputadoFederal(cpf, nome, partido, numero);
//                        this.addCandidato(deputadoFederal1);
//                        this.gravarCandidato2();
//                        this.recuperarCandidato2();
//                        JOptionPane.showMessageDialog(null, "CANDIDATO GRAVADO COM SUCESSO.");
//                        break;
//                    }
//                case 4:
//                    boolean var8 = numero.matches("\\d{2}");
//                    boolean var9 = false;
//
//                    for (Candidato c : getCandidatos()) {
//                        if (c instanceof Governador) {
//                            if (c.getNumero().equals(numero)) {
//                                var9 = true;
//                            }
//                        }
//                    }
//
//                    if (var8 == false) {
//
//                        JOptionPane.showMessageDialog(null, "NÚMERO INVÁLIDO.");
//
//                    } else if (var9 == true) {
//
//                        JOptionPane.showMessageDialog(null, "JÁ EXISTE CANDIDATO REGISTRADO COM ESSE NÚMERO.");
//
//                    } else if ((var8 == true) && (var9 == false)) {
//
//                        governador1 = new Governador(cpf, nome, partido, numero);
//                        this.addCandidato(governador1);
//                        this.gravarCandidato2();
//                        this.recuperarCandidato2();
//                        JOptionPane.showMessageDialog(null, "CANDIDATO GRAVADO COM SUCESSO.");
//                        break;
//                    }
//                case 5:
//                    boolean var10 = numero.matches("\\d{5}");
//                    boolean var11 = false;
//
//                    for (Candidato c : getCandidatos()) {
//                        if (c instanceof DeputadoEstadual) {
//                            if (c.getNumero().equals(numero)) {
//                                var11 = true;
//                            }
//                        }
//                    }
//
//                    if (var10 == false) {
//
//                        JOptionPane.showMessageDialog(null, "NÚMERO INVÁLIDO.");
//
//                    } else if (var11 == true) {
//
//                        JOptionPane.showMessageDialog(null, "JÁ EXISTE CANDIDATO REGISTRADO COM ESSE NÚMERO.");
//
//                    } else if ((var10 == true) && (var11 == false)) {
//
//                        deputadoEstadual1 = new DeputadoEstadual(cpf, nome, partido, numero);
//                        this.addCandidato(deputadoEstadual1);
//                        this.gravarCandidato2();
//                        this.recuperarCandidato2();
//                        JOptionPane.showMessageDialog(null, "CANDIDATO GRAVADO COM SUCESSO.");
//                        break;
//                    }
//                default:
//
//            }
//        }
//
//        // PARA GRAVAR A MUDANÇA DE STATUS DO ELEITOR QUE AGORA TAMBÉM É CANDIDATO
//        this.MudaCandidato(cpf);
//
//        return ret;
//    }

    
    
    
    // para o botão gravar de Urna
    
//    for (int i = 0; i < contador; i++) {
//                if (votacao[i] == 0) {
//                    votacao[i]++;
//                } else if (votacao[i] == 1) {
//                    votacao[i]++;
//                } else {
//                    for (Candidato ca : candidatos1) {
//                        if ((ca instanceof Presidente) && (ca.getNumero().equals(num1))) {
//                            ca.computaVoto();
//                        }
//                        if ((ca instanceof Senador) && (ca.getNumero().equals(num1))) {
//                            ca.computaVoto();
//                        }
//                        if ((ca instanceof DeputadoFederal) && (ca.getNumero().equals(num1))) {
//                            ca.computaVoto();
//                        }
//                        if ((ca instanceof Governador) && (ca.getNumero().equals(num1))) {
//                            ca.computaVoto();
//                        }
//                        if ((ca instanceof DeputadoEstadual) && (ca.getNumero().equals(num1))) {
//                            ca.computaVoto();
//                        }
//                    }
//                }
//            }
//        }
    
    
}
