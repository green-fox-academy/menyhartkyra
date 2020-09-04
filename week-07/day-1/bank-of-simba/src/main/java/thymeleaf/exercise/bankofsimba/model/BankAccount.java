package thymeleaf.exercise.bankofsimba.model;

public class BankAccount {
  String name;
  int balance;
  String animaltype;
  private boolean isKing;

  public BankAccount(String name, int balance, String animaltype, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animaltype = animaltype;
    this.isKing = isKing;
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

  public boolean isKing() {
    return isKing;
  }
  //endregion
}
