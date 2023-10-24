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

/**
 *
 * @author Carlos Alberto
 */
public class CadastroEleitor extends javax.swing.JFrame {

    private ArrayList<Eleitor> eleitores1;
    private ArrayList<String> e = new ArrayList<>();
    private Cliente1 tt;

    String arquivo0 = "src/Arquivos/eleitor1.txt";
    Path caminhoEleitor = Paths.get(arquivo0);
    Charset utf8 = StandardCharsets.UTF_8;
    String token = ";";

    public CadastroEleitor() {

        initComponents();
        tt = new Cliente1();
        this.eleitores1 = this.recuperarEleitor();
        jTextAreaExibir.setVisible(false);
        jTextAreaExibir.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Nome = new javax.swing.JLabel();
        jLabel_Identidade = new javax.swing.JLabel();
        jLabel_CPF = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Zona = new javax.swing.JLabel();
        jLabel_Secao = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfIdentidade = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        tfZona = new javax.swing.JTextField();
        tfSecao = new javax.swing.JTextField();
        ButtonVoltar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonGravar = new javax.swing.JButton();
        jLabel_Principal = new javax.swing.JLabel();
        ButtonListar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaExibir = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Nome.setText("Nome:");

        jLabel_Identidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Identidade.setText("Identidade:");

        jLabel_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_CPF.setText("CPF:");

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Titulo.setText("Título Eleitoral:");

        jLabel_Zona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Zona.setText("Zona Eleitoral:");

        jLabel_Secao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Secao.setText("Seção Eleitoral:");

        tfCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfIdentidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfIdentidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfIdentidade.setAutoscrolls(false);
        tfIdentidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tfTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfZona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfZona.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfSecao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSecao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSecaoActionPerformed(evt);
            }
        });

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        ButtonVoltar.setPreferredSize(new java.awt.Dimension(40, 20));
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        ButtonLimpar.setText("Limpar");
        ButtonLimpar.setBorder(new javax.swing.border.MatteBorder(null));
        ButtonLimpar.setPreferredSize(new java.awt.Dimension(40, 20));
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        ButtonGravar.setText("Gravar");
        ButtonGravar.setBorder(new javax.swing.border.MatteBorder(null));
        ButtonGravar.setPreferredSize(new java.awt.Dimension(40, 20));
        ButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGravarActionPerformed(evt);
            }
        });

        jLabel_Principal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Principal.setText("CADASTRO DE ELEITOR");

        ButtonListar.setText("Listar");
        ButtonListar.setBorder(new javax.swing.border.MatteBorder(null));
        ButtonListar.setPreferredSize(new java.awt.Dimension(40, 20));
        ButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.setPreferredSize(new java.awt.Dimension(40, 20));
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jTextAreaExibir.setColumns(20);
        jTextAreaExibir.setRows(5);
        jScrollPane1.setViewportView(jTextAreaExibir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfZona, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Identidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Secao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(ButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(ButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdentidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Identidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfZona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Secao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        this.limparDados();
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGravarActionPerformed
        /* Solicitando do usuários novos dados de objetos tipo Eleitor para serem gravados */
        String nome, identidade, cpf, titulo, zona, secao;

        cpf = tfCpf.getText();
        nome = tfNome.getText();
        identidade = tfIdentidade.getText();
        titulo = tfTitulo.getText();
        zona = tfZona.getText();
        secao = tfSecao.getText();

        String complemento = "";
        if (nome.length() < 55) {
            for (int i = 0; i < 55 - nome.length(); i++) {
                complemento += " ";
            }
        }

        nome = nome + complemento;

        nome.toUpperCase();

        e.add(cpf);
        e.add(nome);
        e.add(identidade);
        e.add(titulo);
        e.add(zona);
        e.add(secao);

        tt.setEleitor(e);
        tt.setEnviarEleitor(true);

        this.limparDados();
        e.clear();
       this.dispose();
//        this.setVisible(false);
    }//GEN-LAST:event_ButtonGravarActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        /* Fecha a tela atual */
        this.limparDados();
         tt.setEnviarEleitor(true);
         tt.setVoltar(true);
        this.dispose();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void tfSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSecaoActionPerformed

    }//GEN-LAST:event_tfSecaoActionPerformed

    private void ButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListarActionPerformed
        // Primeito atualiza os dados.
        this.atualizar();

        jTextAreaExibir.setVisible(true);
        jTextAreaExibir.setText("");

        jTextAreaExibir.setText("Todos os Eleitores:\n\n");
        jTextAreaExibir.append("CPF \t| " + "Nome \t\t\t| " + "Identidade \t| " + "Titulo \t| "
                + "Zona \t| " + "Seção \t| " + "Votou \t| " + "Candidato\n");
        jTextAreaExibir.append("---------------------\t|----------------------------------------------------------------\t|"
                + "---------------------\t|---------------------\t|---------------------\t|"
                + "---------------------\t|---------------------\t|---------------\n");

        for (Eleitor e : eleitores1) {
            jTextAreaExibir.append(e.exibeEleitor1() + "\n");
        }
    }//GEN-LAST:event_ButtonListarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        this.atualizar();
        String cpf = tfCpf.getText();

        tt.setCpfE(cpf);
        tt.setEnviarEleitor(true);

        this.limparDados();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed

    }//GEN-LAST:event_tfNomeActionPerformed

    private void atualizar() {
        this.eleitores1 = this.recuperarEleitor();
    }

    public void limparDados() {
        tfNome.setText("");
        tfIdentidade.setText("");
        tfCpf.setText("");
        tfTitulo.setText("");
        tfZona.setText("");
        tfSecao.setText("");
        jTextAreaExibir.setVisible(false);
        jTextAreaExibir.setText("");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGravar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonListar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel_CPF;
    private javax.swing.JLabel jLabel_Identidade;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Principal;
    private javax.swing.JLabel jLabel_Secao;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Zona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaExibir;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfIdentidade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSecao;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfZona;
    // End of variables declaration//GEN-END:variables

}
