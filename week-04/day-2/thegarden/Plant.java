package thegarden;

public class Plant {
  private String colour;
  private double waterAmount;

  //region getters setters
  public String getColour() {
    return colour;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount;
  }
  //endregion

  public Plant(String colour){
    this.colour = colour;
    waterAmount = 0;
  }


  public boolean doesNeedWater() {
    if (this instanceof Flower){
      return getWaterAmount() < 5;
    } else if (this instanceof Tree){
      return getWaterAmount() < 10;
    }
    return false;
  }
}
