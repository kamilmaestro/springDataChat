package pl.kamilmarnik.springdatachat.services;

import pl.kamilmarnik.springdatachat.domain.Post;

public interface PostService {
    Iterable<Post> getPosts();
    Post savePost(Post post);
    String getDate();
    Post getPostById(Long id);
}
