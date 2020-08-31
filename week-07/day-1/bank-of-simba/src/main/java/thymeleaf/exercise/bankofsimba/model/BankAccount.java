package thymeleaf.exercise.bankofsimba.model;

public class BankAccount {
  String name;
  int balance;
  String animaltype;

  public BankAccount(String name, int balance, String animaltype) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltype;
  }

  //region getters setters
  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimaltype() {
    return animaltype;
  }
  //endregion
}
