import java.util.Scanner;

public class Person {
  private String id;
  private String name;
  private String position;
  private Time dayBegin;

  Scanner sc = new Scanner(System.in);

  public Person() {
    id = null;
    name = null;
    position = null;
    dayBegin = new Time();
  }

  public Person(String id, String name, String position, Time dayBegin) {
    this.id = id;
    this.name = name;
    this.position = position;
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

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
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

  public void setPosition() {
    System.out.println("nhap chuc vu : ");
    position = sc.nextLine();
  }

  public void setDayBegin() {
    dayBegin.setAllTime();
  }
}
