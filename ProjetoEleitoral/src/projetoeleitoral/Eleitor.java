
package projetoeleitoral;

/**

 */
public class Eleitor {

    private String nome, identidade, cpf, zonaeleitoral, secao, tituloeleitoral;
    private String comparecimento, serCandidato;

    
    public Eleitor(String cpf, String nome, String identidade ,String titulo, String zona, String secao) {

        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.zonaeleitoral = zona;
        this.secao = secao;
        this.tituloeleitoral = titulo;
        this.comparecimento = "Nao";
        this.serCandidato = "Nao";

    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the identidade
     */
    public String getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the zonaeleitoral
     */
    public String getZonaeleitoral() {
        return zonaeleitoral;
    }

    /**
     * @param zonaeleitoral the zonaeleitoral to set
     */
    public void setZonaeleitoral(String zonaeleitoral) {
        this.zonaeleitoral = zonaeleitoral;
    }

    /**
     * @return the secao
     */
    public String getSecao() {
        return secao;
    }

    /**
     * @param secao the secao to set
     */
    public void setSecao(String secao) {
        this.secao = secao;
    }

    /**
     * @return the tituloeleitoral
     */
    public String getTituloeleitoral() {
        return tituloeleitoral;
    }

    /**
     * @param tituloeleitoral the tituloeleitoral to set
     */
    public void setTituloeleitoral(String tituloeleitoral) {
        this.tituloeleitoral = tituloeleitoral;
    }

    /**
     * @return the comparecimento
     */
    public String getComparecimento() {
        return comparecimento;
    }

    /**
     * @param comparecimento the comparecimento to set
     */
    public void setComparecimento(String comparecimento) {
        this.comparecimento = comparecimento;
    }
    
    public String getSerCandidato() {
        return serCandidato;
    }

    public void setSerCandidato(String serCandidato) {
        this.serCandidato = serCandidato;
    }

    public void mudaComparecimento() {

        this.comparecimento = "Sim";
    }
    
    public void mudaSerCandidato() {

        this.serCandidato = "Sim";
    }

    public String exibeEleitor1() {

        return this.getCpf() + "\t| " + this.getNome() + "\t| " + this.getIdentidade()
                + "\t| " + this.getTituloeleitoral() + "\t| " + this.getZonaeleitoral()
                + "\t| " + this.getSecao() + "\t| " + this.getComparecimento() + "\t| "
                + this.getSerCandidato();
    }

    public String exibeEleitor2() {

        return this.getCpf() + "\t| " + this.getNome() + "\t| " + this.getIdentidade()
                + "\t| " + this.getTituloeleitoral() + "\t| " + this.getZonaeleitoral()
                + "\t| " + this.getSecao();
    }
    
     public String exibeEleitor3() {

        return this.getCpf() + "\t| " + this.getNome();
    }
 

}
