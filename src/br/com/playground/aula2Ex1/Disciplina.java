package br.com.playground.aula2Ex1;

public class Disciplina {

    private String nome;
    private String carga;

    public Disciplina(String nome, String carga) {
        this.nome = nome;
        this.carga = carga;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
}
