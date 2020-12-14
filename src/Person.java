import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements Serializable {
  protected String id;
  protected String name, pass;
  protected Time dayBegin;
  protected int salary;

  transient Scanner sc = new Scanner(System.in);

  abstract public String getId();

  abstract public void setId(String id);

  abstract public void setName(String name);

  abstract public String getName();

  abstract public void setDayBegin(Time dayBegin);

  abstract public Time getDayBegin();

  abstract public void setId();

  abstract public void setName();

  abstract public void setDayBegin();

  abstract public void setSalary();

  abstract public String getPass();

  abstract public void setPass(String pass);

  abstract public void setPass();

  abstract public void Nhapthongtin();

  abstract public void Xuat_thong_tin();
}
