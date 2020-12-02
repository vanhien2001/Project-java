import java.util.Scanner;

public class Staff extends Person {
  private String position;
  Scanner sc = new Scanner(System.in);

  public Staff() {
    super();
    position = null;
  }

  public Staff(String id, String name, Time dayBegin, String position) {
    super(id, name, dayBegin);
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setPosition() {
    System.out.println("Cong viec : ");
    position = sc.nextLine();
  }

  public void Nhapthongtin() {
    super.Nhapthongtin();
    setPosition();
  }

  @Override
  public void Xuat_thong_tin() {
    System.out.printf("%-15s-15s%-20s%-15s%-15s%10d000 d\n", "Nhan vien", id, name, position, dayBegin, salary);
  }
}
