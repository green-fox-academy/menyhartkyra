package sharpieset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SharpieSet {

  public List<Sharpie> sharpieList;

  public SharpieSet() {
    this.sharpieList = new ArrayList<>();
    System.out.println("letrejott sharpielist");
  }

  public int countUsable(List<Sharpie> sharpieList) {
    int numberOfUsableSharpies = 0;
    for (Sharpie sharpie : sharpieList) {
      if (sharpie.getInkAmount() != 0) {
        numberOfUsableSharpies++;
      }
    }
    return numberOfUsableSharpies;
  }

  public void createSharpieList() {
    sharpieList.add(new Sharpie("peach", 78.2, 0));
    sharpieList.add(new Sharpie("orange", 35.2, 5));
    sharpieList.add(new Sharpie("black", 16.8, 6));
    sharpieList.add(new Sharpie("red", 50.1, 15));
    sharpieList.add(new Sharpie("yellow", 67.2, 19));
    sharpieList.add(new Sharpie("green", 40.7, 0));

  }

  /*public void printSharpieList(List<Sharpie> sharpieList) {
    ArrayList<String> stringSharpieList = new ArrayList<>();
    for ( Sharpie sharpie : sharpieList ) {
      stringSharpieList.add(sharpie.sharpieToString(sharpie));
    }
    System.out.println(stringSharpieList);
  }*/

  public void removeTrash(List<Sharpie> sharpieList) {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).getInkAmount() == 0) {
        sharpieList.remove(i);
      }
    }
  }

  @Override
  public String toString() {
    return "" + sharpieList;
  }
}
