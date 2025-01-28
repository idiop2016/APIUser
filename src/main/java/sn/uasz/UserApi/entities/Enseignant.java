package sn.uasz.UserApi.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@DiscriminatorValue(value = "PROF")
public class Enseignant extends User{
    private String nom;
    private String prenom;
    private String matricule;
    private String grade;
    private String createby;
    private String createat;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getGrade() {
        return grade;
    }

    public String getCreateby() {
        return createby;
    }

    public String getCreateat() {
        return createat;
    }
}
