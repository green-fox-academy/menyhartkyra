package greenfox.rest.controller;

import greenfox.rest.models.AppendA;
import greenfox.rest.models.DoUntil;
import greenfox.rest.models.Error;
import greenfox.rest.models.Greeting;
import greenfox.rest.models.Number;
import greenfox.rest.models.UntilNumber;
import org.springframework.http.HttpMessage;
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

  @RequestMapping(path = "/doubling", method = RequestMethod.GET)
  public Object doubleNumber(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new Error("an input");
    }
    return new Number(input);
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public Error handleMyException(Exception  exception) {
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
    return ResponseEntity.status(HttpStatus.OK).body(new Greeting(name, title));
  }

  @RequestMapping(path = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendA appendLetterA(@PathVariable String appendable){
    return new AppendA(appendable);
  }

  @RequestMapping(path = "/dountil/{action}", method = RequestMethod.POST)
  public Object doUntil(@PathVariable String action, @RequestBody UntilNumber until){
    return new DoUntil(action, until);
  }
}
