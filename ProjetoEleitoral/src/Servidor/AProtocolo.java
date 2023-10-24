/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import projetoeleitoral.Principal;

/**
 *
 * @author Alberto
 */
public class AProtocolo {

    UrnaAAA urna;
    Principal p = new Principal();

    public UrnaAAA enviarUrna(String conversa) {
        String reposta = "Enviando uma Urna";
        urna = new UrnaAAA();
        return urna;
    }

}
