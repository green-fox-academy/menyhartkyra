package greenfox.rest.controller;

import greenfox.rest.models.Error;
import greenfox.rest.models.Greeting;
import greenfox.rest.models.Number;
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

//  @ExceptionHandler(MissingServletRequestParameterException.class)
//  public NoInputError handleMyException(Exception  exception) {
//    return new NoInputError();
//  }

  @RequestMapping(path = "/greeting", method = RequestMethod.GET)
  public Object greet(@RequestParam(required = false) String name,
                      @RequestParam(required = false) String title) {
    if (name == null || title == null) {
      return new Error("a name and a title");
    }
    return new Greeting(name, title);
  }
}
