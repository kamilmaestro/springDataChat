package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor
public final class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NotNull String login;
    private @NotNull String password;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }
}
