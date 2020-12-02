import java.util.Scanner;

public class listPerson {
  int amount;
  Person[] arrPerson;

  Scanner sc = new Scanner(System.in);

  public listPerson() {
    amount = 0;
    arrPerson = null;
  }

  public void nhapListPersonStaff() {
    System.out.println("Nhap so luong nhan vien :");
    amount = Integer.parseInt(sc.nextLine());
    arrPerson = new Person[amount];
    for (int i = 0; i < amount; i++) {
      System.out.println("nhap nhan vien thu " + (i + 1) + " (Nhan 1 de them quan ly, nhan 2 de them nhan vien)");
      int x = Integer.parseInt(sc.nextLine());
      if (x == 1) {
        arrPerson[i] = new Manager();
        arrPerson[i].Nhapthongtin();
      } else if (x == 2) {
        arrPerson[i] = new Staff();
        arrPerson[i].Nhapthongtin();
      }
    }
  }

  public void Tim_nv_bangID() {
    int kt = 0;
    System.out.println("Nhan 1 de kiem nhan vien bang ten.\nNhan 2 de kiem nhan vien bang id.\n");
    int s = Integer.parseInt(sc.nextLine());
    switch (s) {
      case 1:
        System.out.println("Id nhan vien ban muon tim kiem : ");
        String name = sc.nextLine();
        System.out.printf("%-15s-15s%-20s%-15s%-15s%10d000 d\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
            "Luong");
        for (int i = 0; i < arrPerson.length; i++) {
          if (arrPerson[i].getName().equalsIgnoreCase(name)) {
            arrPerson[i].Xuat_thong_tin();
            kt = 1;
            break;
          }
        }
        if (kt == 0) {
          System.out.println("Khong tim thay nhan vien");
        }
        break;
      case 2:
        System.out.println("Id nhan vien ban muon tim kiem : ");
        String id = sc.nextLine();
        System.out.printf("%-15s-15s%-20s%-15s%-15s%10d000 d\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
            "Luong");
        for (int i = 0; i < arrPerson.length; i++) {
          if (arrPerson[i].getId().equalsIgnoreCase(id)) {
            arrPerson[i].Xuat_thong_tin();
            kt = 1;
            break;
          }
        }
        if (kt == 0) {
          System.out.println("Khong tim thay nhan vien");
        }
        break;
    }
  }

}
