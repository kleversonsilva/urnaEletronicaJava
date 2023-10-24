package projetoeleitoral;

/**

 */
public class Presidente extends Candidato { // Classe Presidente herda da classe Candidato todos os seus métodos e atributos. 
// Esta classe Presidente, que é uma classe concreta, tem o dever de implementar todos os métodos abstratos da classe abstrata Candidato. Classe abstrata não pode ter um objeto instanciado com o new. 
// A classe Interface também é uma classe abstrata. 
// Porém, se uma classe abstrata herda de uma classe abstrata, a que herda não é obrigada a implementar os métodos dela.
  
    private String numero;


    public Presidente(String cpf, String nome, String partido, String numero) { // Construtor da classe Presidente, ao qual está recebendo como argumentos três Strings.
        
        super(cpf, nome, partido); // Chamando o construtor da superclasse Candidato, usando a palavra reservada super. Ele vai chamar o construtor que possui estes três argumentos como parâmetros.
        this.numero = numero;
        
    }
    
    public Presidente (){
        
    }

    @Override // @Override serve para indicar a sobrescrita de método.
    public String getNumero() { // Método pertencente a classe abstrata Candidato, ao qual está sendo implementada na classe Presidente.
        return numero;
    }

    @Override
    public void setNumero(String numero) { // Método pertencente a classe abstrata Candidato, ao qual está sendo implementada na classe Presidente.
        this.numero = numero;
    }

    @Override
    public String exibeCandidatos1() { // Método pertencente a classe abstrata Candidato, ao qual está sendo implementada na classe Presidente.
        return this.getCpf() + "\t| " + this.getNome() + "\t| " + this.getPartido() + "\t| " + this.numero;
    }

    @Override
    public String exibeCandidatos2() { // Método pertencente a classe abstrata Candidato, ao qual está sendo implementada na classe Presidente.
        return this.numero + "\t| " + this.getNome() + "\t| " + this.getPartido() + "\t| " + this.getQuantVotos();
    }
   
    

}// fim da classe
