package aircraftcarrier;

public class Aircraft {
  private int ammo;
  private int maxAmmo;
  private int baseDamage;
  private boolean isPriority;

  //region getters setters
  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public Aircraft( int maxAmmo, int baseDamage, boolean isPriority){
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.isPriority = isPriority;
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

  int fight() {
    int damageDealt = ammo * baseDamage;
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
        "Type " + gettype() + ", Ammo: " + ammo + ", Base damage: " + baseDamage + ", All damage: " +
            ammo * baseDamage;
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
        ", baseDmg=" + baseDamage +
        ", isPriority=" + isPriority +
        '}';
  }
}
