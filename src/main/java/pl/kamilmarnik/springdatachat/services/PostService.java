package pl.kamilmarnik.springdatachat.services;

import pl.kamilmarnik.springdatachat.domain.Post;

import java.util.List;

public interface PostService {
    public List<Post> getPosts();
}
