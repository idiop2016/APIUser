package sn.uasz.UserApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uasz.UserApi.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
