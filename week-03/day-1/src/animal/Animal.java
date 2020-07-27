package animal;

public class Animal {

  private int hunger;
  private int thirst;

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public Animal(){
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat(){
    this.hunger--;
  }
  public void drink(){
    this.thirst--;
  }

  public void play(){
    this.hunger++;
    this.thirst++;
  }

  public static void main(String[] args) {
    Animal tiger = new Animal();
    System.out.println(tiger.thirst);
    tiger.drink();
    System.out.println(tiger.hunger + " " + tiger.thirst);
  }



}
