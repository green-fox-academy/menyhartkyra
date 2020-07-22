import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Doubled {
  public static void main(String[] args) throws IOException {
    Path file = Paths.get("duplicated-chars.txt");
    String decrypted = "";
    for ( String line : Files.readAllLines(file)  ) {
      //System.out.println(line);
      for (int i = 0; i < line.length(); i+=2) {
        decrypted += line.charAt(i);
      }
      decrypted += "\n";
    }
    Files.write(Paths.get("decryptred.txt"), decrypted.getBytes() );

  }
}
