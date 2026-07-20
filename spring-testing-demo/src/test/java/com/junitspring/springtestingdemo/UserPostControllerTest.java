import com.junitspring.springtestingdemo.MockBean;
import com.junitspring.springtestingdemo.controller.UserController;
import com.junitspring.springtestingdemo.entity.User;
import com.junitspring.springtestingdemo.service.UserService;
import org.junit.jupiter.api.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserPostControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService service;

    @Autowired
    ObjectMapper mapper;

    @Test
    void testCreateUser()
            throws Exception {

        User user =
                new User(1L,"Riya");

        when(service.saveUser(any()))
                .thenReturn(user);

        mockMvc.perform(post("/users")
                        .contentType(
                                MediaType.APPLICATION_JSON)
                        .content(
                                mapper.writeValueAsString(user)))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath("$.name")
                                .value("Riya"));
    }
}