package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings){
    super.name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar() {
    this(6);
  }

  @Override
  String sound() {
    return "Twang";
  }

}
