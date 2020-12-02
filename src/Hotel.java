import java.util.Scanner;

public class Hotel {
  private String name;
  private String boss;
  private int starLevel;
  private Address address;
  Scanner sc = new Scanner(System.in);

  public Hotel() {
    name = null;
    boss = null;
    starLevel = 0;
    address = new Address();
  }

  public Hotel(String name, String boss, int starLevel, Address address) {
    this.name = name;
    this.boss = boss;
    this.starLevel = starLevel;
    this.address = address;
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

  public void setStarLevel(int starLevel) {
    this.starLevel = starLevel;
  }

  public int getStarLevel() {
    return starLevel;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setTenkhachsan() {
    System.out.print("Ten khach san la : ");
    this.name = sc.nextLine();
  }

  public void setLoai() {
    System.out.print("Loai : ");
    this.starLevel = sc.nextInt();
  }

  public void setBoss() {
    System.out.print("Thuoc so huu cua : ");
    this.boss = sc.nextLine();
  }

  public void setDiachi() {
    address.nhap_thontin();
  }

  public void nhap_thontin() {
    setTenkhachsan();
    setBoss();
    setLoai();
    setDiachi();
  }
  public void xuatthongtin() {
    System.out.printf("%-20s%-15s%-15d%-40s\n", name, boss, starLevel, address.toString());
}
}
