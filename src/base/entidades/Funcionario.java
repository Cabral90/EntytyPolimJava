package base.entidades;

import base.entidades.Pessoal;

public class Funcionario extends Pessoal {

    private String numAgente;
    private String iniFuncao;

    public Funcionario() {
    }

    public Funcionario(String nome, String apelido, String edade, String numAgente, String iniFuncao ) {
        super(nome, apelido, edade);
        this.numAgente = numAgente;
        this.iniFuncao = iniFuncao;
    }

    public String getNumAgente() {
        return numAgente;
    }

    public void setNumAgente(String numAgente) {
        this.numAgente = numAgente;
    }

    public String getIniFuncao() {
        return iniFuncao;
    }

    public void setIniFuncao(String iniFuncao) {
        this.iniFuncao = iniFuncao;
    }

    @Override
    public String toString() {
        return String.format("%s%s%s%n%s%s%n", super.toString(), "Agente nº: ", getNumAgente(), "Data inicio de Funcao: ", getIniFuncao());
    }

}
