package APIBrieuc.ArtifactB.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import java.util.Date;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;

    private String nom;

    public String getNom() {
        return nom;
    }

    public Long getId() {
        return id;
    }

    public Date getCreation() {
        return creation;
    }

    public String getContent() {
        return content;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
