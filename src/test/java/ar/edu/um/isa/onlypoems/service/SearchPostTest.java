// package ar.edu.um.isa.onlypoems.service;
// import java.util.Optional;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.boot.test.context.SpringBootTest;
// import static org.assertj.core.api.Assertions.assertThat;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
// import ar.edu.um.isa.onlypoems.IntegrationTest;
// import ar.edu.um.isa.onlypoems.domain.Post;
// import ar.edu.um.isa.onlypoems.web.rest.TestUtil;
// import org.testng.Assert;

// @IntegrationTest
// public class SearchPostTest extends AbstractTestNGSpringContextTests{

//     @Autowired
//     private PostService postService;

//     @Test
//     public void testSaveAndFindPostById() throws Exception {
//         TestUtil.equalsVerifier(Post.class);
//         Post post1 = new Post().id(1L).title("Post de Prueba").content("Probar si el post creado es igual al post consultado en la api");
//         postService.save(post1);

//         Optional<Post> foundPost = postService.findOne(1L);
//         assertThat(foundPost).isEqualTo(post1);
//     }

//     @Test
//     public void contextLoaded() {
//         Assert.assertNotNull(postService);
//     }

//     // @BeforeEach
//     // public void testDeletePost() throws Exception {
//     //     TestUtil.equalsVerifier(Post.class);
//     //     Optional<Post> foundPost = postService.findOne(1L);
//     //     if (foundPost.isPresent()) {
//     //         postService.delete(foundPost.get().getId());
//     //     }
//     //     Optional<Post> finalFoundPost = postService.findOne(1L);
//     //     assertFalse(finalFoundPost.isPresent());
//     // }
// }
