package dependency.exercise;

import dependency.exercise.coloring.MyColor;
import dependency.exercise.hellodi.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ExerciseApplication.class, args);
  }

  Printer printer;
  MyColor color;

  @Override
  public void run(String... args) throws Exception {
    color.printColor();
  }

  @Autowired
  public ExerciseApplication(MyColor color) {
    this.color = color;
  }
}

