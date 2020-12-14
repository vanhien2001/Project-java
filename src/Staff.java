import java.util.Scanner;

public class Staff extends Person {
  private String position;
  transient Scanner sc = new Scanner(System.in);

  public Staff(String id, String name, String pass, Time dayBegin, int salary, String position) {
    this.id = id;
    this.name = name;
    this.pass = pass;
    this.dayBegin = dayBegin;
    this.salary = salary;
    this.position = position;
  }

  public Staff() {
    id = null;
    name = null;
    dayBegin = new Time();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDayBegin(Time dayBegin) {
    this.dayBegin = dayBegin;
  }

  public Time getDayBegin() {
    return dayBegin;
  }

  public void setId() {
    System.out.print("Id : ");
    id = sc.nextLine();
  }

  public void setName() {
    System.out.print("Ho va ten : ");
    name = sc.nextLine();
  }

  public void setDayBegin() {
    System.out.println("Thoi diem bat dau lam viec : ");
    dayBegin.setTime();
  }

  public void setSalary() {
    while (true) {
      try {
        System.out.print("Luong : ");
        salary = Integer.parseInt(sc.nextLine());
        break;
      } catch (Exception ex) {
        System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
      }
    }
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public void setPass() {
    while (true) {
      System.out.print("Nhap mat khau : ");
      String a = sc.nextLine();
      if (pass.equals(a)) {
        System.out.print("Nhap mat khau moi : ");
        String b = sc.nextLine();
        this.pass = b;
        break;
      } else if (!pass.equals(a) && !a.isEmpty()) {
        System.out.println("Mat khau khong chinh xac !!!");
      } else {
        break;
      }
    }
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
    setId();
    setName();
    setDayBegin();
    setSalary();
  }

  @Override
  public void Xuat_thong_tin() {
    System.out.printf("| %-15s%-15s%-25s%-25s%-15s%15d000d |\n", "Nhan vien", id, name, position, dayBegin, salary);
  }
}
