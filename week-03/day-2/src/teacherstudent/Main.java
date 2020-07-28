package teacherstudent;

import petrolstation.Car;
import petrolstation.Station;

public class Main {
  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();

    student.question(teacher);
    teacher.teach(student);

    //#######################

    Car car = new Car();
    Station station = new Station();

    station.setGasAmount(1000);
    station.refill(car);
    System.out
        .println("car gasamount: " + car.getGasAmount() + " car capacity: " + car.getCapacity());


  }
}
