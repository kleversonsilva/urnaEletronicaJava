package projetoeleitoral;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *

 */
public class InicioVotar extends javax.swing.JFrame {

    Urna urna;
    Principal p;
    private ArrayList<Eleitor> eleitores;

    /**
     * Creates new form InicioaVotar
     */
    public InicioVotar(Principal p) {

        initComponents();
        this.p = p;
        eleitores = p.getEleitores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        tfCpf = new javax.swing.JTextField();
        jBOK = new javax.swing.JButton();
        jLabelNome = new java.awt.Label();
        label4 = new java.awt.Label();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(550, 300));

        label1.setName(""); // NOI18N
        label1.setText("Nome");

        label2.setText("CPF");

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

        jBOK.setText("OK");
        jBOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOKActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Iniciar Votação");

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(tfCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addGap(60, 60, 60))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jBOK, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jButtonVoltar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCpf)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(label1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(label2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBOK, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelNome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelNome.getAccessibleContext().setAccessibleDescription("");
        jDesktopPane1.setLayer(label4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfActionPerformed

    private void jBOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOKActionPerformed
        if(p.mudaComparecimento(tfCpf.getText())){
//            // Chamando a Urna
            urna = new Urna(p);// Instanciando um objeto da classe UrnaCopia.
            urna.setVisible(true);
            urna.setLocation(600, 100);
            this.dispose();
        }

      
       

    }//GEN-LAST:event_jBOKActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void tfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyReleased
        String cpf = tfCpf.getText();
        boolean var1 = this.tfCpf.getText().matches("\\d{9}.\\d{2}");

        if (var1 == true) {
            for (Eleitor eleitore1 : eleitores) {

                if (eleitore1.getCpf().equals(cpf)) {
                    jLabelNome.setText(eleitore1.getNome());
                    break;
                }
            }
        } else {
            jLabelNome.setText("");
        }
    }//GEN-LAST:event_tfCpfKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOK;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private java.awt.Label jLabelNome;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private javax.swing.JTextField tfCpf;
    // End of variables declaration//GEN-END:variables
}
