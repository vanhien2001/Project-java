import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {
  protected String id;
  protected String name, pass;
  protected Time dayBegin;
  protected int salary;

  transient Scanner sc = new Scanner(System.in);

  public Person() {
    id = null;
    name = null;
    dayBegin = new Time();
  }

  public Person(String id, String name, String pass, Time dayBegin, int salary) {
    this.id = id;
    this.name = name;
    this.pass = pass;
    this.dayBegin = dayBegin;
    this.salary = salary;
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

  public void Nhapthongtin() {
    setId();
    setName();
    setDayBegin();
    setSalary();
  }

  public void Xuat_thong_tin() {
    System.out.printf("%-20s-20s%-25s%-20s%-20s%15d000 d\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
        "Luong");
  }

  public int Tinh_luong() {
    return salary;
  }
}
