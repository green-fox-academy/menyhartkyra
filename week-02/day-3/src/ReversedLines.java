import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReversedLines {
  public static void main(String[] args) throws IOException {
    Path reversedFile = Paths.get("reversed-lines.txt");
    String reversed = "";
    for ( String line : Files.readAllLines(reversedFile)  ) {
      //System.out.println(line);
      for (int i = line.length()-1; i >= 0; i--) {
        reversed += line.charAt(i);
      }
      reversed += "\n";
    }
    Files.write(Paths.get("reversed.txt"), reversed.getBytes() );
  }
}
