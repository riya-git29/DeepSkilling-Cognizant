import com.junitspring.springtestingdemo.MockBean;
import com.junitspring.springtestingdemo.controller.UserController;
import com.junitspring.springtestingdemo.entity.User;
import com.junitspring.springtestingdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService service;

    @Test
    void testGetUser() throws Exception {

        User user =
                new User(1L,"Riya");

        when(service.getUserById(1L))
                .thenReturn(user);

        mockMvc.perform(
                        get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath("$.name")
                                .value("Riya"));
    }
}