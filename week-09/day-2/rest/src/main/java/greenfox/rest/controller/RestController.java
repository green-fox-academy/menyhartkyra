package greenfox.rest.controller;

import greenfox.rest.models.AppendA;
import greenfox.rest.models.ArrayExercise;
import greenfox.rest.models.DoUntil;
import greenfox.rest.models.Error;
import greenfox.rest.models.Greeting;
import greenfox.rest.models.Log;
import greenfox.rest.models.Number;
import greenfox.rest.models.UntilNumber;
import greenfox.rest.service.LogService;
import greenfox.rest.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  private Service service;

  @Autowired
  public RestController(Service service) {
    this.service = service;
  }

  @RequestMapping(path = "/doubling", method = RequestMethod.GET)
  public Object doubleNumber(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new Error("an input");
    }
    service.getLogRepository().save(new Log("/doubling", input.toString()));
    return new Number(input);
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public Error handleMyException(Exception exception) {
    return new Error("a number");
  }

  @RequestMapping(path = "/greeter", method = RequestMethod.GET)
  public ResponseEntity<?> greet(@RequestParam(required = false) String name,
                                 @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("a name and a title"));
    } else if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("a title"));
    }
    service.getLogRepository().save(new Log("/greeter", name + ", " + title));
    return ResponseEntity.status(HttpStatus.OK).body(new Greeting(name, title));
  }

  @RequestMapping(path = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendA appendLetterA(@PathVariable String appendable) {
    service.getLogRepository().save(new Log("/appenda/" + appendable, appendable));
    return new AppendA(appendable);
  }

  @RequestMapping(path = "/dountil/{action}", method = RequestMethod.POST)
  public DoUntil doUntil(@PathVariable String action, @RequestBody UntilNumber until) {
    service.getLogRepository().save(new Log("/dountil/" + action, until.toString()));
    return service.calculateResult(action, until);
  }

  @RequestMapping(path = "/arrays", method = RequestMethod.POST)
  public Object doSthWithArray(@RequestBody ArrayExercise arrayExercise) {
    service.getLogRepository().save(new Log("/arrays", arrayExercise.toString()));
    return service.calculateArray(arrayExercise);
  }

  @RequestMapping(path = "/log", method = RequestMethod.GET)
  public LogService getLog(){
    return new LogService(service.getLogRepository());
  }
}
