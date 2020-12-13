import java.util.Scanner;

public class Hotel {
  private String name;
  private int starLevel;
  private Address address;
  Scanner sc = new Scanner(System.in);

  public Hotel() {
    name = null;
    starLevel = 0;
    address = new Address();
  }

  public Hotel(String name, int starLevel, Address address) {
    this.name = name;
    this.starLevel = starLevel;
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
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
    while (true) {
      try {
        System.out.print("Loai : ");
        this.starLevel = Integer.parseInt(sc.nextLine());
        break;
      } catch (Exception ex) {
        System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
      }
    }
  }

  public void setDiachi() {
    address.nhap_thontin();
  }

  public void nhap_thontin() {
    setTenkhachsan();
    setLoai();
    setDiachi();
  }

  public void xuatthongtin() {
    System.out.println("\n*-----------------------------------------------------------------------------*");
    System.out.println("|                             THONG TIN KHACH SAN                             |");
    System.out.println("|                                                                             |");
    System.out.printf("|%-77s|\n", "  Khach san : " + name);
    System.out.printf("|%-77s|\n", "  La 1 khach san dat chat luong " + starLevel + " sao");
    System.out.printf("|%-77s|\n", "  Nam o dia chi : " + address);
    System.out.println("|                                                                             |");
    System.out.println("*-----------------------------------------------------------------------------*\n");
  }
}
