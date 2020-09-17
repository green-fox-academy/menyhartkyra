package greenfox.rest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


import greenfox.rest.controller.exceptions.DoublingException;
import greenfox.rest.controller.exceptions.MissingNameAndTitleException;
import greenfox.rest.controller.exceptions.MissingTitleException;
import greenfox.rest.models.Greeting;
import greenfox.rest.models.Number;
import greenfox.rest.repository.LogRepository;
import greenfox.rest.service.LogService;
import greenfox.rest.service.Service;
import greenfox.rest.service.SithService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class RestControllerTest {

  @Mock
  private LogService logService;
  //private Service service;
  //private SithService sithService;

  @InjectMocks
  private RestController restController;

  @Test
  void givenIntegerNumber_whenDoubleNumber_thenReturnDoubleValue() throws DoublingException {
    Number expected = new Number(5);
    Number result = restController.doubleNumber(5);
    assertEquals(expected.toString(), result.toString());
  }

  @Test
  void givenNameAndTitle_whenGreet_thenReturnGreeting()
      throws MissingNameAndTitleException, MissingTitleException {
    ResponseEntity<Greeting> expected =
        ResponseEntity.status(HttpStatus.OK).body(new Greeting("Kyra", "rabbi feeder"));
    ResponseEntity<Greeting> result = restController.greet("Kyra","rabbit feeder");
    assertEquals(expected.getStatusCodeValue(),result.getStatusCodeValue());
    assertEquals(expected.getBody().getWelcome_message(),result.getBody().getWelcome_message());
  }
}