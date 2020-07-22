import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteMultipleLines {
  public static void main(String[] args) throws IOException {
    // Create a function that takes 3 parameters: a path, a word and a number
    // and is able to write into a file.
    // The path parameter should be a string that describes the location of the file you wish to modify
    // The word parameter should also be a string that will be written to the file as individual lines
    // The number parameter should describe how many lines the file should have.
    // If the word is 'apple' and the number is 5, it should write 5 lines
    // into the file and each line should read 'apple'
    // The function should not raise any errors if it could not write the file.
    writeMultipleLines("write-multiple-lines.txt", "apple", 5);
  }

  public static void writeMultipleLines(String path, String word, int number) throws IOException {
    Path file = Paths.get(path);
    if (Files.exists(file)) {
      Files.delete(file);
    }
    word = word.concat("\n");
    for (int i = 0; i < number; i++) {
      try {
        Files.write(file, word.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
      } catch (IOException e) {
        System.out.println("nem sikerült az írás");
      }
    }
  }

}
