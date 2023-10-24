package projetoeleitoral;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

/**


 */

public class Principal extends javax.swing.JFrame {

    private Dados1 d;
    private Executor exec = Executors.newCachedThreadPool();
    private ArrayList<Eleitor> eleitores;
    private ArrayList<Candidato> candidatos;
    private int votoNulo[] = new int[5];
    private int votoBranco[] = new int[5];
    private int numF = 0, numE = 0; // para definir o número de funcionários e eleitores no ar
    private int n = 600, m = 50;// para definir a localização das janelas

    public Principal() {
        initComponents();
        d = new Dados1();
        eleitores = d.recuperarEleitor();
        candidatos = d.recuperarCandidato();
        votoBranco = d.recuperarVotoBranco();
        votoNulo = d.recuperarVotoNulo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButtonEleitores = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane2.setMaximumSize(new java.awt.Dimension(500, 550));
        jDesktopPane2.setPreferredSize(new java.awt.Dimension(500, 550));

        jButtonEleitores.setText("Eleitor");
        jButtonEleitores.setMaximumSize(new java.awt.Dimension(150, 30));
        jButtonEleitores.setPreferredSize(new java.awt.Dimension(150, 30));
        jButtonEleitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEleitoresActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoeleitoral/brasaorepublica.gif"))); // NOI18N

        jButtonFuncionario.setText("Funcionários");
        jButtonFuncionario.setMaximumSize(new java.awt.Dimension(150, 30));
        jButtonFuncionario.setPreferredSize(new java.awt.Dimension(150, 30));
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel2))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jButtonFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEleitores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap(430, Short.MAX_VALUE)
                    .addComponent(jButtonFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)))
        );
        jDesktopPane2.setLayer(jButtonEleitores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButtonSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButtonFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonEleitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEleitoresActionPerformed
        // abre a classe RunnableTask para criar um eleitor
        exec.execute(new RunnableTask(this, 1));
    }//GEN-LAST:event_jButtonEleitoresActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.jButtonSairActionPerformed(null);
    }//GEN-LAST:event_formWindowClosed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
