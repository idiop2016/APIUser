package sn.uasz.UserApi.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
@DiscriminatorValue(value = "PROF")
public class Enseignant extends User{

    private String nom;
    private String prenom;
    private String matricule;
    private String grade;
    private String createby;
    private String createat;

}
