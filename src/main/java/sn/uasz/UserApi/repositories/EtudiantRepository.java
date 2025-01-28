package sn.uasz.UserApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.uasz.UserApi.entities.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
