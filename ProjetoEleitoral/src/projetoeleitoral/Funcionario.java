package projetoeleitoral;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

/**

 */
public class Funcionario extends javax.swing.JFrame {

    CadastroEleitor cadEle;
    CadastroCandidato cadCan;
    Relatorio rel;
    Principal p;
    private  ArrayList<Candidato> candidatos1;
    private  ArrayList<Eleitor> eleitores1;
    private int votacao[] = new int[5];
    int n = 700, m = 100;// para definir a localização das janelas

    public Funcionario(Principal pp) {
        initComponents();
        this.p = pp;
        this.eleitores1 = p.getEleitores();
        this.candidatos1 = p.getCandidatos();
        cadEle = new CadastroEleitor(p, this);
        cadCan = new CadastroCandidato(p);
        rel = new Relatorio(p);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButton_CadastroCandidato = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        jButton_Relatorio = new javax.swing.JButton();
        jButton_CadastroEleitor = new javax.swing.JButton();
        jLabel_Brasao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane2.setMaximumSize(new java.awt.Dimension(500, 550));
        jDesktopPane2.setPreferredSize(new java.awt.Dimension(500, 550));

        jButton_CadastroCandidato.setText("Cadastro Candidato");
        jButton_CadastroCandidato.setMaximumSize(new java.awt.Dimension(150, 30));
        jButton_CadastroCandidato.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton_CadastroCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastroCandidatoActionPerformed(evt);
            }
        });

        jButton_Sair.setText("Sair");
        jButton_Sair.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jButton_Relatorio.setText("Relatórios");
        jButton_Relatorio.setMaximumSize(new java.awt.Dimension(150, 30));
        jButton_Relatorio.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton_Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RelatorioActionPerformed(evt);
            }
        });

        jButton_CadastroEleitor.setText("Cadastro Eleitor");
        jButton_CadastroEleitor.setMaximumSize(new java.awt.Dimension(150, 30));
        jButton_CadastroEleitor.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton_CadastroEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastroEleitorActionPerformed(evt);
            }
        });

        jLabel_Brasao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoeleitoral/brasaorepublica.gif"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton_CadastroEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_CadastroCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel_Brasao)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jLabel_Brasao, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CadastroEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_CadastroCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jDesktopPane2.setLayer(jButton_CadastroCandidato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_Sair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_Relatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton_CadastroEleitor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel_Brasao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CadastroEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastroEleitorActionPerformed
        cadEle.setVisible(true);
        cadEle.setLocation(n, m);
        cadCan.setVisible(false);
        rel.setVisible(false);

    }//GEN-LAST:event_jButton_CadastroEleitorActionPerformed

    private void jButton_CadastroCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastroCandidatoActionPerformed
        cadCan.setVisible(true);
        cadCan.setLocation(n, m);
        cadEle.setVisible(false);
        rel.setVisible(false);


    }//GEN-LAST:event_jButton_CadastroCandidatoActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jButton_RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RelatorioActionPerformed
//        rel = new Relatorio1(candidatos1, eleitores1, VotoBranco, VotoNulo);
        rel.setVisible(true);
        rel.setLocation(n, m);
        cadEle.setVisible(false);
        cadCan.setVisible(false);
    }//GEN-LAST:event_jButton_RelatorioActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//        this.jButtonSairActionPerformed(null);
    }//GEN-LAST:event_formWindowClosed
   
//    public ArrayList<Eleitor> atualizar() {
//        this.eleitores1 = p.getEleitores();
//        return eleitores1;
//    }

    public void windowClosing(WindowEvent e) {
        this.jButton_SairActionPerformed(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CadastroCandidato;
    private javax.swing.JButton jButton_CadastroEleitor;
    private javax.swing.JButton jButton_Relatorio;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel_Brasao;
    // End of variables declaration//GEN-END:variables
}
