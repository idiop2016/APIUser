package sn.uasz.UserApi.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.uasz.UserApi.entities.Enseignant;

import java.util.List;
@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
    public List<Enseignant> findByNomContainsIgnoreCase(String kw);
    public List<Enseignant> findByPrenomContainsIgnoreCase(String kw);
    public Page<Enseignant> findByNomContainsIgnoreCaseOrPrenomContainsIgnoreCase(String kw1, String kw2, Pageable pageable);
}