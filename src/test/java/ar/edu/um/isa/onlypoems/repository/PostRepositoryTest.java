// package ar.edu.um.isa.onlypoems.repository;
// import java.util.Optional;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.junit4.SpringRunner;
// import static org.assertj.core.api.Assertions.assertThat;
// import static org.junit.jupiter.api.Assertions.assertFalse;

// import ar.edu.um.isa.onlypoems.domain.Post;
// import ar.edu.um.isa.onlypoems.web.rest.TestUtil;

// @RunWith(SpringRunner.class)
// // @SpringBootTest
// public class PostRepositoryTest {
//     @Autowired
//     private PostRepository postRepository;

//     @Test
//     public void testSaveAndFindPostById() throws Exception {
//         TestUtil.equalsVerifier(Post.class);
//         Post post1 = new Post().id(1L).title("Post de Prueba").content("Probar si el post creado es igual al post consultado en la api");
//         postRepository.save(post1);

//         Optional<Post> foundPost = postRepository.findOneWithEagerRelationships(1L);
//         assertThat(foundPost).isEqualTo(post1);
//     }

//     @BeforeEach
//     public void testDeletePost() throws Exception {
//         TestUtil.equalsVerifier(Post.class);
//         Optional<Post> foundPost = postRepository.findOneWithEagerRelationships(1L);
//         if (foundPost.isPresent()) {
//             postRepository.delete(foundPost.get());
//         }
//         Optional<Post> finalFoundPost = postRepository.findOneWithEagerRelationships(1L);
//         assertFalse(finalFoundPost.isPresent());
//     }
// }
