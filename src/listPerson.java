import java.util.Arrays;
import java.util.Scanner;

public class listPerson {
  private int amount;
  private Person[] arrPerson;

  Scanner sc = new Scanner(System.in);

  public listPerson() {
    amount = 0;
    arrPerson = null;
  }

  public void nhapListPersonStaff() {
    System.out.println("nhap so luong nhan vien :");
    amount = Integer.parseInt(sc.nextLine());
    arrPerson = new Person[amount];

    for (int i = 0; i < amount; i++) {
      System.out.println("nhap nhan vien thu " + (i + 1));
      Staff p = new Staff();
      p.setAll();
      arrPerson[i] = p;
    }
  }

  public void timKiemNhanVienBangID() {
    System.out.println("nhap ID nhan vien ban muon tim kiem");
    String id = sc.nextLine();

    for (Person person : arrPerson) {
      if (id.equalsIgnoreCase(person.getId()) && person instanceof Staff) {
        person.print();
        return;
      }
    }
    System.out.println("nhan vien ban tim hien khong co trong danh sach");
  }

  public void timKiemNhanVienBangTen() {
    System.out.println("nhap ten nhan vien ban muon tim kiem");
    String name = sc.nextLine();

    for (Person person : arrPerson) {
      if (name.equalsIgnoreCase(person.getName()) && person instanceof Staff) {
        person.print();
        return;
      }
    }
    System.out.println("nhan vien ban tim hien khong co trong danh sach");
  }

  public void themNhanVien() {
    System.out.println("nhap thong tinh nhan vien ban muon them: ");
    Staff nv = new Staff();
    nv.setAll();
    arrPerson = Arrays.copyOf(arrPerson, arrPerson.length + 1);
    arrPerson[amount] = nv;
    amount++;
  }

}
