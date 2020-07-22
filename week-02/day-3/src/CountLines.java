import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    System.out.println(numberOfLines("my-file2.txt"));
  }

  public static int numberOfLines (String filename) {
    Path file = Paths.get(filename);
    int lines = 0;
    try {
      lines = (int) Files.lines(file).count();
    } catch (IOException e) {
      return 0;
    }
    return lines;
  }

}
