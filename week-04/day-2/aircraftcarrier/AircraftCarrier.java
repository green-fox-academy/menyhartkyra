package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  private List<Aircraft> aircrafts;
  private int storeOfAmmo;
  private int hp;

  public AircraftCarrier(int storeOfAmmo, int hp){
    aircrafts = new ArrayList<>();
    this.storeOfAmmo = storeOfAmmo;
    this.hp = hp;
  }

  void add(Aircraft aircraft){
    aircrafts.add(aircraft);
  }

  /*void fill(){
    for (Aircraft aircraft: aircrafts  ) {
      while (storeOfAmmo > aircraft.getMaxAmmo() - aircraft.getAmmo())
        if (aircraft.isPriority())

    }
  }*/

}
