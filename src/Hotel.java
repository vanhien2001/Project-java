public class Hotel {
  private String id;
  private String name;
  private String boss;
  private String starLevel;
  private Address address;

  public Hotel() {
    id = null;
    name = null;
    boss = null;
    starLevel = null;
    address = new Address();
  }

  public Hotel(String id, String name, String boss, String starLevel, Address address) {
    this.id = id;
    this.name = name;
    this.boss = boss;
    this.starLevel = starLevel;
    this.address = address;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setBoss(String boss) {
    this.boss = boss;
  }

  public String getBoss() {
    return boss;
  }

  public void setStarLevel(String starLevel) {
    this.starLevel = starLevel;
  }

  public String getStarLevel() {
    return starLevel;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

}
