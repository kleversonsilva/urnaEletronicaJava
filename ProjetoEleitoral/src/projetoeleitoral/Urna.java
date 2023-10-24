package projetoeleitoral;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**

 */
public class Urna extends javax.swing.JFrame {

    private ArrayList<Candidato> candidatos1;
    private ArrayList<Eleitor> eleitores1;
    private int[] votacao = new int[5];
    Principal p;
    int contador = 0, contaTecla = 0;
    String num1 = "", num2 = "", num3 = "", num4 = "", num5 = "";

    public Urna(Principal pp) {
        initComponents();

        this.p = pp;
        this.eleitores1 = p.getEleitores();
        this.candidatos1 = p.getCandidatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane9 = new javax.swing.JDesktopPane();
        um = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        jButtonBranco = new javax.swing.JButton();
        jButtonCorrige = new javax.swing.JButton();
        jButtonConfirma = new javax.swing.JButton();
        jLabelnomeCargo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTexto0 = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDesktopPane8Layout = new javax.swing.GroupLayout(jDesktopPane8);
        jDesktopPane8.setLayout(jDesktopPane8Layout);
        jDesktopPane8Layout.setHorizontalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane8Layout.setVerticalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane3.setBackground(new java.awt.Color(153, 153, 255));

        jDesktopPane9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        um.setBackground(new java.awt.Color(51, 51, 51));
        um.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        um.setForeground(new java.awt.Color(255, 255, 255));
        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        quatro.setBackground(new java.awt.Color(51, 51, 51));
        quatro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quatro.setForeground(new java.awt.Color(255, 255, 255));
        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        sete.setBackground(new java.awt.Color(51, 51, 51));
        sete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sete.setForeground(new java.awt.Color(255, 255, 255));
        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        dois.setBackground(new java.awt.Color(51, 51, 51));
        dois.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dois.setForeground(new java.awt.Color(255, 255, 255));
        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(51, 51, 51));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        oito.setBackground(new java.awt.Color(51, 51, 51));
        oito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oito.setForeground(new java.awt.Color(255, 255, 255));
        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(51, 51, 51));
        tres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(51, 51, 51));
        seis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        nove.setBackground(new java.awt.Color(51, 51, 51));
        nove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nove.setForeground(new java.awt.Color(255, 255, 255));
        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(51, 51, 51));
        zero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        jButtonBranco.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBranco.setText("Branco");
        jButtonBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrancoActionPerformed(evt);
            }
        });

        jButtonCorrige.setBackground(new java.awt.Color(255, 153, 51));
        jButtonCorrige.setText("Corrige");
        jButtonCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorrigeActionPerformed(evt);
            }
        });

        jButtonConfirma.setBackground(new java.awt.Color(102, 255, 102));
        jButtonConfirma.setText("Confirma");
        jButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane9Layout = new javax.swing.GroupLayout(jDesktopPane9);
        jDesktopPane9.setLayout(jDesktopPane9Layout);
        jDesktopPane9Layout.setHorizontalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                                        .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                                .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                                        .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBranco)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCorrige)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConfirma)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jDesktopPane9Layout.setVerticalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButtonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jDesktopPane9.setLayer(um, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(quatro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(sete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(dois, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(cinco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(oito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(tres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(seis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(nove, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(zero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(jButtonBranco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(jButtonCorrige, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(jButtonConfirma, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelnomeCargo.setBackground(new java.awt.Color(255, 255, 0));
        jLabelnomeCargo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelnomeCargo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnomeCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelnomeCargo.setText("Para Presidente");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Votação");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Número");

        jLabelTexto0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTexto0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTexto0.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelTexto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTexto1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumero.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelTexto2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTexto2.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDesktopPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelTexto0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jLabelTexto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTexto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabelnomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jDesktopPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabelnomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTexto0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 117, Short.MAX_VALUE))))
        );
        jDesktopPane3.setLayer(jDesktopPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabelnomeCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabelTexto0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabelTexto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabelNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabelTexto2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "4");
            this.verificar();
        }

    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "5");
            this.verificar();
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "8");
            this.verificar();
        }
    }//GEN-LAST:event_oitoActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "1");
            this.verificar();
        }
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "2");
            this.verificar();
        }
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "3");
            this.verificar();
        }
    }//GEN-LAST:event_tresActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "6");
            this.verificar();
        }
    }//GEN-LAST:event_seisActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "7");
            this.verificar();
        }
    }//GEN-LAST:event_seteActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "9");
            this.verificar();
        }
    }//GEN-LAST:event_noveActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if (this.verificar1()) {
            jLabelNumero.setText(jLabelNumero.getText() + "0");
            this.verificar();
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void jButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaActionPerformed
        String cpf = null;
        contador++;
        jLabel4.setVisible(true);

        if (this.bloquearConfirme()) {
            String num1 = jLabelTexto0.getText();
            String num2 = jLabelNumero.getText();

            switch (contador) {

                case 1:
                    this.aux(contador, num1, num2);
                    jLabelnomeCargo.setText("Para Senador");
                    break;
                case 2:
                    this.aux(contador, num1, num2);
                    jLabelnomeCargo.setText("Para Deputado Federal");
                    break;
                case 3:
                    this.aux(contador, num1, num2);
                    jLabelnomeCargo.setText("Para governador");
                    break;
                case 4:
                    this.aux(contador, num1, num2);
                    jLabelnomeCargo.setText("Para Deputado Estadual");
                    break;
                case 5:
                    this.aux(contador, num1, num2);
                    jLabelnomeCargo.setText("ENCERRADA A VOTAÇÃO!");
                    System.out.println("Votação:"+Arrays.toString(votacao));
                    if (p.contabilizarVoto(votacao)) {
                        jLabelTexto0.setText("");
                        jLabelTexto1.setText("");
                        jLabelTexto2.setText("");
                        JOptionPane.showMessageDialog(null, "VOTO GRAVADO COM SUCESSO.\n"
                                                       + "    MUITO OBRIGADO!");
                        this.dispose();
                    }
                    break;
            }
        }
            jLabelNumero.setText("");
            contaTecla = 0;

        
    }//GEN-LAST:event_jButtonConfirmaActionPerformed

    private void aux(int ii, String num, String num2) {
        int i = ii - 1;
        switch (num) {
            case "VOTO EM BRANCO":
                votacao[i] = 0;
                break;
            case "VOTO NULO":
                votacao[i] = 1;
                break;
            default:
                /* Verificando se existe algum candidato a Presidente com esse numero,
                 caso exista somar um na quantidade de voto */
                for (Candidato c : candidatos1) {
                    if ((i == 0) && (c instanceof Presidente) && (c.getNumero().equals(num2))) {
                        votacao[i] = Integer.parseInt(num2);
                    }
                    if ((i == 1) && (c instanceof Senador) && (c.getNumero().equals(num2))) {
                        votacao[i] = Integer.parseInt(num2);
                    }
                    if ((i == 2) && (c instanceof DeputadoFederal) && (c.getNumero().equals(num2))) {
                        votacao[i] = Integer.parseInt(num2);
                    }
                    if ((i == 3) && (c instanceof Governador) && (c.getNumero().equals(num2))) {
                        votacao[i] = Integer.parseInt(num2);
                    }
                    if ((i == 4) && (c instanceof DeputadoEstadual) && (c.getNumero().equals(num2))) {
                        votacao[i] = Integer.parseInt(num2);

                    }
                }
                break;
        }
        jLabelTexto0.setText("");
        jLabelTexto1.setText("");
        jLabelTexto2.setText("");

    }

    private void jButtonBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrancoActionPerformed
        if (jLabelNumero.getText().length() == 0) {
            jLabel4.setVisible(false);
            jLabelTexto0.setText("VOTO EM BRANCO");
            jLabelTexto1.setText("Para confirmar, clique em 'CONFIRMA'.");
            jLabelTexto2.setText("Para corrigir, clique em 'CORRIGE'.");
        } else {
            jLabelTexto1.setText("Para votar em branco,");
            jLabelTexto2.setText("apague os números digitados.");
            jButtonConfirma.disable();
        }
    }//GEN-LAST:event_jButtonBrancoActionPerformed

    private void jButtonCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorrigeActionPerformed

        String texto1 = jLabelNumero.getText();
        int tamanho = texto1.length();

        if (this.jLabelTexto0.getText().equals("VOTO EM BRANCO")) {
            jLabel4.setVisible(true);
            jLabelTexto0.setText("");
            jLabelTexto1.setText("");
            jLabelTexto2.setText("");
        } else if (texto1.length() > 0) {
            /* substring é um método que ele pega uma String. Ele recebe como argumento dois parâmetros :
             *  O primeiro é o zero, ao qual é o começo da String. texto1.length vai retornar o comprimento
             *  da String. -1 vai retirar o último elemento.
             */
            jLabelNumero.setText(texto1.substring(0, (tamanho - 1)));
            jLabelTexto0.setText("");
            jLabelTexto1.setText("");
            jLabelTexto2.setText("");
            --contaTecla;
        } else {

            jButtonCorrige.disable(); // disable serve para travar botão.

        }

    }//GEN-LAST:event_jButtonCorrigeActionPerformed

    private void tfNumerosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumerosKeyReleased

    }//GEN-LAST:event_tfNumerosKeyReleased

    /*MÉTODO USADO PARA IMPLEMENTAR A TECLA CORRIGE, DIMINUINDO UM DÍGITO A 
     CADA VEZ QUE A TECLA CORRIGE É ACIONADA */
    public String NumeroMaximo(int n) {
        String texto1 = jLabelNumero.getText();

        if (texto1.length() > n) {
            texto1.substring(0, (n - 1));
        }
        return texto1;
    }

    /* METODO SEVER PARA BLOQUEAR AS TECLAS NUMERICAS DA URNA, ASSIM QUE O NUMERO MÁXIMO PARA CADA
     CARGO É DIGITADO: EX. PRESIDENTE SÃO 2 NUMEROS, DEPOIS, AS TECLAS NUMERICAS SÃO TRAVADAS 
     */
    public boolean verificar1() {
        boolean conf = true;
        String cargo = jLabelnomeCargo.getText();
        String numero = jLabelNumero.getText();

        if ((cargo.equals("Para Presidente")) && (numero.length() == 2)) {
            conf = false;
        } else if ((cargo.equals("Para Senador")) && (numero.length() == 3)) {
            conf = false;
        } else if ((cargo.equals("Para Deputado Federal")) && (numero.length() == 4)) {
            conf = false;
        } else if ((cargo.equals("Para Governador")) && (numero.length() == 2)) {
            conf = false;
        } else if ((cargo.equals("Para Deputado Estadual")) && (numero.length() == 5)) {
            conf = false;
        }
        return conf;
    }

    public boolean bloquearConfirme() {
        boolean x = true;
        String texto0, texto1;
        texto0 = jLabelTexto0.getText();
        texto1 = jLabelTexto1.getText();
        if ((texto0.equals("VOTO NULO")) && (texto1.equals("Para votar em branco,"))) {
            jButtonConfirma.disable();
            x = false;
        }

        return x;
    }

    // verifica e controla a quantidade de numeros (max e min) para cada candidato
    public void verificar() {
        boolean v;
        String numero = jLabelNumero.getText();
        ++contaTecla;

        switch (contador) {

            /* Para Presidente */
            case 0:
                this.NumeroMaximo(2);
                if (contaTecla == 2) {
                    v = false;
                    for (Candidato c : candidatos1) {
                        if (c instanceof Presidente) {
                            if (c.getNumero().equals(numero)) {
                                this.aux1(c);
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        this.aux2();
                    }
                }
                break;

            /* Para Senador */
            case 1:
                this.NumeroMaximo(3);
                if (contaTecla == 3) {
                    v = false;
                    for (Candidato c : candidatos1) {
                        if (c instanceof Senador) {
                            if (c.getNumero().equals(numero)) {
                                this.aux1(c);
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        this.aux2();
                    }
                }
                break;

            /* Para Deputado Federal */
            case 2:
                this.NumeroMaximo(4);
                if (contaTecla == 4) {
                    v = false;
                    for (Candidato c : candidatos1) {
                        if (c instanceof DeputadoFederal) {
                            if (c.getNumero().equals(numero)) {
                                this.aux1(c);
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        this.aux2();
                    }
                }
                break;

            /* Para Governador */
            case 3:
                this.NumeroMaximo(2);
                if (contaTecla == 2) {
                    v = false;
                    for (Candidato c : candidatos1) {
                        if (c instanceof Governador) {
                            if (c.getNumero().equals(numero)) {
                                this.aux1(c);
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        this.aux2();
                    }
                }
                break;

            /* Para Deputado Estadual */
            case 4:
                this.NumeroMaximo(5);
                if (contaTecla == 5) {
                    v = false;
                    for (Candidato c : candidatos1) {
                        if (c instanceof DeputadoEstadual) {
                            if (c.getNumero().equals(numero)) {
                                this.aux1(c);
                                v = true;
                            }
                        }
                    }
                    if (v == false) {
                        this.aux2();
                    }
                }
                break;

        }

    }

    public void aux1(Candidato c) {
        jLabelTexto0.setText("Candidato(a):     " + c.getNome());
        jLabelTexto1.setText("Partido:     " + c.getPartido());
        jLabelTexto2.setText("");
    }

    public void aux2() {
        jLabelTexto0.setText("VOTO NULO");
        jLabelTexto1.setText("");
        jLabelTexto2.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cinco;
    private javax.swing.JButton dois;
    private javax.swing.JButton jButtonBranco;
    private javax.swing.JButton jButtonConfirma;
    private javax.swing.JButton jButtonCorrige;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JDesktopPane jDesktopPane9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTexto0;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelnomeCargo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

}
