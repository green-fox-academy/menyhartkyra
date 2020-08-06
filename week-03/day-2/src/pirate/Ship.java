package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> pirates;
  Pirate captain;

  public Ship(){
    pirates = new ArrayList<>();
    captain = new Pirate("the captain");
  }

  public void fillship(){
    fillPirates();
  }

  public void fillPirates(){
    for (int i = 0; i < Pirate.getRandomNumber(10); i++) {
      String name = String.valueOf(i);
      pirates.add(new Pirate(name));
    }
  }

  public void info(){

    if (captain.getIntoxication() == 0) {
      System.out.println("The Captain hasn't consumed rum yet.");
    } else {
      System.out.println("The captain has consumed " + captain.getIntoxication() + " amount of rum.");
    }
    System.out.println("The captain is " + captain.getState());
    int numberOfAlive = 0;
    for ( Pirate pirate: pirates ) {
      if (pirate.getState() ==  "alive" || pirate.getState() == "passed out" )
        numberOfAlive++;
    }
    System.out.println(numberOfAlive + " pirates are alive.");
  }

}
