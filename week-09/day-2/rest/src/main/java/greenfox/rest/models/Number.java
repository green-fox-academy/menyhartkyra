package greenfox.rest.models;

public class Number {
  private int received;
  private int result;

  public Number(int received) {
    this.received = received;
    result = received*2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}