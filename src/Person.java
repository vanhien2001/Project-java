import java.util.Scanner;

public class Person implements Salary{
  protected String id;
  protected String name;
  protected Time dayBegin;
  protected double salary;

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
    System.out.println("Id : ");
    id = sc.nextLine();
  }

  public void setName() {
    System.out.println("Ho va ten : ");
    name = sc.nextLine();
  }

  public void setDayBegin() {
    System.out.println("Thoi diem bat dau lam viec : ");
    dayBegin.setTime();
  }

  public void Nhapthongtin() {
    setId();
    setName();
    setDayBegin();
  }

  public void Xuat_thong_tin() {
    System.out.printf("%-15s%-20s%-15s%10d000 d\n", id, name, dayBegin,salary);
  }

  public double Tinh_luong(){
    return salary*30;
  }
}
