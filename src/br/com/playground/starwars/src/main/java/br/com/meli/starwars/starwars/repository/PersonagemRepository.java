package br.com.meli.starwars.starwars.repository;

import br.com.meli.starwars.starwars.models.Personagem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class PersonagemRepository {

    private static final File FILE = new File("starwars.json");

    ObjectMapper mapper;

    public PersonagemRepository(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public List<Personagem> findAll() {
        List<Personagem> pers = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Personagem>> typeReference = new TypeReference<List<Personagem>>() {};
            pers = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pers;
    }

    public List<Personagem> findByName(String name){
        List<Personagem> print = null;
        return findAll().stream().filter(character -> character.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))).collect(Collectors.toList());
    }


}
