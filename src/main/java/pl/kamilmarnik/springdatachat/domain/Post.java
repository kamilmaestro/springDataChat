package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "posts")
@Data @NoArgsConstructor
public class Post {
    public static final int MAX_CONTENT_LEN = 75;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = MAX_CONTENT_LEN)
    private String content;

    private String date;

    @Size(min = User.MIN_LOG_LEN, max = User.MAX_LOG_LEN)
    private String userLogin;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
