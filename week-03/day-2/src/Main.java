import java.util.Arrays;
import sharpieset.*;

public class Main {
  public static void main(String[] args) {
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.createSharpieList();
    System.out.println(sharpieSet);
    System.out.println(sharpieSet.countUsable(sharpieSet.sharpieList));
    sharpieSet.removeTrash(sharpieSet.sharpieList);

    System.out.println(sharpieSet);
  }
}
