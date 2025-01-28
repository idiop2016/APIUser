package sn.uasz.UserApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.uasz.UserApi.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
