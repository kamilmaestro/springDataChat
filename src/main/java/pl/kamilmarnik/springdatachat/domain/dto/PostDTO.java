package pl.kamilmarnik.springdatachat.domain.dto;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public final class PostDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private @NonNull String content;
    private @NonNull String date;
    private @NonNull String userLogin;
}
