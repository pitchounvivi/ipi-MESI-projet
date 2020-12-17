package com.ldvelh.rpg.model;

import java.util.Random;

//classe parent de ennemi et personnage
public abstract class Personne {

//attribut
    private int vie;
    private int agy;
    private int force;
    private int degatMax;

    //constructeur
    public Personne(int vie, int agy, int force, int degatMax) {
        this.vie = vie;
        this.agy = agy;
        this.force = force;
        this.degatMax = degatMax;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAgy() {
        return agy;
    }

    public void setAgy(int agy) {
        this.agy = agy;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
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
            this.vie=this.vie-degatInf;
            effet="Echec critique !"+"l'ennemis s'inflige:"+degatInf+"de dégats";
        }

        return effet;
    }

    //esquive de l'ennemis
    public boolean esquiveEnnemi(){
        boolean esq=false;
        Random random=new Random();
        int reussite=random.nextInt(this.agy+1);
        if(reussite<=this.agy){
            esq=true;
        }

        return esq;
    }

}
