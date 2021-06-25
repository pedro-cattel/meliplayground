package br.com.playground.aula2Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private String serie;
    private ArrayList<Estudante> x;
    private ArrayList<Disciplina> y;

    public Turma(String serie, ArrayList<Estudante> x, ArrayList<Disciplina> y) {
        this.serie = serie;
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {

        ArrayList<Disciplina> disc = new ArrayList<>();
        ArrayList<Estudante> est = new ArrayList<>();

        criaAluno(est);

        criaDisciplina(disc);

        System.out.println("Criando Turmas");

        Turma nonoAno = new Turma("9 ano",est, disc);

        printAluno(est, nonoAno);


    }

    public static  void criaDisciplina(ArrayList<Disciplina> disc){
        Scanner ler = new Scanner(System.in);
        System.out.println("------- Crie 3 disciplinas -------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da disciplina");
            String nome = ler.nextLine();
            System.out.println("Digite a carga horária");
            String carga = ler.nextLine();
            Disciplina x = new Disciplina(nome, carga);
            disc.add(x);
        }
    }

    public static void criaAluno(ArrayList<Estudante> est){
        Scanner ler = new Scanner(System.in);
        System.out.println("------- Crie 3 Alunos -------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome");
            String nome = ler.nextLine();
            System.out.println("Digite a idade");
            String idade = ler.nextLine();
            System.out.println("Digite a matricula");
            String matricula = ler.nextLine();
            System.out.println("Digite a serie");
            String serie = ler.nextLine();
            Estudante x = new Estudante(nome, idade, matricula, serie);
            est.add(x);
        }
    }

    public static void printAluno(ArrayList<Estudante> est, Turma turma){
        for (int i = 0; i < est.size(); i++) {
            System.out.println("No " + turma.serie + " temos esses alunos matriculados: ");
            System.out.println(turma.x.get(i).getNome());
        }
    }

}
