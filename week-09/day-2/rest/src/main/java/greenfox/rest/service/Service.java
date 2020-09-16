package greenfox.rest.service;

import greenfox.rest.models.ArrayExercise;
import greenfox.rest.models.ArrayResult;
import greenfox.rest.models.DoUntil;
import greenfox.rest.models.Error;
import greenfox.rest.models.UntilNumber;
import greenfox.rest.repository.LogRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
@Getter
public class Service {
  private LogRepository logRepository;

  @Autowired
  public Service(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public DoUntil calculateResult(String action, UntilNumber untilNumber) {
    int until = untilNumber.getUntil();
    if (action.equals("sum")) {
      return new DoUntil(sum(until));
    } else {
      return new DoUntil(factor(until));
    }
  }

  private int sum(int until) {
    int result = 0;
    for (int i = 1; i < until + 1; i++) {
      result += i;
    }
    return result;
  }

  private int factor(int until) {
    int result = 1;
    for (int i = 2; i < until + 1; i++) {
      result *= i;
    }
    return result;
  }

  public Object calculateArray(ArrayExercise arrayExercise){
    if (arrayExercise.getWhat() == null || arrayExercise.getNumbers() == null){
      return new Error("what to do with the numbers");
    }
    if (arrayExercise.getWhat().equals("sum")){
      return calculateArraySum(arrayExercise.getNumbers());
    } else if (arrayExercise.getWhat().equals("multiply")){
      return calculateArrayFactor(arrayExercise.getNumbers());
    } else {
      return calculateDoubleArray(arrayExercise.getNumbers());
    }
  }

  private ArrayResult calculateDoubleArray(int[] array){
    for (int i = 0; i< array.length; i++) {
      array[i] *=2;
    }
    return new ArrayResult(array);
  }

  private DoUntil calculateArraySum(int[] array){
    int result = 0;
    for (int number : array) {
      result += number;
    }
    return new DoUntil(result);
  }

  private DoUntil calculateArrayFactor(int[] array){
    int result = 1;
    for (int number : array) {
      result *= number;
    }
    return new DoUntil(result);
  }
}
