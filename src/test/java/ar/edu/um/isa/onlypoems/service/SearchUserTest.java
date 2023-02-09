package ar.edu.um.isa.onlypoems.service;

import ar.edu.um.isa.onlypoems.IntegrationTest;
import ar.edu.um.isa.onlypoems.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@IntegrationTest
public class SearchUserTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userService;

    @BeforeSuite
    public void setUp() {
        System.out.println("Iniciar Test suite de SearchUser");
    }

    @Test
    public void contextLoaded() {
        Assert.assertNotNull(userService);
    }

    @Test(testName = "Buscar por login/username")
    public void searchByLogin() {
        String query = "user";
        List<User> result = userService.searchUser(query);
        Assert.assertTrue(result.size() > 0); // Debe existir al menos un usuario
        for (User user : result) {
            Assert.assertEquals(user.getLogin(), query);
        }
    }
}
