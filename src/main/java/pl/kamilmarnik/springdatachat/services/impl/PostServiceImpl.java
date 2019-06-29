package pl.kamilmarnik.springdatachat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kamilmarnik.springdatachat.domain.Post;
import pl.kamilmarnik.springdatachat.repositories.PostRepository;
import pl.kamilmarnik.springdatachat.services.PostService;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}
