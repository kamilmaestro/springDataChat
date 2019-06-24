package pl.kamilmarnik.springdatachat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilmarnik.springdatachat.domain.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Long> {
}
