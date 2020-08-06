package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(){
    this(4);
  }

  public BassGuitar(int numberOfStrings){
    name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  String sound() {
    return "Duum-duum-duum";
  }


}
