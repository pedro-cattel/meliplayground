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

    public String getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
