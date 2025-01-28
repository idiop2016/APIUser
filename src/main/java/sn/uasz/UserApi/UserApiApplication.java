package sn.uasz.UserApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.uasz.UserApi.entities.Enseignant;
import sn.uasz.UserApi.entities.Etudiant;
import sn.uasz.UserApi.repositories.EnseignantRepository;
import sn.uasz.UserApi.repositories.EtudiantRepository;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	EnseignantRepository enseignantRepository;

	@Autowired
	EtudiantRepository etudiantRepository;

	public static void main(String[] args) {

		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) {

		/*Enseignant enseignant1 = new Enseignant();
		enseignant1.setNom("Diop1");
		enseignant1.setPrenom("Ibrahima1");
		enseignant1.setEmail("ibou.ndiaye1@gmail.com");
		enseignant1.setPassword("12343");
		enseignant1.setMatricule("1811852/D");
		enseignant1.setGrade("Professeur Assimulé");
		enseignantRepository.save(enseignant1);*/

		Enseignant enseignant2 = new Enseignant();
		enseignant2.setNom("Fall");
		enseignant2.setPrenom("Modou");
		enseignant2.setEmail("fall.modou@gmail.com");
		enseignant2.setPassword("1234");
		enseignant2.setMatricule("181185/D");
		enseignant2.setGrade("Vacataire");
		enseignantRepository.save(enseignant2);
		/*
		Enseignant enseignant3 = new Enseignant();
		enseignant3.setNom("Ndiaye");
		enseignant3.setPrenom("Ibrahima");
		enseignant3.setEmail("ibou.ndiaye@gmail.com");
		enseignant3.setPassword("1234");
		enseignant3.setMatricule("181185/D");
		enseignant3.setGrade("Vacataire");
		enseignantRepository.save(enseignant3);*/

		Etudiant etudiant1 = new Etudiant();
		etudiant1.setNom("Diop2");
		etudiant1.setPrenom("Ibrahima2");
		etudiant1.setEmail("ibou.diop2@gmail.com");
		etudiant1.setPassword("12342");
		etudiant1.setNumCarte("1811852/D");
		etudiantRepository.save(etudiant1);
		/*Etudiant etudiant2 = new Etudiant();
		etudiant2.setNom("Diop3");
		etudiant2.setPrenom("Ibrahima3");
		etudiant2.setEmail("ibou.ndiaye3@gmail.com");
		etudiant2.setPassword("12343");
		etudiant2.setNumCarte("18118532/D");
		etudiantRepository.save(etudiant2);
		Etudiant etudiant3 = new Etudiant();
		etudiant3.setNom("Diop4");
		etudiant3.setPrenom("Ibrahima4");
		etudiant3.setEmail("ibou.ndiay4e@gmail.com");
		etudiant3.setPassword("12344");
		etudiant3.setNumCarte("1811853/D");
		etudiantRepository.save(etudiant3);*/

		List<Enseignant> enseignants = enseignantRepository.findAll();
		enseignants.forEach(enseignant -> {
			System.out.println("--------------------");
			System.out.println(enseignant.getPrenom());
			System.out.println(enseignant.getNom());
			System.out.println(enseignant.getEmail());
			System.out.println(enseignant.getPassword());
			System.out.println(enseignant.getMatricule());
			System.out.println(enseignant.getGrade());
		});
		List<Etudiant> etudiants = etudiantRepository.findAll();
		etudiants.forEach(etudiant -> {
			System.out.println("--------------------");
			System.out.println(etudiant.getPrenom());
			System.out.println(etudiant.getNom());
			System.out.println(etudiant.getEmail());
			System.out.println(etudiant.getPassword());
			System.out.println(etudiant.getNumCarte());
		});
	}

}
