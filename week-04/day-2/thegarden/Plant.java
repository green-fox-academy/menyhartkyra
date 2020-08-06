package thegarden;

public class Plant {
  private String colour;
  private double waterAmount;
  private double waterAbsorption;
  protected int minWater;

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

  public void setMinWater(int minWater) {
    this.minWater = minWater;
  }

  public void setWaterAbsorption(double waterAbsorption) {
    this.waterAbsorption = waterAbsorption;
  }

  public double getWaterAbsorption() {
    return waterAbsorption;
  }
  //endregion

  public Plant(String colour) {
    this.colour = colour;
    waterAmount = 0;
  }

  void water(double waterFor1Plant) {
    waterAmount += waterFor1Plant;
  }

  public boolean doesNeedWater() {
    return getWaterAmount() < minWater;
  }
}
