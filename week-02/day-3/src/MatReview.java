import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MatReview {
  public static void main(String[] args) throws IOException {
    //createFile("test.txt");
    //throw new RuntimeException();

    //System.out.println("vége");
    System.out.println(numberOfLines("my-file2.txt"));
    System.out.println("hiba után"); //ezt már nem irja ki ha hiba volt
  }

  public static void createFile(String fileName){
    try {
      Files.createFile(Paths.get(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static int numberOfLines (String filename) throws IOException {
    Path file = Paths.get(filename);
    int lines = 0;
    lines = (int) Files.lines(file).count();
    return lines;
  }
}
