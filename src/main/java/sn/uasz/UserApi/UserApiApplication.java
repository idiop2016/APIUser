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


		Enseignant enseignant2 = new Enseignant();
		enseignant2.setMatricule("Fall");
		enseignant2.setPrenom("Modou");
		enseignant2.setEmail("fall.modou@gmail.com");
		enseignant2.setPassword("1234");
		enseignant2.setMatricule("181185/D");
		enseignant2.setGrade("Vacataire");
		enseignantRepository.save(enseignant2);

		Etudiant etudiant1 = new Etudiant();
		etudiant1.setNom("Diop2");
		etudiant1.setPrenom("Ibrahima2");
		etudiant1.setEmail("ibou.diop2@gmail.com");
		etudiant1.setPassword("12342");
		etudiant1.setNumCarte("1811852/D");
		etudiantRepository.save(etudiant1);

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
