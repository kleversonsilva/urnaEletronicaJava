package CachedServerTest;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetoeleitoral.*;




class Protocolo {
    Principal p;

    public Protocolo() {
        p = new Principal();
    }

    public boolean GravarVotacao(int[] el) {
        boolean ret = false;
        if (p.contabilizarVoto(el)) {
            String mensagem = JOptionPane.showInputDialog("VOTACAO GRAVADA COM SUCESSO!");
            ret = true;
        }
        return ret;
    }

    public String processLine(String command) {return "Resposta do comando: " + command;}
}
