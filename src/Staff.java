import java.util.Scanner;

public class Staff extends Person {
  private String position;
  private String note;
  Scanner sc = new Scanner(System.in);

  public Staff() {
    super();
    position = null;
    note = null;
  }

  public Staff(String id, String name, Time dayBegin, String position, String note) {
    super(id, name, dayBegin);
    this.position = position;
    this.note = note;
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

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public void setPosition() {
    System.out.println("nhap chuc vu : ");
    position = sc.nextLine();
  }

  public void setNote() {
    System.out.println("nhap ghi chu : ");
    note = sc.nextLine();
  }

  @Override
  public void setAll() {
    super.setAll();
    setPosition();
    setNote();
  }

  @Override
  public String toString() {
    return position + "(" + "(" + toString() + ")" + " ,note : " + note + ")";
  }

  @Override
  public void print() {
    super.print();
    System.out.println("chuc vu : " + position);
    System.out.println("ghi chu : " + note);
  }
}
