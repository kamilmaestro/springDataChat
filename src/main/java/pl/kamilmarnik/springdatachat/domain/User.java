package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor
public class User {
    protected static final int MIN_LOG_LEN = 5;
    protected static final int MAX_LOG_LEN = 25;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = MIN_LOG_LEN, max = MAX_LOG_LEN)
    private String login;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;
}
