package ar.edu.um.isa.onlypoems.domain;

import static org.assertj.core.api.Assertions.assertThat;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.net.URI;
// import java.net.http.HttpClient;
// import java.net.http.HttpHeaders;
// import java.net.http.HttpRequest;
// import java.net.http.HttpResponse;
// import java.net.http.HttpResponse.BodyHandlers;

// import ar.edu.um.isa.onlypoems.repository.PostRepository;
import ar.edu.um.isa.onlypoems.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.http.HttpEntity;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.ObjectWriter;

// @RunWith(SpringRunner.class)
// @SpringBootTest
class PostTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Post.class);
        Post post1 = new Post();
        post1.setId(1L);
        Post post2 = new Post();
        post2.setId(post1.getId());
        assertThat(post1).isEqualTo(post2);
        post2.setId(2L);
        assertThat(post1).isNotEqualTo(post2);
        post1.setId(null);
        assertThat(post1).isNotEqualTo(post2);
    }
    // @Autowired
    // private PostRepository postRepository;

    // @Test
    // public void testSaveAndFindPostById() {
    //   Post post1 = new Post().id(1L).title("Post de Prueba").content("Probar si el post creado es igual al post consultado en la api");
    //   postRepository.save(post1);

    //   Optional<Post> foundPost = postRepository.findOneWithEagerRelationships(1L);
    //   assertThat(foundPost).isEqualTo(post1);
    // }

    // @Autowired
    // private TestRestTemplate restTemplate;

    // @Test
    // public void testSaveAndGetPostById() throws Exception {
    //     TestUtil.equalsVerifier(Post.class);
    //     Post post1 = new Post().id(1L).title("Post de Prueba").content("Probar si el post creado es igual al post consultado en la api");
    //     postRepository.save(post1);

    //     HttpHeaders headers = new HttpHeaders();
    //     headers.set("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTY3NTk1NTUyOH0.hWDmzjak_cyO7gs9N8ZJBqHWYl_hukPacOesPzyXxShtlVNA0mf8UpMHfjFVgFBQH0o_GQVh8-lVzkxF83PTzw");
    //     HttpEntity<String> request = new HttpEntity<>(headers);
    //     ResponseEntity<Post> response = restTemplate.exchange("http://0.0.0.0:8080/api/posts/1L", HttpMethod.GET, request, Post.class);
    //     Post retrievedPost = response.getBody();

    //     assertEquals(post1.getId(), retrievedPost.getId());
    //     assertEquals(post1.getTitle(), retrievedPost.getTitle());
    //     assertEquals(post1.getContent(), retrievedPost.getContent());
    // }

    // @Test
    // void comparingObjectPostMangagmentWithAcallToApi() throws Exception {
    //     TestUtil.equalsVerifier(Post.class);
    //     Post post1 = new Post().id(1L).title("Post de Prueba").content("Probar si el post creado es igual al post consultado en la api");
    //     HttpHeaders headers = new HttpHeaders();
    //     headers.set("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTY3NTk1NTUyOH0.hWDmzjak_cyO7gs9N8ZJBqHWYl_hukPacOesPzyXxShtlVNA0mf8UpMHfjFVgFBQH0o_GQVh8-lVzkxF83PTzw");
    //     HttpEntity<String> request = new HttpEntity<>(headers);
    //     ResponseEntity<Post> response = restTemplate.exchange("http://0.0.0.0:8080/api/posts/1L", HttpMethod.GET, request, Post.class);
    //     Post retrievedPost = response.getBody();
    //     System.out.println("this is a response" + response.body());
    //     ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    //     String json = ow.writeValueAsString(post1);
    //     System.out.println("this is the object to JSON" + json);
    //     assertThat(response.body()).isEqualTo(json);
    //     }

    // @BeforeEach
    // public void testDeletePost() {
    //     Optional<Post> foundPost = postRepository.findOneWithEagerRelationships(1L);
    //     if (foundPost.isPresent()) {
    //         postRepository.delete(foundPost.get());
    //     }
    //     Optional<Post> finalFoundPost = postRepository.findOneWithEagerRelationships(1L);
    //     assertFalse(finalFoundPost.isPresent());
    // }

}
