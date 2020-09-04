package thymeleaf.exercise.bankofsimba.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thymeleaf.exercise.bankofsimba.model.BankAccount;
import thymeleaf.exercise.bankofsimba.repository.AccountRepo;

@Service
public class AccountService {
  private AccountRepo repo;

  @Autowired
  public AccountService(AccountRepo repo){
    this.repo = repo;
  }

  public List<BankAccount> getAllAccounts() {
    return repo.getAccounts();
  }
}
