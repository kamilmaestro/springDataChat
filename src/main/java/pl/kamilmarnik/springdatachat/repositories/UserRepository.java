package pl.kamilmarnik.springdatachat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilmarnik.springdatachat.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
