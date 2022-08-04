package com.example.codeup.springblog;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringblogApplication.class)
@AutoConfigureMockMvc
public class LoginIntegrationTest {

    @Autowired
    private MockMvc mvc;

    // sanity test
    @Test
    public void testIfContextLoads(){
        assertNotNull(mvc);
    }

    @Test
    public void testIfLoginPageWorks() throws Exception {
        this.mvc.perform(get("/login"))
                .andExpect(content().string(containsString("Login")));
    }
}
