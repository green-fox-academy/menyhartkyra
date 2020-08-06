package thegarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public Garden() {
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
        plant.water(waterForOnePlant);
      }
    }
    System.out.println("\nWatering with " + waterAmount + ".");
  }

  void info() {
    for (Plant plant : plants) {
      if (plant.doesNeedWater()) {
        System.out.println(
            "The " + plant.getColour() + " " + plant.getClass().getSimpleName() + " needs water. " +
                plant.getWaterAmount());
      } else {
        System.out.println(
            "The " + plant.getColour() + " " + plant.getClass().getSimpleName() +
                " doesnt need water. " + plant.getWaterAmount());
      }
    }
  }
}
