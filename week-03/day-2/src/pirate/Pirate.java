package pirate;

public class Pirate {
  private int intoxication;
  private boolean isDead;
  private String name;

  public Pirate(String name){
    this.intoxication = 0;
    this.isDead = false;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  public int getIntoxication() {
    return intoxication;
  }

  public void setIntoxication(int intoxication) {
    this.intoxication = intoxication;
  }

  public void drinkSomeRum() {
    if (this.isDead()){
      die();
      return;
    }
    this.intoxication++;
  }

  public void howsItGoingMate() {
    if (this.isDead()){
      die();
      return;
    }
    if (this.intoxication > 0) {
      for (int i = 0; i < getRandomNumber(4); i++) {
        System.out.println("Pour me anudder!");
      }
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }

  public void die(){
    this.setDead(true);
    //System.out.println(this.name + " is dead.");
  }

  public void passOut(){
    System.out.println(this.getName() + " passed out");
  }

  public int getRandomNumber(int limit) {
    int random = (int) Math.round(Math.random() * limit);
    return random;
  }

  public void brawl(Pirate otherPirate) {
    int chance = getRandomNumber(2);
    if (chance == 0) {
      System.out.println(this.getName() + " died");
    } else if (chance == 1) {
      System.out.println(otherPirate.getName() + " died");
    } else {
      this.passOut();
      otherPirate.passOut();
    }
  }

  public static void main(String[] args) {
    Pirate jack = new Pirate("Jack");
    Pirate barbarossa = new Pirate("Barbarossa");
    //jack.drinkSomeRum();
    jack.howsItGoingMate();
    jack.die();
    jack.howsItGoingMate();
    jack.brawl(barbarossa);
  }
}
