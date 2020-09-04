package thymeleaf.exercise.bankofsimba.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import thymeleaf.exercise.bankofsimba.model.BankAccount;

@Repository
public class AccountRepo {
  private List<BankAccount> accounts;

  public AccountRepo(){
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Scar",5000,"lion"));
    accounts.add(new BankAccount("Mufasa", 8000,"lion"));
    accounts.add(new BankAccount("Timon",10000,"meerkat"));
  }

  public List<BankAccount> getAccounts() {
    return accounts;
  }
}
