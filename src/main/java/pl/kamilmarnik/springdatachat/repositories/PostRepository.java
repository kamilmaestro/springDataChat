package pl.kamilmarnik.springdatachat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilmarnik.springdatachat.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
