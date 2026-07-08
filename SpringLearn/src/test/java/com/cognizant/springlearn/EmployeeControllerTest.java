package com.cognizant.springlearn;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUpdateEmployeeValidationFailure() throws Exception {

        String employeeJson = """
        {
            "id": 1,
            "name": "",
            "salary": -1000,
            "permanent": true,
            "dateOfBirth": "10/05/2000",
            "department": {
                "id": 101,
                "name": "IT"
            },
            "skills": [
                {
                    "id": 1,
                    "name": "Java"
                }
            ]
        }
        """;

        mockMvc.perform(put("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(employeeJson))
                .andExpect(status().isBadRequest());
    }
}