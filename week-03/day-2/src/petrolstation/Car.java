package petrolstation;

public class Car {
  private int gasAmount;
  private int capacity;

  public Car(){
    this.setCapacity(100);
    this.setGasAmount(0);
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
