import java.util.Scanner;

public class Person {
  private String id;
  private String name;
  private Time dayBegin;

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
    System.out.println("nhap ID : ");
    id = sc.nextLine();
  }

  public void setName() {
    System.out.println("nhap ho va ten : ");
    name = sc.nextLine();
  }

  public void setDayBegin() {
    dayBegin.setAllTime();
  }

  @Override
  public String toString() {
    return name + "(ID : " + id + "dayBegin : " + dayBegin;
  }

  public void print() {
    System.out.println("ho va ten : " + name);
    System.out.println("ID : " + id);
    System.out.println("ngay bat dau lam :" + dayBegin);
  }
}
