package pirate;

public class Main {
  public static void main(String[] args) {
    Pirate jack = new Pirate("Jack");
    Pirate barbarossa = new Pirate("Barbarossa");
    //jack.drinkSomeRum();
    jack.howsItGoingMate();
    jack.die();
    jack.howsItGoingMate();
    jack.brawl(barbarossa);

    Ship ship = new Ship();
    Pirate captain = new Pirate("The Captain");
    ship.fillship();
    for ( Pirate pirate :ship.pirates) {
      System.out.println(pirate.getName());
    }
    System.out.println(captain.getIntoxication());
    captain.drinkSomeRum();
    ship.info();
  }
}
