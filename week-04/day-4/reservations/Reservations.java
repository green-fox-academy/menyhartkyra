package reservations;

import java.util.Random;

public class Reservations implements Reservationy {
  static String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  String DoW;
  String code;

  public Reservations(){
    DoW = getDowBooking();
    code = getCodeBooking();
  }

  @Override
  public String getDowBooking() {
    return DOW[getRandomNumber(0, 6)];
  }

  int getRandomNumber(int lowerLimit, int upperLimit) {
    int interval = upperLimit - lowerLimit;
    return (int) (lowerLimit + Math.random() * interval);
  }

  @Override
  public String getCodeBooking() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
    Random random = new Random();
    String code = "";
    for (int i = 0; i < 8; i++) {
      code = code.concat(String.valueOf(characters.charAt(random.nextInt(34))));
    }
    return code;
  }

  @Override
  public String toString() {
    return "Reservations{" +
        "DoW='" + DoW + '\'' +
        ", code='" + code + '\'' +
        '}';
  }
}
