/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoeleitoral;

import java.util.Comparator;

/**

 */
public abstract class Candidato implements Comparator<Candidato>{ // Classe Abstrata

    private String partido, cpf, nome;
    
    private int quantVotos;

    public abstract String getNumero(); // Este método abstrato tem que ser implementado por uma outra classe, que esteja responsável por sua implementação.

    public abstract void setNumero(String numero); // O mesmo ocorre acima.
    
    public abstract String exibeCandidatos1();
    
    public abstract String exibeCandidatos2();

       
    public Candidato(String cpf, String nome, String partido) { // Construtor da classe Candidato, recebendo como argumentos três variáveis de tipo String.

        this.cpf = cpf;
        this.nome = nome;
        this.partido = partido;
        this.quantVotos = 0;

    }
    public Candidato(){
        
    }

    public String getPartido() {
        return partido;
    }

    public int getQuantVotos() {
        return quantVotos;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setQuantVotos(int quantVotos) {
        this.quantVotos = quantVotos;
    }

    public void computaVoto() {
        this.quantVotos = this.getQuantVotos() + 1;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        @Override
    public int compare(Candidato o1, Candidato o2) {
//        if (o1.getQuantVotos() == o2.getQuantVotos()) {
//            return 0;
//        } else if (o1.getQuantVotos() < o2.getQuantVotos()){
//            return 1;
//        } else
//            return -1;
        return o2.getQuantVotos()-o1.getQuantVotos();
    }

}// fim da classe
