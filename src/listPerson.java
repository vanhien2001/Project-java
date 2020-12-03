import java.util.Scanner;
import java.util.Arrays;

public class listPerson {
  int n;
  Person[] arrPerson;

  Scanner sc = new Scanner(System.in);

  public listPerson() {
    n = 0;
    arrPerson = null;
  }

  public void Nhap_ds_nv() {
    System.out.print("Nhap so luong nhan vien : ");
    n = Integer.parseInt(sc.nextLine());
    arrPerson = new Person[n];
    for (int i = 0; i < n; i++) {
      System.out
          .print("Nhap thong tin nhan vien thu " + (i + 1) + " (Nhan 1 de them quan ly, nhan 2 de them nhan vien) : ");
      int x = Integer.parseInt(sc.nextLine());
      if (x <= 1) {
        arrPerson[i] = new Manager();
        arrPerson[i].Nhapthongtin();
      } else if (x >= 2) {
        arrPerson[i] = new Staff();
        arrPerson[i].Nhapthongtin();
      }
    }
  }

  public void Xuat_ds_nv() {
    System.out.println(
        "\n*----------------------------------------------------------------------------------------------------------*");
    System.out.println(
        "|                                           DANH SACH NHAN VIEN                                            |");
    System.out.println(
        "|                                                                                                          |");
    System.out.printf("| %-10s%-9s%-25s%-25s%-15s%20s |\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
        "Luong");
    for (int i = 0; i < n; i++) {
      arrPerson[i].Xuat_thong_tin();
    }
    System.out.println(
        "*----------------------------------------------------------------------------------------------------------*\n");
  }

  public void Tim_nv() {
    int kt = 0;
    System.out.println("Nhan 1 de kiem nhan vien bang ten.\nNhan 2 de kiem nhan vien bang id.");
    int s = Integer.parseInt(sc.nextLine());
    switch (s) {
      case 1:
        System.out.print("Ten nhan vien ban muon tim kiem : ");
        String name = sc.nextLine();
        System.out.println(
            "\n*----------------------------------------------------------------------------------------------------------*");
        System.out.println(
            "|                                           DANH SACH NHAN VIEN                                            |");
        System.out.println(
            "|                                                                                                          |");
        System.out.printf("\n| %-10s%-9s%-25s%-25s%-15s%20s |\n", "Chuc vu", "Id", "Ho ten", "Cong viec",
            "Ngay vao lam", "Luong");
        for (int i = 0; i < arrPerson.length; i++) {
          if (arrPerson[i].getName().equalsIgnoreCase(name)) {
            arrPerson[i].Xuat_thong_tin();
            kt = 1;
          }
        }
        System.out.println(
            "*----------------------------------------------------------------------------------------------------------*\n");
        if (kt == 0) {
          System.out.println("Khong tim thay nhan vien !");
        }
        break;
      case 2:
        System.out.print("Id nhan vien ban muon tim kiem : ");
        String id = sc.nextLine();
        System.out.println(
            "\n*----------------------------------------------------------------------------------------------------------*");
        System.out.println(
            "|                                           DANH SACH NHAN VIEN                                            |");
        System.out.println(
            "|                                                                                                          |");
        System.out.printf("\n| %-10s%-9s%-25s%-25s%-15s%20s |\n", "Chuc vu", "Id", "Ho ten", "Cong viec",
            "Ngay vao lam", "Luong");
        for (int i = 0; i < arrPerson.length; i++) {
          if (arrPerson[i].getId().equalsIgnoreCase(id)) {
            arrPerson[i].Xuat_thong_tin();
            kt = 1;
          }
        }
        System.out.println(
            "*----------------------------------------------------------------------------------------------------------*\n");
        if (kt == 0) {
          System.out.println("Khong tim thay nhan vien !");
        }
        break;
      default:
        System.out.println("Luc chon khong hop le !");
    }
  }

  public void Them_nv() {
    Person nv = new Person();
    System.out.print("Nhap thong tin nhan vien can them (Nhan 1 de them quan ly, nhan 2 de them nhan vien) : ");
    int x = Integer.parseInt(sc.nextLine());
    if (x == 1) {
      nv = new Manager();
    } else if (x == 2) {
      nv = new Staff();
    }
    nv.Nhapthongtin();
    arrPerson = Arrays.copyOf(arrPerson, n + 1);
    arrPerson[n] = nv;
    n++;
  }

  public void Xoa_nv() {
    int kt = 0;
    System.out.print("Nhap id nhan vien can xoa : ");
    String a = sc.nextLine();
    for (int i = 0; i < n; i++) {
      if (arrPerson[i].getId().equalsIgnoreCase(a)) {
        for (int j = i; j < n - 1; j++) {
          arrPerson[j] = arrPerson[j + 1];
        }
        kt = 1;
        System.out.println("Sv da duoc xoa !");
        n--;
        break;
      }
    }
    if (kt == 0) {
      System.out.println("Ko tim thay nhan vien !");
    }
  }
}
