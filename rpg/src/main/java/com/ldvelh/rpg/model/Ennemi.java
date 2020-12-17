package com.ldvelh.rpg.model;

import java.util.Random;

public class Ennemi {

    //attributs
    private String nomEnnemi;
    private int hp;
    private int force;
    private int agy;
    private int degatMax;


    //Contructeur
    public Ennemi(String nomEnnemi, int hp, int force, int agy, int degatMax) {
        this.nomEnnemi=nomEnnemi;
        this.hp = hp;
        this.force = force;
        this.agy = agy;
        this.degatMax = degatMax;
    }

    //getter setter
    public String getNomEnnemi() {
        return nomEnnemi;
    }

    public void setNomEnnemi(String nomEnnemi) {
        this.nomEnnemi = nomEnnemi;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgy() {
        return agy;
    }

    public void setAgy(int agy) {
        this.agy = agy;
    }

    public int getDegatMax() {
        return degatMax;
    }

    public void setDegatMax(int degatMax) {
        this.degatMax = degatMax;
    }

    //jet de degat aléatoire de l'enemis en fonction des degats max
    //si reussite = "réussite !" random, mais si réussite = "réussite critique !" nbMax*2
    public int degatAleatoire(String reussite){
        int dgt=1;
        if(reussite=="Réussite !"){
            Random random=new Random();
            dgt= random.nextInt(this.degatMax+ 0);
        }else{
            dgt=this.degatMax*2;
        }
        return dgt;

    }

    public String jetDeReussiteForce(){
        String effet="";

        Random random=new Random();
        int alea= random.nextInt(this.force+1);
        if(alea<=5){
            effet="Réussite critique !";
        }else if(alea<=this.force){
            effet="Réussite !";
        }else if(alea<=94){
            effet="Echec !";
        }else{
            int degatInf= random.nextInt(this.degatMax+1);
            this.hp=hp-degatInf;
            effet="Echec critique !"+"l'ennemis s'inflige:"+degatInf+"de dégats";
        }

        return effet;
    }

    //esquive de l'ennemis
    public boolean esquiveEnnemi(){
        boolean esq=false;
        Random random=new Random();
        int reussite=random.nextInt(this.agy+1);
        if(reussite<=agy){
            esq=true;
        }

        return esq;
    }

}
