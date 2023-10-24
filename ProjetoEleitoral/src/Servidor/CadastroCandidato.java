package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import projetoeleitoral.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Alberto
 */
public class CadastroCandidato extends javax.swing.JFrame {

    private ArrayList<Eleitor> eleit;
    private ArrayList<Candidato> cand;
    private ArrayList<String> c = new ArrayList<>();
    Cliente1 tt;

    String arquivo0 = "src/Arquivos/eleitor1.txt", arquivo1 = "src/Arquivos/candidatos1.txt";
    Path caminhoEleitor = Paths.get(arquivo0);
    Path caminhoCandidato = Paths.get(arquivo1);
    Charset utf8 = StandardCharsets.UTF_8;
    String token = ";";

    public CadastroCandidato() {
        initComponents();
        tt = new Cliente1();
        eleit = this.recuperarEleitor();
        cand = this.recuperarCandidato();
        this.jTextAreaExibir.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCPF = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        jComboBoxPartido = new javax.swing.JComboBox();
        jLabelNome = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        jLabelGeral = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox();
        jButtonGravar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelCargo = new javax.swing.JLabel();
        jLabelPartido = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();
        jComboBoxListar = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaExibir = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCPF.setText("CPF:");

        tfCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfActionPerformed(evt);
            }
        });
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCpfKeyReleased(evt);
            }
        });

        jComboBoxPartido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o Partido:", "PP", "PT", "PL", "PMDB", "PDT", "PSDB" }));
        jComboBoxPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPartidoActionPerformed(evt);
            }
        });

        jLabelNome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumero.setText("Número:");

        tfNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelGeral.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelGeral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGeral.setText("CADASTRO DE CANDIDATOS");

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha a opção:", "Presidente", "Senador", "Deputado Federal", "Governador", "Deputado Estadual" }));
        jComboBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoActionPerformed(evt);
            }
        });

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonSair.setText("Voltar");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCargo.setText("Cargo:");

        jLabelPartido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPartido.setText("Partido:");

        jLabelNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome1.setText("Nome:");

        jComboBoxListar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Listar Candidatos a:", "Presidente", "Senador", "Deputado Federal", "Governador", "Deputado Estadual", "Todos" }));
        jComboBoxListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListarActionPerformed(evt);
            }
        });

        jTextAreaExibir.setColumns(20);
        jTextAreaExibir.setRows(5);
        jScrollPane1.setViewportView(jTextAreaExibir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxCargo, 0, 138, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPartido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSair)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jComboBoxListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBoxPartido.getAccessibleContext().setAccessibleName("Partido");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPartidoActionPerformed

    }//GEN-LAST:event_jComboBoxPartidoActionPerformed

    private void jComboBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoActionPerformed

    }//GEN-LAST:event_jComboBoxCargoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

        this.limpar();

    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        tt.setVoltar(true);
        jTextAreaExibir.setText("");
        jTextAreaExibir.setVisible(false);
        this.dispose(); // Serve para sair de uma janela atual.

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        /* Solicitando do usuários novos dados de objetos tipo Eleitor para serem gravados */
        String cpf, cargo, nome, partido, numero;

        /* verifica se o CPF está no formato correto */
        boolean var1 = this.tfCpf.getText().matches("\\d{9}.\\d{2}");
        // matches é uma espécie de formato. Ele recebe como parâmetro a formatação. Neste caso, \\d{9} exige que seja digitado 9 números
        // O ponto significa que pede um traço e o \\d{2} pede dois números.

        cpf = tfCpf.getText();
        nome = jLabelNome.getText();
        cargo = String.valueOf(jComboBoxCargo.getSelectedIndex());
        partido = String.valueOf(jComboBoxPartido.getSelectedItem());
        numero = tfNumero.getText();

        // getSelectedItem retorna um número, que corresponde so item selecionado.
        // A conversão explícita (casting) vai transformar o item selecionado na String correspondente a ela.
        c.add(cpf);
        c.add(nome);
        c.add(cargo);
        c.add(partido);
        c.add(numero);

        tt.setCandidato(c);
        tt.setEnviarCandidato(true);
        this.limpar();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonGravarActionPerformed

    // método para colocar o nome do candidato (que também é eleitor) na label correspondente assim que digita o cpf.
    private void tfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyReleased
        this.atualizarEleitor();
        String cpf = tfCpf.getText();
        boolean var1 = this.tfCpf.getText().matches("\\d{9}.\\d{2}");

        if (var1 == true) {
            for (Eleitor eleitore1 : eleit) {
                if (eleitore1.getCpf().equals(cpf)) {
                    jLabelNome.setText(eleitore1.getNome());
                    jTextAreaExibir.setText(String.valueOf(jComboBoxPartido.getSelectedItem()));
                    break;
                }
            }
        } else {
            jLabelNome.setText("");
        }


    }//GEN-LAST:event_tfCpfKeyReleased

    private void jComboBoxListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListarActionPerformed

        int opcao = jComboBoxListar.getSelectedIndex();

        switch (opcao) {
            case 1:
                this.OrganizarExibir("Presidente");
                break;
            case 2:
                this.OrganizarExibir("Senador");
                break;
            case 3:
                this.OrganizarExibir("Deputado Federal");
                break;
            case 4:
                this.OrganizarExibir("Governador");
                break;
            case 5:
                this.OrganizarExibir("Deputado Estadual");
                break;
            case 6:
                this.OrganizarExibir("Todos");
//                this.aux("Todos");
//                for (Candidato c : cand) {
//                    jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
//                }
                break;

            default:
        }

        this.jComboBoxListar.setSelectedIndex(0);

    }//GEN-LAST:event_jComboBoxListarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        jTextAreaExibir.setText("");
        jTextAreaExibir.setVisible(false);
        String cpf = tfCpf.getText();

        tt.setCpfC(cpf);
        tt.setEnviarCandidato(true);
        tfCpf.setText("");
        jTextAreaExibir.setVisible(false);
        jTextAreaExibir.setText("");
        this.dispose();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfActionPerformed

