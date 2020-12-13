import java.util.Scanner;

public class Staff extends Person {
  private String position;
  Scanner sc = new Scanner(System.in);

  public Staff() {
    super();
    position = null;
  }

  public Staff(String id, String name, String pass, Time dayBegin, int salary, String position) {
    super(id, name, pass, dayBegin, salary);
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setPosition() {
    System.out.print("Cong viec : ");
    position = sc.nextLine();
  }

  public void Nhapthongtin() {
    super.Nhapthongtin();
    setPosition();
  }

  @Override
  public void Xuat_thong_tin() {
    System.out.printf("| %-15s%-15s%-25s%-25s%-15s%15d000d |\n", "Nhan vien", id, name, position, dayBegin, salary);
  }
}
