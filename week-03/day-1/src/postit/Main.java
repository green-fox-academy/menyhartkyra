package postit;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt();

    postIt1.setBackgroundColor("orange");
    postIt1.setText("Idea1");
    postIt1.setTextColor("blue");

    System.out.println(postIt1.getText());
    System.out.println(postIt1.getBackgroundColor());

    PostIt postIt2 = new PostIt("Pink", "Awesome","black");
    PostIt postIt3 = new PostIt("yellow","Superb!", "green");

  }
}
