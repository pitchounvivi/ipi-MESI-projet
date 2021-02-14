package com.ldvelh.rpg;

import com.ldvelh.rpg.model.Chapitre;
import com.ldvelh.rpg.model.Livre;
import com.ldvelh.rpg.repository.ChapitreRepository;
import com.ldvelh.rpg.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    LivreRepository livreRepository;

    @Autowired
    ChapitreRepository chapitreRepository;


    @Override
    public void run(String... args) throws Exception {

//        !!!!Remarque importante = pour que le Runner fonctionne, il faut commenter la ligne
//              spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
//              dans le fichier application.properties
        System.out.println("!!!!!!ESSAI RUNNER!!!!!!");

        Iterable<Livre> livres = livreRepository.findAll();

        for (Livre livre : livres){
            Set<Chapitre> chapitres = livre.getChapitres();
            System.out.println("**Livre** : " + livre.getTitre());
            System.out.println("avec pour chapitre 1 : " + livre.getChap1());

            for (Chapitre chapitre : chapitres){
                print("Chapitre = " + chapitre.getTitre());
            }
        }
    }

    //Méthode pour print un objet
    public static void print(Object o){
        System.out.println(o);
    }



}
