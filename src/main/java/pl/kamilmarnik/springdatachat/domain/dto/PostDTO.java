package pl.kamilmarnik.springdatachat.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Table(name = "Post")
@Data @NoArgsConstructor
public final class PostDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NonNull String content;
    private @NonNull String date;
    private @NonNull @Immutable String userLogin;
}
