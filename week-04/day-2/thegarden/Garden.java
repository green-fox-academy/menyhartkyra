package thegarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;


  public Garden(){
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void water(int waterAmount) {
    int cnt = 0;
    for (Plant plant : plants) {
      if (plant.doesNeedWater()) {
        cnt++;
      }
    }
    double waterForOnePlant = waterAmount / cnt;
    for (Plant plant : plants) {
      if (plant.doesNeedWater()) {
        if (plant instanceof Flower) {
          plant.setWaterAmount(plant.getWaterAmount() + 0.75 * waterForOnePlant);
        } else if (plant instanceof Tree) {
          plant.setWaterAmount(plant.getWaterAmount() + 0.4 * waterForOnePlant);
        }
      }
    }
    System.out.println("\nWatering with " + waterAmount + ".");
  }

  void info() {
    for (Plant plant : plants) {
      if (plant.doesNeedWater()) {
        System.out.println("The " + plant.getColour() + " " + plant.getClass().getSimpleName() + " needs water.");
      } else {
        System.out.println(
            "The " + plant.getColour() + " " + plant.getClass().getSimpleName() + " doesnt need water.");
      }
    }
  }

}
