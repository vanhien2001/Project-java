import java.util.Scanner;

public class Person implements Salary {
  protected String id;
  protected String name;
  protected Time dayBegin;
  protected int salary;

  Scanner sc = new Scanner(System.in);

  public Person() {
    id = null;
    name = null;
    dayBegin = new Time();
  }

  public Person(String id, String name, Time dayBegin) {
    this.id = id;
    this.name = name;
    this.dayBegin = dayBegin;
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
    System.out.println("Luong : ");
    salary = sc.nextInt();
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
