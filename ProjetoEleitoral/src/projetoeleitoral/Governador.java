package projetoeleitoral;

/**

 */
public class Governador extends Candidato {

    private String numero;

    public Governador(String cpf, String nome, String partido, String numero) {
        super(cpf, nome, partido);
        this.numero = numero;
    }

    public Governador() {

    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public void setNumero(String numero) {
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

}
