package projetoeleitoral;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**

 */
public class Relatorio extends javax.swing.JFrame {

    private ArrayList<Candidato> candidatos1;
    private ArrayList<Eleitor> eleitores1;
    private int votoNulo[];
    private int votoBranco[];
    private Principal p;

    private int total = 0, totalValido = 0, vencedor = 0, quantVotos;
    private int n1 = 1, n2 = 1, n3 = 2, n4 = 1, n5 = 4; //quantidade de eleitos
//    private int quantVotosAux;
    private String cpfVenc, nomeVenc = null;

    private ArrayList<Candidato> presidente = new ArrayList<>();
    private ArrayList<Candidato> senador = new ArrayList<>();
    private ArrayList<Candidato> deputadoFederal = new ArrayList<>();
    private ArrayList<Candidato> governador = new ArrayList<>();
    private ArrayList<Candidato> deputadoEstadual = new ArrayList<>();

    public Relatorio(Principal pp) {
        initComponents();
        this.p = pp;
        this.eleitores1 = p.getEleitores();
        this.candidatos1 = p.getCandidatos();

        this.jTextArea1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jComboBoxPres = new javax.swing.JComboBox();
        jComboBoxSen = new javax.swing.JComboBox();
        jComboBoxDepFed1 = new javax.swing.JComboBox();
        jComboBoxGov = new javax.swing.JComboBox();
        jComboBoxDepEst = new javax.swing.JComboBox();
        jComboBoxEleitor = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIOS");

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setMaximumSize(new java.awt.Dimension(67, 20));
        jButtonVoltar.setMinimumSize(new java.awt.Dimension(67, 20));
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(67, 20));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jComboBoxPres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Presidente:", "1 - Consulta por candidato", "2 - Todos os candidatos", "3 - Candidatos eleitos", "4 - Estatística" }));
        jComboBoxPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPresActionPerformed(evt);
            }
        });

        jComboBoxSen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Senador:", "1 - Consulta por candidato", "2 - Todos os candidatos", "3 - Candidatos eleitos", "4 - Estatística", " " }));
        jComboBoxSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSenActionPerformed(evt);
            }
        });

        jComboBoxDepFed1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deputado Federal:", "1 - Consulta por candidato", "2 - Todos os candidatos", "3 - Candidatos eleitos", "4 - Estatística" }));
        jComboBoxDepFed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepFed1ActionPerformed(evt);
            }
        });

        jComboBoxGov.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Governador:", "1 - Consulta por candidato", "2 - Todos os candidatos", "3 - Candidatos eleitos", "4 - Estatística" }));
        jComboBoxGov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGovActionPerformed(evt);
            }
        });

        jComboBoxDepEst.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deputado Estadual:", "1 - Consulta por candidato", "2 - Todos os candidatos", "3 - Candidatos eleitos", "4 - Estatística" }));
        jComboBoxDepEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepEstActionPerformed(evt);
            }
        });

        jComboBoxEleitor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eleitor:", "1 - Consulta Individual", "2 - Todos os eleitores", "3 - Eleitores Candidatos", "4 - Eleitores votantes", "5 - Estatística" }));
        jComboBoxEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEleitorActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(67, 20));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxGov, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jComboBoxDepEst, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxSen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jComboBoxDepFed1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jComboBoxPres, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEleitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDepFed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDepEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        this.jTextArea1.setText("");
        this.jTextArea1.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    /* Este método serve para copiar os ArrayList candidatos1 em vários ArrayList especifico para
     cada cargo, e depois organizá-los em ordem decrescente pela quantidade de votos, através do 
     método Collections.sort */
    public void organizarCandidato() {
        // atualiza os dados dos candidatos1;
        this.atualizarCandidato();

        int i = 0, j = 0;
        /* Criando um novo ArrayList para cada cargo que irá receber uma cópia dos dados
         do ArrayList candidatos1 dos cargos correspondente */
        for (Candidato c1 : candidatos1) {
            if (c1 instanceof Presidente) {
                presidente.add(c1);
            }
            if (c1 instanceof Senador) {
                senador.add(c1);
            }
            if (c1 instanceof DeputadoFederal) {
                deputadoFederal.add(c1);
            }
            if (c1 instanceof Governador) {
                governador.add(c1);
            }
            if (c1 instanceof DeputadoEstadual) {
                deputadoEstadual.add(c1);
            }
        }

        /* Ordenando os novos ArrayList dos cargos, pelo critério de quantidade de votos recebidos */
        // OBS AQUI ESTÁ DUPLICANDO OS NOMES DOS CANDIDADOS EM CADA ARRAYLIST ESPECÍFICO
//        Collections.sort(presidente, new Comparacao());
        Collections.sort(presidente, new Presidente());
        Collections.sort(senador, new Senador());
        Collections.sort(deputadoFederal, new DeputadoFederal());
        Collections.sort(governador, new Governador());
        Collections.sort(deputadoEstadual, new DeputadoEstadual());
    }

    /* MÉTOTO PARA  CONSULTA INDIVIDUAL DO CANDIDATO */
    public void ConsultaIndividual(ArrayList<Candidato> temp) {

        jTextArea1.setText("");

        String aux = JOptionPane.showInputDialog(null, "Digite o CPF do candidato:");
        // TRATAR O CPF AQUI

        this.jTextArea1.setVisible(true);

        if (temp.size() > 0) {
            for (Candidato c : temp) {
                if (c.getCpf().equals(aux)) {
                    this.jTextArea1.setText("Dados do Candidato de CPF nº " + aux + "\n\n");
                    this.jTextArea1.append("Numero \t| Nome\t| Partido\t| Votos\n");
                    jTextArea1.append("Numero \t| Nome\t\t\t| Partido\t| Votos\n");
                    jTextArea1.append("---------------------\t|--------------------------------------"
                            + "-------------------------\t|" + "---------------------\t|---------------\n");
                } else {
                    this.jTextArea1.setText("\nNão existe Candidato cadastrado com o CPF nº " + aux + ".");
                }
            }
        } else {
            jTextArea1.setText("\nNão existe Candidato cadastrado para este cargo.");
        }
    }

    /* MÉTOTO PARA LISTAR TODOS OS CANDIDATOS (ELEITOS E NÃO ELEITOS) CONFORME O CARGO */
    public void TodosCandidatos(ArrayList<Candidato> temp) {

        jTextArea1.setText("");
        this.jTextArea1.setVisible(true);

        if (temp.size() > 0) {

            if (temp == presidente) {
                jTextArea1.setText("Todos os Candidatos a Presidente:\n\n");
            } else if (temp == senador) {
                jTextArea1.setText("Todos os Candidatos a Senador:\n\n");
            } else if (temp == deputadoFederal) {
                jTextArea1.setText("Todos os Candidatos a Deputado Federal:\n\n");
            } else if (temp == governador) {
                jTextArea1.setText("Todos os Candidatos a Governador:\n\n");
            } else if (temp == deputadoEstadual) {
                jTextArea1.setText("Todos os Candidatos a Deputado Estadual:\n\n");
            }

            jTextArea1.append("Numero \t| Nome\t\t\t| Partido\t| Votos\n");
            jTextArea1.append("---------------------\t|--------------------------------------"
                    + "-------------------------\t|" + "---------------------\t|---------------\n");

            for (Candidato c : temp) {
                String x = c.exibeCandidatos2() + "\n";
                jTextArea1.append(x);
            }
        } else {
            jTextArea1.setText("\n   Não existe Candidato cadastrado para este cargo.");
        }
    }

    /* MÉTOTO PARA LISTAR TODOS OS CANDIDATOS ELEITOS CONFORME O CARGO */
    public void Eleitos(ArrayList<Candidato> temp, int quant) {

        int votosValidos = 0;
        int quant1 = 0;
        float porc;

        jTextArea1.setText("");
        this.jTextArea1.setVisible(true);

        if (temp.size() > 0) {

            if (temp == presidente) {
                jTextArea1.setText("Candidato eleito para Presidente:\n\n");
            } else if (temp == senador) {
                jTextArea1.setText("Candidato eleito para Senador:\n\n");
            } else if (temp == deputadoFederal) {
                jTextArea1.setText("Candidatos eleitos para Deputado Federal:\n\n");
            } else if (temp == governador) {
                jTextArea1.setText("Candidato eleito para Governador:\n\n");
            } else if (temp == deputadoEstadual) {
                jTextArea1.setText("Candidatos eleitos para Deputado Estadual:\n\n");
            }

            jTextArea1.append("Numero \t| Nome\t\t\t| Partido\t| Votos\n");
            jTextArea1.append("---------------------\t|--------------------------------------"
                    + "-------------------------\t|" + "---------------------\t|---------------\n");

            for (Candidato c : temp) {
                votosValidos += c.getQuantVotos();
            }

            for (Candidato c : temp) {

                porc = (float) ((c.getQuantVotos() * 100.0) / votosValidos);

                NumberFormat f = NumberFormat.getPercentInstance();
                f.format(porc);

                if (quant1 < quant) {
                    String x = c.exibeCandidatos2() + "\t| " + porc + "\n";
                    jTextArea1.append(x);
                    quant1++;
                }
            }
        } else {
            jTextArea1.setText("\n   Não existe candidato cadastrado para este cargo.");
        }
    }

    /* MÉTOTO PARA INFORMAR A QUANTIDADE DE VOTOS VÁLIDOS CONFORME O CARGO */
    public int VotosValidos(ArrayList<Candidato> temp) {

        this.atualizarCandidato();;

        int votosValidos = 0;

        for (Candidato c : temp) {
            votosValidos += c.getQuantVotos();
        }
        return votosValidos;
    }

    /* MÉTOTO PARA LISTAR OS CANDIDATOS A SENADOR */
    private void jComboBoxSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSenActionPerformed

        int op = this.jComboBoxSen.getSelectedIndex();
        this.organizarCandidato();

        switch (op) {

            case 1:
                this.ConsultaIndividual(senador);
                break;

            case 2:
                /* Listando todos os candidatos1 a Senador através do novo ArrayList senador*/
                this.TodosCandidatos(senador);
                break;

            case 3:
                this.Eleitos(senador, n2);
                break;

            case 4:
                // atualizando os votos Nulo e Branco
                this.atualizarVotoNulo();
                /* Listando os a estatística para Senador */
                this.aux1(senador, 1);
                break;

            default:
        }

        this.limparCampos();

    }//GEN-LAST:event_jComboBoxSenActionPerformed

    /* MÉTOTO PARA LISTAR OS CANDIDATOS A DEPUTADO FEDERAL */
    private void jComboBoxDepFed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepFed1ActionPerformed

        int op = this.jComboBoxDepFed1.getSelectedIndex();
        this.organizarCandidato();

        switch (op) {

            case 1:
                this.ConsultaIndividual(deputadoFederal);
                break;

            case 2:
                /* Listando todos os candidatos1 a Deputado Federal através do novo ArrayList deputadoFederal*/
                this.TodosCandidatos(deputadoFederal);
                break;

            case 3:
                this.Eleitos(deputadoFederal, n3);
                break;

            case 4:
                // atualizando os votos Nulo e Branco
                this.atualizarVotoNulo();
                /* Listando os a estatística para Deputado Federal */
                this.aux1(deputadoFederal, 2);
                break;

            default:
        }

        this.limparCampos();

    }//GEN-LAST:event_jComboBoxDepFed1ActionPerformed

    /* MÉTOTO PARA LISTAR OS CANDIDATOS A GOVERNADOR */
    private void jComboBoxGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGovActionPerformed

        int op = this.jComboBoxGov.getSelectedIndex();
        this.organizarCandidato();

        switch (op) {

            case 1:
                this.ConsultaIndividual(governador);
                break;

            case 2:
                /* Listando todos os candidatos1 a Governador através do novo ArrayList governador*/
                this.TodosCandidatos(governador);
                break;

            case 3:
                this.Eleitos(governador, n4);
                break;

            case 4:
                // atualizando os votos Nulo e Branco
                this.atualizarVotoNulo();
                /* Listando os a estatística para Governador */
                this.aux1(governador, 3);
                break;

            default:
        }

        this.limparCampos();

    }//GEN-LAST:event_jComboBoxGovActionPerformed

    /* MÉTOTO PARA LISTAR OS CANDIDATOS A DEPUTADO ESTADUAL */
    private void jComboBoxDepEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepEstActionPerformed

        int op = this.jComboBoxDepEst.getSelectedIndex();
        this.organizarCandidato();

        switch (op) {

            case 1:
                this.ConsultaIndividual(deputadoEstadual);
                break;

            case 2:
                /* Listando todos os candidatos1 a Deputado Estadual através do novo ArrayList deputadoEstadual */
                this.TodosCandidatos(deputadoEstadual);
                break;

            case 3:
                this.Eleitos(deputadoEstadual, n5);
                break;

            case 4:
                // atualizando os votos Nulo e Branco
                this.atualizarVotoNulo();
                /* Listando os a estatística para Deputado Estadual */
                this.aux1(deputadoEstadual, 4);
                break;

            default:
        }

        this.limparCampos();
    }//GEN-LAST:event_jComboBoxDepEstActionPerformed

    /* MÉTOTO PARA LISTAR OS CANDIDATOS A PRESIDENTE */
    private void jComboBoxPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPresActionPerformed

        int op = this.jComboBoxPres.getSelectedIndex();
        this.organizarCandidato();

        switch (op) {

            case 1:
                this.ConsultaIndividual(presidente);
                break;

            case 2:
                /* Listando todos os candidatos1 a Presidente através do novo ArrayList presidente */
                this.TodosCandidatos(presidente);
                break;

            case 3:
                this.Eleitos(presidente, n1);
                break;

            case 4:
                // atualizando os votos Nulo e Branco
                this.atualizarVotoNulo();
                /* Listando os a estatística para Presidente */
                this.aux1(presidente, 0);
                break;

            default:
        }

        this.limparCampos();

    }//GEN-LAST:event_jComboBoxPresActionPerformed

    /* MÉTOTO PARA LISTAR OS ELEITORES */
    private void jComboBoxEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEleitorActionPerformed

        int op = this.jComboBoxEleitor.getSelectedIndex();
        this.atualizarEleitor();

        switch (op) {
            /* CONSULTA INDIVIDUAL */
            case 1:
                String aux = JOptionPane.showInputDialog(null, "Digite o CPF do Eleitor:");
                this.jTextArea1.setVisible(true);
                if (eleitores1.size() > 0) {
                    for (Eleitor e : eleitores1) {
                        if (e.getCpf().equals(aux)) {
                            jTextArea1.setText("Dados do Eleitor com o CPF nº " + aux + ":\n\n");
                            jTextArea1.append("CPF \t| " + "Nome \t\t\t| " + "Identidade \t| " + "Titulo \t| "
                                    + "Zona \t| " + "Seção \t| " + "Votou \t| " + "Candidato\n");
                            jTextArea1.append("---------------------\t|----------------------------------------------------------------\t|"
                                    + "---------------------\t|---------------------\t|---------------------\t|"
                                    + "---------------------\t|---------------------\t|---------------\n");
                            jTextArea1.append(e.exibeEleitor1());
                            break;
                        } else {
                            this.jTextArea1.setText("\n  Não existe Eleitor cadastrado com o CPF nº " + aux + ".");
                        }
                    }
                } else {
                    jTextArea1.setText("\n   Não existe Eleitor cadastrado.");
                }
                break;

            /* TODOS OS ELEITORES */
            case 2:
                this.jTextArea1.setVisible(true);
                jTextArea1.setText("");
                if (eleitores1.size() > 0) {
                    jTextArea1.setText("Todos os Eleitores:\n\n");
                    jTextArea1.append("CPF \t| " + "Nome \t\t\t| " + "Identidade \t| " + "Titulo \t| "
                            + "Zona \t| " + "Seção \t| " + "Votou \t| " + "Candidato\n");
                    jTextArea1.append("---------------------\t|----------------------------------------------------------------\t|"
                            + "---------------------\t|---------------------\t|---------------------\t|"
                            + "---------------------\t|---------------------\t|---------------\n");
                    for (Eleitor e : eleitores1) {
                        jTextArea1.append(e.exibeEleitor1() + "\n");
                    }
                } else {
                    jTextArea1.setText("\n   Não existe Eleitor cadastrado.");
                }
                break;

            /* ELEITORES QUE SÃO CANDIDATOS */
            case 3:
                int contaEleitorCandidato = 0;
                /* MÉTODO PARA SABER SE EXISTE ELEITORES CADASTRADOS COMO CANDIDATO */
                for (Eleitor e : eleitores1) {
                    if (e.getSerCandidato().equals("Sim")) {
                        contaEleitorCandidato++;
                    }
                }

                /* METODO PARA LISTAR OS ELEITORES CANDIDATOS, SE EXISTIR */
                if (contaEleitorCandidato > 0) {
                    this.jTextArea1.setVisible(true);
                    jTextArea1.setText("");
                    jTextArea1.setText("Todos os Eleitores que são Candidatos:\n\n");
                    jTextArea1.append("CPF \t| " + "Nome \t\t\t| " + "Partido \t| " + "Cargo\n");
                    jTextArea1.append("---------------------\t|----------------------------------------------------------------\t|"
                            + "---------------------\t|--------------------------\n");
                    for (Eleitor e : eleitores1) {
                        if (e.getSerCandidato().equals("Sim")) {
                            String cpf = e.getCpf();
                            for (Candidato c : candidatos1) {
                                if (c.getCpf().equals(cpf)) {
                                    jTextArea1.append(e.exibeEleitor3() + "\t| "
                                            + c.getPartido() + "\t| " + this.tipo(c) + "\n");
                                }
                            }
                        }
                    }
                } else {
                    jTextArea1.setText("\n  Não existe Eleitor que seja Candidato.\n\n");
                }
                contaEleitorCandidato = 0;
                break;

            /* ELEITORES QUE VOTARAM */
            case 4:
                int contaEleitorComparecimento = 0;
                for (Eleitor e : eleitores1) {
                    if (e.getComparecimento().equals("Sim")) {
                        contaEleitorComparecimento++;
                    }
                }

                if (contaEleitorComparecimento > 0) {
                    this.jTextArea1.setVisible(true);
                    jTextArea1.setText("");
                    jTextArea1.setText("Todos os Eleitores que votaram:\n\n");
                    jTextArea1.append("CPF \t| " + "Nome \t\t\t| " + "Identidade \t| " + "Titulo \t| "
                            + "Zona \t| " + "Seção \n");
                    jTextArea1.append("---------------------\t|----------------------------------------------------------------\t|"
                            + "---------------------\t|---------------------\t|---------------------\t|"
                            + "---------------------\n");
                    for (Eleitor e : eleitores1) {
                        if (e.getComparecimento().equals("Sim")) {
                            jTextArea1.append(e.exibeEleitor2() + "\n");

                        }
                    }
                } else {
                    jTextArea1.setText("\n  Não existe Eleitor que compareceu a votação.\n\n");
                }
                contaEleitorComparecimento = 0;
                break;

            /* ESTATÍSTICA */
            case 5:
                this.jTextArea1.setVisible(true);
                jTextArea1.setText("");
                int totalEleitores = eleitores1.size();
                int votantes = 0;
                for (Eleitor e : eleitores1) {
                    if (e.getComparecimento().equals("Sim")) {
                        votantes++;
                    }
                }

                String x = "Quantidade de Eleitores = " + totalEleitores + "\nTotal de votantes = "
                        + votantes + "\nTotal de abstenção = " + (totalEleitores - votantes);
                jTextArea1.setText(x);
        }

        this.jComboBoxEleitor.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBoxEleitorActionPerformed


    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        this.limparCampos();
        this.jTextArea1.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private String tipo(Candidato c) {
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

    private void atualizarEleitor() {
        this.eleitores1 = p.getEleitores();
    }

    private void atualizarCandidato() {
        this.candidatos1 = p.getCandidatos();
    }

    private void atualizarVotoNulo() {
        votoNulo = p.getVotoNulo();
        votoBranco = p.getVotoBranco();
    }

    public void limparCampos() {
        this.jComboBoxPres.setSelectedIndex(0);
        this.jComboBoxSen.setSelectedIndex(0);
        this.jComboBoxGov.setSelectedIndex(0);
        this.jComboBoxDepFed1.setSelectedIndex(0);
        this.jComboBoxDepEst.setSelectedIndex(0);
        this.jComboBoxEleitor.setSelectedIndex(0);
        presidente.clear();
        senador.clear();
        deputadoFederal.clear();
        governador.clear();
        deputadoEstadual.clear();
    }

    public void aux1(ArrayList<Candidato> c, int n) {

        String[] cargo = new String[5];
        cargo[0] = "Presidente";
        cargo[1] = "Senador";
        cargo[2] = "Deputado Federal";
        cargo[3] = "Governador";
        cargo[4] = "Deputado Estadual";

        this.jTextArea1.setVisible(true);
        jTextArea1.setText("");
        this.jTextArea1.append("Estatística da votação para " + cargo[n] + ":\n\n" + " Votos Válidos = "
                + this.VotosValidos(c) + "\n Votos Nulos = " + votoNulo[n]
                + "\n Votos em Branco = " + votoBranco[n]);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox jComboBoxDepEst;
    private javax.swing.JComboBox jComboBoxDepFed1;
    private javax.swing.JComboBox jComboBoxEleitor;
    private javax.swing.JComboBox jComboBoxGov;
    private javax.swing.JComboBox jComboBoxPres;
    private javax.swing.JComboBox jComboBoxSen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
