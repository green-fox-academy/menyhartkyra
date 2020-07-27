package matReview;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Tree tree = new Tree("bükk","male","zöld", 15);
    System.out.println(tree.getType());
    Tree newTree = new Tree("fenyő","female","sötétzöld");
    System.out.println(newTree.getAge() + newTree.getType());

    Scanner scanner = new Scanner(System.in);
  }
}
