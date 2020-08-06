package domino;

public class Todo implements Printable{
  private String task;
  private String priority;
  private boolean isDone;

  public Todo(String task, String priority, boolean isDone){
    this.task = task;
    this.priority = priority;
    this.isDone = isDone;
  }

  @Override
  public void printAllFields() {
    System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isDone);
  }
}
