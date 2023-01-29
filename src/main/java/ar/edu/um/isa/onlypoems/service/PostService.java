package ar.edu.um.isa.onlypoems.service;

import ar.edu.um.isa.onlypoems.domain.Post;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link Post}.
 */
public interface PostService {
    /**
     * Save a post.
     *
     * @param post the entity to save.
     * @return the persisted entity.
     */
    Post save(Post post);

    /**
     * Updates a post.
     *
     * @param post the entity to update.
     * @return the persisted entity.
     */
    Post update(Post post);

    /**
     * Partially updates a post.
     *
     * @param post the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Post> partialUpdate(Post post);

    /**
     * Get all the posts.
     *
     * @return the list of entities.
     */
    List<Post> findAll();

    /**
     * Get all the posts with eager load of many-to-many relationships.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Post> findAllWithEagerRelationships(Pageable pageable);

    /**
     * Get the "id" post.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Post> findOne(Long id);

    /**
     * Delete the "id" post.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}