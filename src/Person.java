import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements Serializable {
  protected String id;
  protected String name, pass;
  protected Time dayBegin;
  protected int salary;

  public Person(String id, String name, String pass, Time dayBegin, int salary) {
    this.id = id;
    this.name = name;
    this.pass = pass;
    this.dayBegin = dayBegin;
    this.salary = salary;
  }

  public Person() {
    id = null;
    name = null;
    dayBegin = new Time();
  }

  transient Scanner sc = new Scanner(System.in);

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

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getPass() {
    return pass;
  }

  public void setDayBegin(Time dayBegin) {
    this.dayBegin = dayBegin;
  }

  public Time getDayBegin() {
    return dayBegin;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void setId() {
    while (true) {
      System.out.print("Id : ");
      String input = sc.nextLine();
      double inputValue = 0;
      try {
        inputValue = Double.parseDouble(input);
        id = Double.toString(inputValue);
        break;
      } catch (NumberFormatException e) {
        System.out.println("ban nhap sai cu phap xin moi ban nhap lai!");
      }
    }

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

  abstract public void Xuat_thong_tin();
}
