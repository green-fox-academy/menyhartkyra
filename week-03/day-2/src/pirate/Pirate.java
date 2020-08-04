package pirate;

public class Pirate {
  private int intoxication;
  private String state;
  private String name;

  public Pirate(String name) {
    this.intoxication = 0;
    this.state = "alive";
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getIntoxication() {
    return this.intoxication;
  }

  public void setIntoxication(int intoxication) {
    this.intoxication = intoxication;
  }

  public void drinkSomeRum() {
    if (this.getState().equals("dead")) {
      System.out.println("he's dead");
      return;
    }
    this.intoxication++;
  }

  public void howsItGoingMate() {
    if (this.getState().equals("dead")) {
      System.out.println("he's dead");
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

  public void die() {
    this.setState("dead");
    //System.out.println(this.name + " is dead.");
  }

  public void passOut() {
    if (this.getState().equals("dead")) {
      return;
    }
    System.out.println(this.getName() + " passed out");
    this.setState("passed out");
  }

  public void brawl(Pirate otherPirate) {
    if(otherPirate.getState().equals("dead") || this.getState().equals("dead")){
      return;
    }

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


  public static int getRandomNumber(int limit) {
    return (int) Math.round(Math.random() * limit);
  }
}