// abre a classe RunnableTask para criar um eleitor
        exec.execute(new RunnableTask(this, 0));
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    public void windowClosing(WindowEvent e) {
        this.jButtonSairActionPerformed(null);
    }

    public void teste() {
        for (Candidato c : candidatos) {
            System.out.println(c.exibeCandidatos1());
        }
    }

    public void teste3(int[] voto) {
        System.out.println(Arrays.toString(voto));
    }

    public void teste2() {
        for (Eleitor e : eleitores) {
            System.out.println(e.exibeEleitor1());
        }
    }

    public synchronized void gravarVotoBranco() {
        d.armazenarVotoBranco(votoBranco);
    }

    public void recuperarVotoBranco() {
        votoBranco = d.recuperarVotoBranco();
    }

    public synchronized void gravarVotoNulo() {
        d.armazenarVotoNulo(votoNulo);
    }

    public synchronized  void recuperarVotoNulo() {
        votoNulo = d.recuperarVotoNulo();
    }

    public synchronized void gravarEleitor2() {
        d.armazenarEleitor(eleitores, 8);
    }

    private synchronized void addEleitor(Eleitor e) {
        this.getEleitores().add(e);
        this.setEleitores(this.getEleitores());
    }

    public synchronized void recuperarEleitor2() {
        eleitores = d.recuperarEleitor();
    }

    public synchronized void gravarCandidato2() {
        d.armazenarCandidato(candidatos, 6);
    }

    private synchronized void addCandidato(Candidato e) {
        this.getCandidatos().add(e);
        this.setCandidatos(this.getCandidatos());
    }

    public synchronized void recuperarCandidato2() {
        candidatos = d.recuperarCandidato();
    }

    // Recebe da classe CadastroEleitor um novo eleitor, verifica se tudo está correto e aciona o método gravarEleitor
    public synchronized boolean addEleitor(ArrayList<String> ee) {
        boolean ret;

        /* Solicitando do usuários novos dados de objetos tipo Eleitor para serem gravados */
        String cpf, nome, identidade, titulo, zona, secao;

        cpf = ee.get(0);
        nome = ee.get(1);
        identidade = ee.get(2);
        titulo = ee.get(3);
        zona = ee.get(4);
        secao = ee.get(5);

        /* Criando um novo objeto tipo Eleitor */
        Eleitor e1 = new Eleitor(cpf, nome, identidade, titulo, zona, secao);

        this.addEleitor(e1);
        this.gravarEleitor2();
        this.recuperarEleitor2();
//        JOptionPane.showMessageDialog(null, "ELEITOR GRAVADO COM SUCESSO.");
        ret = true;

        return ret;
    }

    // Recebe o cpf de um eleitor a ser removido, consulta se ele existe, se não é candidato
    // e se não votou, depois remove, armazenando e atualizando o ArrayList eleitores
    public synchronized boolean removerEleitor(String cpf) {

        boolean ret = false;

        for (Eleitor e : getEleitores()) {
            if ((e.getCpf().equals(cpf)) && (e.getSerCandidato().equals("Nao")) && (e.getComparecimento().equals("Nao"))) {
                this.getEleitores().remove(e);
                this.gravarEleitor2();
                this.recuperarEleitor2();
                ret = true;
//                JOptionPane.showMessageDialog(null, "Eleitor removido com sucesso.");
                break;
            } else if ((e.getCpf().equals(cpf)) && (e.getSerCandidato().equals("Sim")) && (e.getComparecimento().equals("Sim"))) {
                JOptionPane.showMessageDialog(null, "O Eleitor é candidato e já votou"
                        + "\nportanto não pode ser excluído!");
            } else if ((e.getCpf().equals(cpf)) && (e.getSerCandidato().equals("Sim"))) {
                JOptionPane.showMessageDialog(null, "O Eleitor é candidato"
                        + "\ne não pode ser excluído!");
            } else if ((e.getCpf().equals(cpf)) && (e.getComparecimento().equals("Sim"))) {
                JOptionPane.showMessageDialog(null, "O Eleito já votou"
                        + "\ne não pode ser excluído!");
            }
        }
        return ret;
    }

    // Recebe da classe CadastroCanditado os dados de um novo candidato, faz as devidas consulta se ele já 
    // é candidato ou se existe candidato já casdastrado com o número, depois aciona o método addCandidato
    public synchronized  boolean addCandidato(ArrayList<String> cc) {
        boolean ret = false;

        /* Solicitando do usuários novos dados de objetos tipo Eleitor para serem gravados */
        String cpf, cargo, nome, partido, numero;
        cpf = cc.get(0);
        nome = cc.get(1);
        cargo = cc.get(2);
        partido = cc.get(3);
        numero = cc.get(4);

        nome = nome.toUpperCase();
        
        Candidato p;
        switch (Integer.parseInt(cargo)) {
            case 1:
                p = new Presidente(cpf, nome, partido, numero);
                this.addCandidato(p);
                ret = true;
                break;
            case 2:
                p = new Senador(cpf, nome, partido, numero);
                this.addCandidato(p);
                ret = true;
                break;
            case 3:
                p = new DeputadoFederal(cpf, nome, partido, numero);
                this.addCandidato(p);
                ret = true;
                break;
            case 4:
                p = new Governador(cpf, nome, partido, numero);
                this.addCandidato(p);
                ret = true;
                break;
            case 5:
                p = new DeputadoEstadual(cpf, nome, partido, numero);
                this.addCandidato(p);
                ret = true;
                break;
            default:
        }

        
        this.gravarCandidato2();
        this.recuperarCandidato2();

        // PARA GRAVAR A MUDANÇA DE STATUS DO ELEITOR QUE AGORA TAMBÉM É CANDIDATO
        this.MudaCandidato(cpf);
//        JOptionPane.showMessageDialog(null, "CANDIDATO GRAVADO COM SUCESSO.");
        return ret;
    }
    // Recebe da classe CadastroCandidato um cpf de um candidato que irá ser removido, faz as devidas consultas
    // se ele possui votos, depois armazena e recupera e atualiza o ArrayList candidatos

    public synchronized boolean removerCadidato(String cpf) {
        boolean ret = false;

        for (Candidato cc : getCandidatos()) {
            if (cc.getCpf().equals(cpf)) {
                if (cc.getQuantVotos() == 0) {
                    getCandidatos().remove(cc);
                    this.gravarCandidato2();
                    this.recuperarCandidato2();
                    ret = true;
//                    JOptionPane.showMessageDialog(null, "Candidato removido com sucesso.");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "O candidato possui votos"
                            + "\ne não pode ser excluído!");
                }
            }
        }
        return ret;
    }

    // Aciona o método mudaSerCandidato da classe Eleitor e muda seu status de ser ou não candidato.
    private void MudaCandidato(String cpf) {
        for (Eleitor e : getEleitores()) {
            if (e.getCpf().equals(cpf)) {
                e.mudaSerCandidato();
                break;
            }
        }
        this.gravarEleitor2();
    }

    public boolean mudaComparecimento(String cpf) {

        boolean comparecimento = false, ret = false;

        boolean var1 = cpf.matches("\\d{9}.\\d{2}");

        /* método verificar se o Eleitor deste CPF já votou */
        for (Eleitor e : eleitores) {
            if ((e.getCpf().equals(cpf)) && (e.getComparecimento().equals("Sim"))) {
                comparecimento = true;
                break;
            }
        }

        // depois retornar
//        if (var1 == false) {
//
//            JOptionPane.showMessageDialog(null, "CPF INVÁLIDO.");
//
//        } else if (comparecimento == true) {
//
//            JOptionPane.showMessageDialog(null, "O ELEITOR JÁ VOTOU.");
//
//        } else if ((var1 == true) && (comparecimento == false)) {
//            for (Eleitor e : eleitores) {
//                if (e.getCpf().equals(cpf)) {
//                    e.mudaComparecimento();
        ret = true;
//                }
//            }
//
//           
//        }

        return ret;
    }

    // método para consultar se o eleitor com tal cpf existe, retornando todos os dados desse eleitor
    public ArrayList<String> certificar_CPF(String cpf) {

        boolean var1 = cpf.matches("\\d{9}.\\d{2}");
        ArrayList<String> dados = new ArrayList<>();
        dados = null;

        if (var1 == true) {
            for (Eleitor eleitore1 : getEleitores()) {
                if (eleitore1.getCpf().equals(cpf)) {
                    dados.add(eleitore1.getCpf());
                    dados.add(eleitore1.getNome());
                    dados.add(eleitore1.getIdentidade());
                    dados.add(eleitore1.getTituloeleitoral());
                    dados.add(eleitore1.getZonaeleitoral());
                    dados.add(eleitore1.getSecao());
                    dados.add(eleitore1.getSerCandidato());
                    dados.add(eleitore1.getComparecimento());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dados digitados incorretos");
        }

        return dados;

    }

    // consulta sobre um partido
    public String Partido(int i) {
        ArrayList<String> partido = new ArrayList<>();
        partido.add("PP");
        partido.add("PT");
        partido.add("PL");
        partido.add("PMDB");
        partido.add("PDT");
        partido.add("PSDB");

        return partido.get(i);
    }

    public ArrayList<Eleitor> getEleitores() {
        return eleitores;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public int[] getVotoNulo() {
        return votoNulo;
    }

    public int[] getVotoBranco() {
        return votoBranco;
    }

    public void setEleitores(ArrayList<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public void setVotoNulo(int[] votoNulo) {
        this.votoNulo = votoNulo;
    }

    public void setVotoBranco(int[] votoBranco) {
        this.votoBranco = votoBranco;
    }

    public synchronized boolean contabilizarVoto(int[] votacao) {
        System.out.println("Votacao(Principal);" + Arrays.toString(votacao));
        boolean ret = false;
        for (int i = 0; i < votacao.length; i++) {
            if (votacao[i] == 0) {
                votoBranco[i]++;
            } else if (votacao[i] == 1) {
                votoNulo[i]++;
            } else {
                for (Candidato ca : candidatos) {
                    if ((ca instanceof Presidente) && (ca.getNumero().equals(String.valueOf(votacao[i])))) {
                        ca.computaVoto();
                    }
                    if ((ca instanceof Senador) && (ca.getNumero().equals(String.valueOf(votacao[i])))) {
                        ca.computaVoto();
                    }
                    if ((ca instanceof DeputadoFederal) && (ca.getNumero().equals(String.valueOf(votacao[i])))) {
                        ca.computaVoto();
                    }
                    if ((ca instanceof Governador) && (ca.getNumero().equals(String.valueOf(votacao[i])))) {
                        ca.computaVoto();
                    }
                    if ((ca instanceof DeputadoEstadual) && (ca.getNumero().equals(String.valueOf(votacao[i])))) {
                        ca.computaVoto();
                    }
                }
            }
            if (i == votacao.length - 1) {
                ret = true;
            }
        }
        if (ret) {
            this.gravarCandidato2();
            this.recuperarCandidato2();
            this.gravarVotoBranco();
            this.gravarVotoNulo();
        }
        return ret;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Principal e = new Principal();
                e.setLocation(100, 100);
                e.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEleitores;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
