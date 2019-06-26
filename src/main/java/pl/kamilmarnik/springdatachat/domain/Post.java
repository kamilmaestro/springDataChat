package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "posts")
@Data @NoArgsConstructor
public final class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NotNull String content;
    private @NotNull String date;
    private @NotNull String userLogin;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
