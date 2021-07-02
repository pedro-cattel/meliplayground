package obterdiploma.demo.dao;

import obterdiploma.demo.dto.MateriaDTO;
import obterdiploma.demo.entity.Aluno;
import obterdiploma.demo.entity.Materias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AlunoDAO {

    private static List<Materias> mat = new ArrayList<>();

    private static List<Aluno> alunos = new ArrayList<Aluno>(
            Arrays.asList(
                    new Aluno(1, "Pedro", mat),
                    new Aluno(2, "Joao", mat)
            )

    );

    public List<Aluno> getList() {
        return alunos;
    }

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarMateria(Materias materia, long id){
        alunos.stream().filter(x -> x.getId() == id).forEach(entry -> entry.setMateria(materia));
    }

    public int calculaMedia(Aluno aluno){
        int x = 0;
        int i;
        for (i = 0; i < aluno.getMat().size(); i++) {
            x =+ Integer.parseInt(aluno.getMat().get(i).getNota());
        }
        x = x/i;
        return x;
    }

    public Aluno get(long id) {
        for (int i = 0; i <= alunos.size(); i++) {
            if (alunos.get(i).getId() == id) {
                return alunos.get(i);
            }
        }
       return null;
    }

}
