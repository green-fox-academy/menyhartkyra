package zoo;

public class Reptile extends Animal{

  public Reptile(String name){
    this.name = name;
  }

  @Override
  String breed() {
    return "laying eggs";
  }
}
