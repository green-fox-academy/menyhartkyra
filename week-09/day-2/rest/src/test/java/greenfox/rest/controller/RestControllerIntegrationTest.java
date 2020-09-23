package greenfox.rest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import greenfox.rest.models.UntilNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class RestControllerIntegrationTest {

  private MockMvc mockMvc;

  @Autowired
  public RestControllerIntegrationTest(MockMvc mockMvc) {
    this.mockMvc = mockMvc;
  }

  @Test
  void givenInputNumber_whenDoubling_thenReturnNumber() throws Exception {
  mockMvc.perform(get("/doubling?input=15"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  void givenNameAndTitle_whenGreet_returnGreeting() throws Exception {
    mockMvc.perform(get("/greeter?title=firefighter&name=Mike"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.welcome_message",is("Oh, hi there Mike, my dear firefighter!")));
  }

  @Test
  void givenAppendable_whenAppendLetterA_thenReturnAppendedWord() throws Exception {
    mockMvc.perform(get("/appenda/ciccc"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.appended",is("ciccca")));
  }

  @Test
  void givenSumActionAndNumber_whenDoUntil_thenReturnSum() throws Exception {
    UntilNumber untilNumber = new UntilNumber(5);
    ObjectMapper objectMapper = new ObjectMapper();
    String until = objectMapper.writeValueAsString(untilNumber);
    mockMvc.perform(post("/dountil/sum").content(until).contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result",is(15)));
  }
}