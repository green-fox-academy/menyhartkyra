package main.java.music;

public abstract class StringedInstrument extends Instrument {
  public int numberOfStrings;

  abstract String sound();

  @Override
  void play(){
    System.out.println(
        getClass().getSimpleName() + ", a " + numberOfStrings + "-stringed instrument that goes " +
            sound());
  }


}
