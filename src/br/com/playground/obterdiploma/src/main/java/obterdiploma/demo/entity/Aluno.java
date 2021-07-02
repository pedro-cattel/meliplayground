package obterdiploma.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private long id;
    private String nome;
    private List<Materias> mat = new ArrayList<>();

    public Aluno(long id, String nome, List<Materias> mat) {
        this.id = id;
        this.nome = nome;
        this.mat = mat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Materias> getMat() {
        return mat;
    }

    public void setMat(List<Materias> mat) {
        this.mat = mat;
    }

    public void setMateria(Materias x){
        mat.add(x);
    }
}
