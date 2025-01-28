package sn.uasz.UserApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uasz.UserApi.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
}
