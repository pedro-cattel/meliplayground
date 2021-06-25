package br.com.playground.aula2Ex1;

public class Estudante {

    private String nome;
    private String idade;
    private String matricula;
    private String serie;

    public Estudante(String nome, String idade, String matricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

}
