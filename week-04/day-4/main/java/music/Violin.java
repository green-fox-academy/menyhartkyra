package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this(4);
  }

  public Violin(int numberOfStrings){
    name = "Violin";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  String sound() {
    return "Screech";
  }


}
