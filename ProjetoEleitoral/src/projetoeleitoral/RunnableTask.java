package projetoeleitoral;

import java.util.ArrayList;

/**

 */
class RunnableTask implements Runnable {

    int numF, numE, op;
    Principal p;
    ArrayList<Eleitor> auxEleitores;
    ArrayList<Candidato> auxCandidatos;
    int votacao[] = new int[5];

    public RunnableTask(Principal p, int op) {
        this.op = op;
        this.p = p;
    }

    @Override
    public void run() {

        try {
            if (op == 0) {
                Funcionario f = new Funcionario(p);
                f.setLocation(700, 100);
                f.setVisible(true);
            } else if (op == 1) {
                InicioVotar e = new InicioVotar(p);
                e.setLocation(700, 100);
                e.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("ERRO NO RUN");
        }
    }
}
