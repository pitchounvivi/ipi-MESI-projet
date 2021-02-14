package com.ldvelh.rpg.controller;

import com.ldvelh.rpg.model.Livre;
import com.ldvelh.rpg.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/livre")
public class LivreController {

    @Autowired
    private LivreRepository livreRepository;


    //Recherche d'un livre avec son id
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public Livre findById(
            @PathVariable(value = "id") Integer id
    ){
        Optional<Livre> livre = livreRepository.findById(id);

        return livre.get();
    }

}
