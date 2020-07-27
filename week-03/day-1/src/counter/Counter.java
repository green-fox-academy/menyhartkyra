package counter;

public class Counter {

  private int value;
  private int initialValue;

  public int getInitialValue() {
    return initialValue;
  }

  public int get() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;

  }

  public Counter() {
    this.value = 0;
    this.initialValue = 0;
  }

  public Counter(int value) {
    this.value = value;
    this.initialValue = value;
  }

  public void add(int number) {
    this.value += number;
  }

  public void add() {
    this.value++;
  }

  public void reset() {
    this.value = this.initialValue;
  }

  public static void main(String[] args) {
    Counter counter = new Counter(569);
    counter.add(245);
    System.out.println(counter.value);
    System.out.println("initial: " + counter.initialValue);
    counter.reset();
    System.out.println(counter.value);
  }
}
