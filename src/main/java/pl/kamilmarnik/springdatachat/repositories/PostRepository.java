package pl.kamilmarnik.springdatachat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilmarnik.springdatachat.domain.PostDTO;

public interface PostRepository extends JpaRepository<PostDTO, Long> {
}
