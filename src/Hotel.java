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
    System.out.println("\n*------------------------------------------------------------*");
    System.out.println("|                    THONG TIN KHACH SAN                     |");
    System.out.println("|                                                            |");
    System.out.printf("|%-60s|\n", "Khach san : " + name);
    System.out.printf("|%-60s|\n", "La 1 khach san " + starLevel + " sao");
    System.out.printf("|%-60s|\n", "Nam o dia chi : " + address);
    System.out.printf("|%-60s|\n", "Thuoc su huu cua : " + boss);
    System.out.println("|                                                            |");
    System.out.println("*------------------------------------------------------------*\n");
  }
}
