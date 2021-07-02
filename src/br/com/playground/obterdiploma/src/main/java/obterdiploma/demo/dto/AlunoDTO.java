package obterdiploma.demo.dto;

import obterdiploma.demo.dao.AlunoDAO;
import obterdiploma.demo.entity.Aluno;
import obterdiploma.demo.entity.Materias;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlunoDTO {

    private String nome;
    private List<Materias> mat = new ArrayList<>();

    public AlunoDTO(String nome, List<Materias> mat) {
        this.nome = nome;
        this.mat = mat;
    }

    public static AlunoDTO converte(Aluno aluno) {
        return new AlunoDTO(aluno.getNome(), aluno.getMat());
    }

    public static Aluno converte(AlunoDTO anuncio, AlunoDAO dao) {
        return new Aluno(dao.getList().size()+1, anuncio.getNome(), anuncio.getMat());
    }

    public static List<AlunoDTO> converte(List<Aluno> anuncios) {
        return anuncios.stream().map(a -> new AlunoDTO(a)).collect(Collectors.toList());
    }

    public AlunoDTO(Aluno a){
        this.nome = a.getNome();
        this.mat = a.getMat();
    }

    public String getNome() {
        return nome;
    }


    public List<Materias> getMat() {
        return mat;
    }

}
