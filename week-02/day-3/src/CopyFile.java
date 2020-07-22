import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
  public static void main(String[] args) throws IOException {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    for (String line : Files.readAllLines(Paths.get("my-file.txt"))) {
      System.out.println(line);
    }
    for (String line : Files.readAllLines(Paths.get("test.txt"))) {
      System.out.println(line);
    }

    System.out.println(copyFile("my-file.txt", "test.txt"));
  }

  public static boolean copyFile(String filename1, String filename2) {
    Path file1 = Paths.get(filename1);
    Path file2 = Paths.get(filename2);
    try {
      Files.copy(file2, file1, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return true;
  }
}
