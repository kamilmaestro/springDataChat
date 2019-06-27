package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NotNull String login;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;
}
