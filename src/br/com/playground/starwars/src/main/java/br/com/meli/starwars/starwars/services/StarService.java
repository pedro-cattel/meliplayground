package br.com.meli.starwars.starwars.services;

import br.com.meli.starwars.starwars.models.Personagem;
import br.com.meli.starwars.starwars.repository.PersonagemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Service
public class StarService {


    PersonagemRepository personagemRepository;

    public StarService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    public List<Personagem> findAll() {
        return personagemRepository.findAll();
    }

    public List<Personagem> findByName(String url){
        return personagemRepository.findByName(url);
    }
}

