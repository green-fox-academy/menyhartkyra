package greenfox.rest.controller;

import greenfox.rest.controller.exceptions.DoublingException;
import greenfox.rest.controller.exceptions.MissingNameAndTitleException;
import greenfox.rest.controller.exceptions.MissingTitleException;
import greenfox.rest.controller.exceptions.SithException;
import greenfox.rest.models.AppendA;
import greenfox.rest.models.ArrayExercise;
import greenfox.rest.models.DoUntil;
import greenfox.rest.models.Error;
import greenfox.rest.models.ErrorMessage;
import greenfox.rest.models.Greeting;
import greenfox.rest.models.Log;
import greenfox.rest.models.LogActivity;
import greenfox.rest.models.Number;
import greenfox.rest.models.SithText;
import greenfox.rest.models.Text;
import greenfox.rest.models.UntilNumber;
import greenfox.rest.service.LogService;
import greenfox.rest.service.Service;
import greenfox.rest.service.SithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  private Service service;
  private LogService logService;
  private SithService sithService;

  @Autowired
  public RestController(Service service, LogService logService, SithService sithService) {
    this.service = service;
    this.logService = logService;
    this.sithService = sithService;
  }

  @RequestMapping(path = "/doubling", method = RequestMethod.GET)
  public Number doubleNumber(@RequestParam(required = false) Integer input)
      throws DoublingException {
    if (input == null) {
      throw new DoublingException();
    }
    logService.addLog(new Log("/doubling", input.toString()));
    return new Number(input);
  }

  @ExceptionHandler(Exception.class)
  public Object handleMyException(Exception e) {
    if (e instanceof DoublingException) {
      return new ErrorMessage("Please provide an input!");
    } else if (e instanceof SithException) {
      return new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm.");
    } else if (e instanceof MissingNameAndTitleException){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a name and a title"));
    } else if (e instanceof MissingTitleException){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a title"));
    }
    return new ErrorMessage("sth wrong");
  }

  @RequestMapping(path = "/greeter", method = RequestMethod.GET)
  public ResponseEntity<Greeting> greet(@RequestParam(required = false) String name,
                                 @RequestParam(required = false) String title)
      throws MissingNameAndTitleException, MissingTitleException {
    if (name == null && title == null) {
      throw new MissingNameAndTitleException();
    } else if (title == null) {
      throw new MissingTitleException();
    }
    logService.addLog(new Log("/greeter", name + ", " + title));
    return ResponseEntity.status(HttpStatus.OK).body(new Greeting(name, title));
  }

  @RequestMapping(path = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendA appendLetterA(@PathVariable String appendable) {
    logService.addLog(new Log("/appenda/" + appendable, appendable));
    return new AppendA(appendable);
  }

  @RequestMapping(path = "/dountil/{action}", method = RequestMethod.POST)
  public DoUntil doUntil(@PathVariable String action, @RequestBody UntilNumber until) {
    logService.getLogRepository().save(new Log("/dountil/" + action, until.toString()));
    return service.calculateResult(action, until);
  }

  @RequestMapping(path = "/arrays", method = RequestMethod.POST)
  public Object doSthWithArray(@RequestBody ArrayExercise arrayExercise) {
    logService.addLog(new Log("/arrays", arrayExercise.toString()));
    return service.calculateArray(arrayExercise);
  }

  @RequestMapping(path = "/log", method = RequestMethod.GET)
  public LogActivity getLog() {
    return logService.getLogInfo();
  }

  @RequestMapping(path = "/sith", method = RequestMethod.POST)
  public SithText createSithText(@RequestBody(required = false) Text text) throws SithException {
    if (text == null) { //null kezeles mehet sithservice-be
      throw new SithException();
    }
    return sithService.sithText(text);
  }
}
