package thegarden;

public class Flower extends Plant {

  public Flower(String colour) {
    super(colour);
    setMinWater(5);
    setWaterAbsorption(0.75);
  }

  @Override
  void water(double waterFor1Plant) {
    setWaterAmount(getWaterAmount() + getWaterAbsorption() * waterFor1Plant);
  }


}
