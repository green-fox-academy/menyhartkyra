package greenfox.rest.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import greenfox.rest.controller.exceptions.DoublingException;
import greenfox.rest.controller.exceptions.MissingNameAndTitleException;
import greenfox.rest.controller.exceptions.MissingTitleException;
import greenfox.rest.controller.exceptions.SithException;
import greenfox.rest.models.AppendA;
import greenfox.rest.models.ArrayExercise;
import greenfox.rest.models.DoUntil;
import greenfox.rest.models.Greeting;
import greenfox.rest.models.LogActivity;
import greenfox.rest.models.Number;
import greenfox.rest.models.SithText;
import greenfox.rest.models.Text;
import greenfox.rest.models.UntilNumber;
import greenfox.rest.service.LogService;
import greenfox.rest.service.CalculatorService;
import greenfox.rest.service.SithService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class RestControllerTest {

  @Mock
  private LogService logService;
  @Mock
  private CalculatorService calculatorService;
  @Mock
  private SithService sithService;

  @InjectMocks
  private RestController restController;

  @Test
  void givenIntegerNumber_whenDoubleNumber_thenReturnDoubleValue()
      throws DoublingException, JsonProcessingException {
    Number expected = new Number(5);
    Number result = restController.doubleNumber(5);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(result);
    int resultNumber = JsonPath.parse(json).read("$['result']");
    verify(logService, atLeastOnce()).addLog(any());
    assertEquals(expected.toString(), result.toString());
    assertEquals(10, resultNumber);
  }

  @Test
  void givenNameAndTitle_whenGreet_thenReturnGreeting()
      throws MissingNameAndTitleException, MissingTitleException {
    ResponseEntity<Greeting> expected =
        ResponseEntity.status(HttpStatus.OK).body(new Greeting("Kyra", "rabbit feeder"));
    ResponseEntity<Greeting> result = restController.greet("Kyra", "rabbit feeder");
    assertEquals(expected.getStatusCodeValue(), result.getStatusCodeValue());
    assertEquals(expected.getBody().getWelcome_message(), result.getBody().getWelcome_message());
  }

  @Test
  void givenWord_whenAppendLetterA_thenAppend() {
    AppendA expected = new AppendA("pirosk");
    AppendA result = restController.appendLetterA("pirosk");
//    ObjectMapper mapper = new ObjectMapper();
//    String json = mapper.writeValueAsString(result);
//    String resultWord = JsonPath.parse(json).read("$['appended']");
//    assertEquals("piroska",resultWord);
    assertEquals(expected.getAppended(), result.getAppended());
  }

  @Test
  void givenActionSumAndNumber_whenDoUntil_thenReturnResult() {
    UntilNumber untilNumber = new UntilNumber(5);
    when(calculatorService.calculateResult("sum", untilNumber)).thenReturn(new DoUntil(14));
    DoUntil result = restController.doUntil("sum", untilNumber);
    assertEquals(14, result.getResult());
  }

  @Test
  void givenActionFactorAndNumber_whenDoUntil_thenReturnResult() {
    UntilNumber untilNumber = new UntilNumber(5);
    when(calculatorService.calculateResult("factor", untilNumber)).thenReturn(new DoUntil(120));
    DoUntil result = restController.doUntil("factor", untilNumber);
    assertEquals(120, result.getResult());
  }

  @Test
  void givenArrayExerciseSum_whenDoSthWithArray_thenReturnResult() {
    ArrayExercise sumArray = new ArrayExercise("sum", new int[] {1, 2, 3, 4});
    when(calculatorService.calculateArray(sumArray)).thenReturn(10);
    Object sumExpected = calculatorService.calculateArray(sumArray);
    Object sumResult = restController.doSthWithArray(sumArray);
    assertEquals(sumExpected, sumResult);
  }

  @Test
  void givenArrayExerciseMultiply_whenDoSthWithArray_thenReturnResult() {
    ArrayExercise multiplyArray = new ArrayExercise("multiply", new int[] {1, 2, 3, 4});
    when(calculatorService.calculateArray(multiplyArray)).thenReturn(24);
    Object multiplyExpected = calculatorService.calculateArray(multiplyArray);
    Object multiplyResult = restController.doSthWithArray(multiplyArray);
    assertEquals(multiplyExpected, multiplyResult);
  }

  @Test
  void givenArrayExerciseDouble_whenDoSthWithArray_thenReturnResult() {
    ArrayExercise doubleArray = new ArrayExercise("double", new int[] {1, 2, 3, 4});
    when(calculatorService.calculateArray(doubleArray)).thenReturn(new int[] {2, 4, 6, 8});
    Object doubleExpected = calculatorService.calculateArray(doubleArray);
    Object doubleResult = restController.doSthWithArray(doubleArray);
    assertEquals(doubleExpected, doubleResult);
  }

  @Test
  void givenExistingLogs_whenGetLog_thenReturnLogInfo() {
    LogActivity logActivity = new LogActivity();
    when(logService.getLogInfo()).thenReturn(logActivity);
    assertEquals(logActivity, restController.getLog());
  }

  @Test
  void givenText_whenCreateSithText_thenReturnSithText() throws SithException {
    Text text = new Text("Hello there Kylo. How have you been?");
    when(sithService.sithText(text))
        .thenReturn(new SithText("Hello there Kylo. How have you been?"));
    assertEquals("Hello there Kylo. How have you been?",restController.createSithText(text).getSithText());
  }



}