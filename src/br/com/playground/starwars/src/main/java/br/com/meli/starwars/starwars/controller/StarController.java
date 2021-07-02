package br.com.meli.starwars.starwars.controller;


import br.com.meli.starwars.starwars.models.Personagem;
import br.com.meli.starwars.starwars.repository.PersonagemRepository;
import br.com.meli.starwars.starwars.services.StarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StarController {

    StarService starService;

    public StarController(StarService starService) {
        this.starService = starService;
    }

    @GetMapping("/{name}")
    public List<Personagem> getAll(@PathVariable String name){
        if (name == null)
            return starService.findAll();
        return starService.findByName(name);
    }

}
