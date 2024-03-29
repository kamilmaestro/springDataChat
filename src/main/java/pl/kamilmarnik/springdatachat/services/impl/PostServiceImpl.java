package pl.kamilmarnik.springdatachat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kamilmarnik.springdatachat.domain.Post;
import pl.kamilmarnik.springdatachat.repositories.PostRepository;
import pl.kamilmarnik.springdatachat.services.PostService;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(Post post) {
        postRepository.save(post);
        return post;
    }

    @Override
    public String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return simpleDateFormat.format(Calendar.getInstance().getTime());
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
}
