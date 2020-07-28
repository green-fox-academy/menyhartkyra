import farm.*;
import sharpieset.*;

public class Main {
  public static void main(String[] args) {
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.createSharpieList();
    System.out.println(sharpieSet);
    System.out.println(sharpieSet.countUsable(sharpieSet.sharpieList));
    sharpieSet.removeTrash(sharpieSet.sharpieList);
    System.out.println(sharpieSet);

    Animal tiger = new Animal();
    Animal elephant = new Animal();
    Animal dolphin = new Animal();
    Farm farm = new Farm(5);
    farm.breed(tiger);
    farm.breed(elephant);
    farm.breed(dolphin);
    dolphin.setHunger(15);

    System.out.println(farm);
    farm.slaughter(farm.animals);
    System.out.println(farm);
  }
}
