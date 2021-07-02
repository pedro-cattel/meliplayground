package obterdiploma.demo;

import obterdiploma.demo.dao.AlunoDAO;
import obterdiploma.demo.dto.AlunoDTO;
import obterdiploma.demo.dto.MateriaDTO;
import obterdiploma.demo.entity.Aluno;
import obterdiploma.demo.entity.Materias;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class Controller {

    private AlunoDAO dao = new AlunoDAO();

    @PostMapping("/cadastra/aluno")
    public ResponseEntity<AlunoDTO> cadastra(@RequestBody AlunoDTO alunoDTO, UriComponentsBuilder uriBuilder) {
        Aluno aluno = AlunoDTO.converte(alunoDTO, dao);
        dao.adicionar(aluno);
        URI uri = uriBuilder.path("/aluno/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    @RequestMapping("/aluno/{id}")
    public AlunoDTO obterAluno(@PathVariable long id) {
        Aluno aluno = dao.get(id);
        AlunoDTO alunoDTO = AlunoDTO.converte(aluno);
        return alunoDTO;
    }

    @GetMapping("/all")
    public List<AlunoDTO> obterAlunos() {
        List<Aluno> alunos = dao.getList();
        List<AlunoDTO> dtos = AlunoDTO.converte(alunos);
        return dtos;
    }

    @PostMapping("/cadastra/materia/{id}")
    public ResponseEntity<AlunoDTO> cadastraMateria(@PathVariable long id, @RequestBody Materias materia, UriComponentsBuilder uriBuilder) {
        dao.adicionarMateria(materia, id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping("/media/{id}")
    public String calculaMedia(@PathVariable long id) {
        Aluno aluno = dao.get(id);
        int x = dao.calculaMedia(aluno);
        if ( x > 9){
            return "Parabéns! Sua média é : " + x;
        }
        return "Reprovado";
    }

}
