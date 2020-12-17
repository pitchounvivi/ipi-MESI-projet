package rpg.src.main.java.com.ldvelh.rpg;

public class Personnage {

    //Attributs
    private int vie;
    private int xp;
    private int agy;
    private int force;

    //Contructeurs
    public Personnage(){
        vie = 100;
        xp = 0;
        agy = 10;
        force = 10;
    }

    //Accesseurs
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

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
