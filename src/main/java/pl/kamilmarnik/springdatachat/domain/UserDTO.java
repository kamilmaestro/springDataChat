package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor
public final class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NonNull String login;
    private @NonNull String password;
}
