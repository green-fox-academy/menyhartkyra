import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFiles {
  public static void main(String[] args) {
    try { // Required by Files.readAllLines(filePath);
      // Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String List
      Path filePath = Paths.get("assets/lorem-ipsum.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(0)); // Prints the first line of the file
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}