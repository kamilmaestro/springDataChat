package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Data @NoArgsConstructor
public final class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NonNull @Immutable String login;
    private @NonNull String password;
}
