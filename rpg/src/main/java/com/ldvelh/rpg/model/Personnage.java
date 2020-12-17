package com.ldvelh.rpg.model;

import java.util.Random;

public class Personnage extends Personne {

    //Attributs

    private int xp;
    private String nom;

    //Contructeurs
    public Personnage(String nom, int vie, int force, int agy, int degatMax){
        super(vie,force,agy,degatMax);
        this.nom=nom;
        this.xp = 0;

    }

    //Accesseurs
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }



}
