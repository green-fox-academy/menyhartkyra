package programmer.fox.club.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import programmer.fox.club.demo.model.Fox;

@Service
public class FoxService {
  private List<Fox> foxes = new ArrayList<>();

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void addFox(String petName){
    foxes.add(new Fox(petName));
  }

  public Fox getFox(String petName){
    return foxes.stream().filter(fox -> fox.getName().equals(petName)).findFirst().orElse(null);
  }
}
