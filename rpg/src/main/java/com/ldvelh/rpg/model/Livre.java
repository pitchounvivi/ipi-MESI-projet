package com.ldvelh.rpg.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "livre")
public class Livre {

    @Id
    @Column(name = "livre_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "livre_titre")
    private String titre;

    @Column(name = "livre_resume")
    private String resume;

    @Column(name = "livre_chap1")
    private Integer chap1;


    @OneToMany(mappedBy = "livre", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("livre")
    private Set<Chapitre> chapitres = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Integer getChap1() {
        return chap1;
    }

    public void setChap1(Integer chap1) {
        this.chap1 = chap1;
    }

    public Set<Chapitre> getChapitres() {
        return chapitres;
    }

    public void setChapitres(Set<Chapitre> chapitres) {
        this.chapitres = chapitres;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", resume='" + resume + '\'' +
                ", chap1=" + chap1 +
                ", chapitres=" + chapitres +
                '}';
    }
}
