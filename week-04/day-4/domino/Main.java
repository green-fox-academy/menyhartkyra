package domino;

public class Main {
  public static void main(String[] args) {
    Domino domino = new Domino(5,8);
    Todo todo = new Todo("Buy milk", "high", true);
    todo.printAllFields();
    domino.printAllFields();
  }
}
