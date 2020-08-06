package reservations;

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      Reservations reservation = new Reservations();
      System.out.printf("Booking# %s for %s%n", reservation.code, reservation.DoW);
    }
  }
}