//    public String tipo(Candidato c) {
//        if (c instanceof Presidente) {
//            return "Presidente";
//        } else if (c instanceof Senador) {
//            return "Senador";
//        } else if (c instanceof DeputadoFederal) {
//            return "DeputadoFederal";
//        } else if (c instanceof Governador) {
//            return "Governador";
//        } else {
//            return "DeputadoEstadual";
//        }
//    }
    public void OrganizarExibir(String c1) {
        this.limpar();
        this.atualizarCandidato();

        this.aux(c1);

        for (Candidato c : cand) {
            switch (c1) {
                case "Presidente":
                    if (c instanceof Presidente) {
                        jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
                    }
                    break;
                case "Senador":
                    if (c instanceof Senador) {
                        jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
                    }
                    break;
                case "Deputado Federal":
                    if (c instanceof DeputadoFederal) {
                        jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
                    }
                    break;
                case "Governador":
                    if (c instanceof Governador) {
                        jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
                    }
                    break;
                case "Deputado Estadual":
                    if (c instanceof DeputadoEstadual) {
                        jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
                    }
                    break;
                case "Todos":
                    jTextAreaExibir.append(c.exibeCandidatos1() + "\n");
                    break;
            }
        }
    }

    private void atualizarEleitor() {
        this.eleit = this.recuperarEleitor();
    }

    private void atualizarCandidato() {
        this.cand = this.recuperarCandidato();
    }

    public void limpar() {
        tfCpf.setText("");
        jLabelNome.setText("");
        tfNumero.setText("");
        jComboBoxCargo.setSelectedIndex(0); // Serve para limpar a caixa de combinação.
        jComboBoxPartido.setSelectedIndex(0);
        jComboBoxListar.setSelectedItem(0);

        jTextAreaExibir.setText("");
        jTextAreaExibir.setVisible(false);
    }

    private void aux(String cargo) {

        jTextAreaExibir.setText("");
        jTextAreaExibir.setVisible(true);
        jTextAreaExibir.setText("Candidatos a " + cargo + ":\n\n");
        jTextAreaExibir.append("CPF \t| " + "Nome \t\t\t| " + "Partido \t| " + "Numero\n");
        jTextAreaExibir.append("---------------------\t|------------------------------------------"
                + "----------------------\t|" + "---------------------\t|---------------\n");
    }

     public ArrayList<Eleitor> recuperarEleitor() {
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
     
    public ArrayList<Candidato> recuperarCandidato() {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxCargo;
    private javax.swing.JComboBox jComboBoxListar;
    private javax.swing.JComboBox jComboBoxPartido;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelGeral;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPartido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaExibir;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
