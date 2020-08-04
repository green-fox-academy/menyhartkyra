package thegarden;

public class Tree extends Plant{

  public Tree(String colour){
    super(colour);
    setMinWater(10);
    setWaterAbsorption(0.4);
  }

  @Override
  void water(double waterFor1Plant){
    setWaterAmount(getWaterAmount() + getWaterAbsorption()*waterFor1Plant);
  }

}
