package aircraftcarrier;

public class Aircraft {
  private int ammo;
  private int maxAmmo;
  private int baseDmg;
  private boolean isPriority;

  //region getters setters
  public void setBaseDmg(int baseDmg) {
    this.baseDmg = baseDmg;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setPriority(boolean priority) {
    isPriority = priority;
  }

  public int getAmmo() {
    return ammo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }
  //endregion

  public Aircraft() {
    ammo = 0;
  }

  int fight() {
    int damageDealt = ammo * baseDmg;
    ammo = 0;
    return damageDealt;
  }

  int refill(int availableAmmo) {
    int availableAmmoStorage = maxAmmo - ammo;
    if (availableAmmo < availableAmmoStorage) {
      ammo += availableAmmo;
      return 0;
    } else {
      ammo = maxAmmo;
      return availableAmmo - availableAmmoStorage;
    }
  }

  String gettype() {
    return this.getClass().getSimpleName();
  }

  String getStatus() {
    String status =
        "Type " + gettype() + ", Ammo: " + ammo + ", Base damage: " + baseDmg + ", All damage: " +
            ammo * baseDmg;
    return status;
  }

  boolean isPriority(){
    return isPriority;
  }

  @Override
  public String toString() {
    return "Aircraft{" +
        "ammo=" + ammo +
        ", maxAmmo=" + maxAmmo +
        ", baseDmg=" + baseDmg +
        ", isPriority=" + isPriority +
        '}';
  }
}
