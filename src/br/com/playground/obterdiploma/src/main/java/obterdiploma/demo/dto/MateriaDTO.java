package obterdiploma.demo.dto;

import obterdiploma.demo.dao.AlunoDAO;
import obterdiploma.demo.entity.Aluno;
import obterdiploma.demo.entity.Materias;

import java.util.List;
import java.util.stream.Collectors;

public class MateriaDTO {

    private String nome;
    private String nota;

    public MateriaDTO(String nome, String nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public MateriaDTO(Materias m){
        this.nome = m.getNome();
        this.nota = m.getNota();
    }

    public static MateriaDTO converte(Materias m) {
        return new MateriaDTO(m.getNome(), m.getNota());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
