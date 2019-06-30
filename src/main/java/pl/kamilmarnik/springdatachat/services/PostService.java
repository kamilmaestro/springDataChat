package pl.kamilmarnik.springdatachat.services;

import pl.kamilmarnik.springdatachat.domain.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();
    Post savePost(Post post);
    String getDate();
}
