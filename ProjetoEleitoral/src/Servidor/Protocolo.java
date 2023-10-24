/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetoeleitoral.Candidato;
import projetoeleitoral.Principal;

/**
 *
 * @author Alberto
 */
public class Protocolo {

    Principal p;

    public Protocolo() {
        p = new Principal();
    }

    public int abrirJanelas(int i) {
        return i;
    }

    public boolean capitalizarVotacao(int[] votacao) {
        boolean ret = false;
        if (p.contabilizarVoto(votacao)) {
            ret = true;
//            JOptionPane.showMessageDialog(null, "VOTO COMPUTADO COM SUCESSO.");
        } else {
//            JOptionPane.showMessageDialog(null, "VOTO NÃO FOI COMPUTADO COM SUCESSO.");
        }
        return ret;
    }

    public boolean incluirEleitor(ArrayList<String> e) {
        boolean ret = false;
        
        System.out.print("Eleito (Protocolo 43){");
        for (String c : e) {
            System.out.print(c);
        }
        System.out.print("}\n");
        
        if (p.addEleitor(e)) {
            ret = true;
            JOptionPane.showMessageDialog(null, "ELEITOR INCLUÍDO COM SUCESSO.");
        } else {
            JOptionPane.showMessageDialog(null, "ELEITOR NÃO FOI INCLUÍDO.");
        }
        return ret;
    }

    public boolean removerEleitor(String cpf) {
        boolean ret = false;
        if (p.removerEleitor(cpf)) {
            ret = true;
            JOptionPane.showMessageDialog(null, "ELEITOR REMOVIDO COM SUCESSO.");
        } else {
            JOptionPane.showMessageDialog(null, "ELEITOR NÃO FOI REMOVIDO.");
        }
        return ret;
    }

    public boolean incluirCandidato(ArrayList<String> e) {
        boolean ret = false;
        if (p.addCandidato(e)) {
            ret = true;
            JOptionPane.showMessageDialog(null, "CANDIDATO INCLUÍDO COM SUCESSO.");
        } else {
            JOptionPane.showMessageDialog(null, "CANDIDATO NÃO FOI INCLUÍDO.");
        }
        return ret;
    }

    public boolean removerCandidato(String cpf) {
        boolean ret = false;
        if (p.removerCadidato(cpf)) {
            ret = true;
            JOptionPane.showMessageDialog(null, "CANDIDATO REMOVIDO COM SUCESSO.");
        } else {
            JOptionPane.showMessageDialog(null, "CANDIDATO NÃO FOI REMOVIDO.");
        }
        return ret;
    }
    
    public void exibir (ArrayList<String> e){
        
    }

}
