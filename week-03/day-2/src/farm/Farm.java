package farm;
import java.util.ArrayList;
import java.util.List;

public class Farm {
  public List<Animal> animals;
  int slots;

  public Farm(int slots){
    animals = new ArrayList<>();
    this.slots= slots;
  }

  public int getSlots() {
    return slots;
  }

  public void setSlots(int slots) {
    this.slots = slots;
  }

  public void breed(Animal animal){
    if (slots == 0)
      return;
    animals.add(animal);
  }

  public void slaughter(List<Animal> animals) {
    int minHunger = animals.get(0).getHunger();
    Animal leastHungry = animals.get(0);
    for ( Animal animal : animals ) {
      if (animal.getHunger() < minHunger) {
        minHunger = animal.getHunger();
        leastHungry = animal;
      }
    }
    animals.remove(leastHungry);
  }

  @Override
  public String toString() {
    return "Farm{" +
        "animals=" + animals +
        '}';
  }
}
