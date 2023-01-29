package ar.edu.um.isa.onlypoems.service.impl;

import ar.edu.um.isa.onlypoems.domain.Post;
import ar.edu.um.isa.onlypoems.repository.PostRepository;
import ar.edu.um.isa.onlypoems.service.PostService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Post}.
 */
@Service
@Transactional
public class PostServiceImpl implements PostService {

    private final Logger log = LoggerFactory.getLogger(PostServiceImpl.class);

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        log.debug("Request to save Post : {}", post);
        return postRepository.save(post);
    }

    @Override
    public Post update(Post post) {
        log.debug("Request to save Post : {}", post);
        return postRepository.save(post);
    }

    @Override
    public Optional<Post> partialUpdate(Post post) {
        log.debug("Request to partially update Post : {}", post);

        return postRepository
            .findById(post.getId())
            .map(existingPost -> {
                if (post.getTitle() != null) {
                    existingPost.setTitle(post.getTitle());
                }
                if (post.getContent() != null) {
                    existingPost.setContent(post.getContent());
                }
                if (post.getGenre() != null) {
                    existingPost.setGenre(post.getGenre());
                }
                if (post.getDate() != null) {
                    existingPost.setDate(post.getDate());
                }

                return existingPost;
            })
            .map(postRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> findAll() {
        log.debug("Request to get all Posts");
        return postRepository.findAll();
    }

    public Page<Post> findAllWithEagerRelationships(Pageable pageable) {
        return postRepository.findAllWithEagerRelationships(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Post> findOne(Long id) {
        log.debug("Request to get Post : {}", id);
        return postRepository.findOneWithEagerRelationships(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Post : {}", id);
        postRepository.deleteById(id);
    }
}
