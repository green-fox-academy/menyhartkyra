package teacherstudent;

public class Teacher {

  public void answer() {
    System.out.println("the teacher is answering a question");
  }

  public void teach(Student student) {
    student.learn();
  }

}
