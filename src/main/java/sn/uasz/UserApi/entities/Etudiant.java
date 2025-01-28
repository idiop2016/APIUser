package sn.uasz.UserApi.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@DiscriminatorValue(value = "ETUD")
public class Etudiant extends User{
    private String nom;
    private String prenom;
    private String numCarte;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumCarte() {
        return numCarte;
    }
}
