import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReversedOrder {
  public static void main(String[] args) throws IOException {
    Path reversOrderedFile = Paths.get("reversed-ordered.txt");
    String reversOrdered = "";
    for (String line : Files.readAllLines(reversOrderedFile)) {
      //System.out.println(line);
      reversOrdered = line +"\n" + reversOrdered;
    }
    Files.write(Paths.get("good-reversed.txt"), reversOrdered.getBytes());
  }
}
