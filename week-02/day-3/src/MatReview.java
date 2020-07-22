import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MatReview {
  public static void main(String[] args) {
    createFile("test.txt");
    throw new RuntimeException();

    //System.out.println("vége");
  }

  public static void createFile(String fileName){
    try {
      Files.createFile(Paths.get(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
