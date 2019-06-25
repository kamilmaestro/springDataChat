package pl.kamilmarnik.springdatachat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Data @NoArgsConstructor
public final class PostDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @NonNull String content;
    private @NonNull String date;
    private @NonNull String userLogin;
}
