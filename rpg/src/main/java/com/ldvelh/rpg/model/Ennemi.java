package com.ldvelh.rpg.model;

import java.util.Random;

public class Ennemi extends Personne{

    //attributs
    private String nomEnnemi;


    //Contructeur
    public Ennemi(String nomEnnemi, int vie, int force, int agy, int degatMax) {
        super(vie, agy, force, degatMax);
        this.nomEnnemi=nomEnnemi;

    }

    //getter setter
    public String getNomEnnemi() {
        return nomEnnemi;
    }

    public void setNomEnnemi(String nomEnnemi) {
        this.nomEnnemi = nomEnnemi;
    }




}
