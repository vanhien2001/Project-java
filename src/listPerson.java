import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class listPerson implements Filehandle {
  int n;
  Person[] arrPerson;

  transient Scanner sc = new Scanner(System.in);

  public listPerson() {
    n = 0;
    arrPerson = null;
  }

  @Override
  public void read() throws IOException {
    ObjectInputStream oi = null;
    try {
      oi = new ObjectInputStream(new FileInputStream(file_serv));
      arrPerson = (Person[]) oi.readObject();

    } catch (IOException ex) {
      System.out.println(ex.toString());
    } catch (ClassNotFoundException ex) {
      System.out.println(ex.toString());
    } finally {
      oi.close();
    }
  }

  @Override
  public void write() throws IOException {
    ObjectOutputStream oo = null;
    try {
      oo = new ObjectOutputStream(new FileOutputStream(file_serv));
      oo.writeObject(arrPerson);
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      oo.close();
    }
  }

  public void Nhap_ds_nv() throws IOException {
    while (true) {
      try {
        System.out.print("Nhap so luong nhan vien : ");
        n = Integer.parseInt(sc.nextLine());
        break;
      } catch (Exception ex) {
        System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
      }
    }
    arrPerson = new Person[n];
    for (int i = 0; i < n; i++) {
      int x;
      while (true) {
        try {
          System.out.print(
              "Nhap thong tin nhan vien thu " + (i + 1) + " (Nhan 1 de them quan ly, nhan 2 de them nhan vien) : ");
          x = Integer.parseInt(sc.nextLine());
          break;
        } catch (Exception ex) {
          System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
        }
      }
      if (x <= 1) {
        arrPerson[i] = new Manager();
        arrPerson[i].Nhapthongtin();
      } else if (x >= 2) {
        arrPerson[i] = new Staff();
        arrPerson[i].Nhapthongtin();
      }
    }
    write();
  }

  public void Xuat_ds_nv() throws IOException {
    read();
    System.out.println(
        "\n*--------------------------------------------------------------------------------------------------------------------*");
    System.out.println(
        "|                                              DANH SACH NHAN VIEN                                                   |");
    System.out.println(
        "|                                                                                                                    |");
    System.out.printf("| %-15s%-15s%-25s%-25s%-15s%19s |\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
        "Luong");
    for (int i = 0; i < arrPerson.length; i++) {
      arrPerson[i].Xuat_thong_tin();
    }
    System.out.println(
        "|                                                                                                                    |");
    System.out.println(
        "*--------------------------------------------------------------------------------------------------------------------*\n");
  }

  public void Tim_nv_name(String name) throws IOException {
    read();
    int kt = 0;
    for (int i = 0; i < arrPerson.length; i++) {
      if (arrPerson[i].getName().equalsIgnoreCase(name)) {
        kt = 1;
      }
    }
    if (kt == 1) {
      System.out.println(
          "\n*--------------------------------------------------------------------------------------------------------------------*");
      System.out.println(
          "|                                              DANH SACH NHAN VIEN                                                   |");
      System.out.println(
          "|                                                                                                                    |");
      System.out.printf("| %-15s%-15s%-25s%-25s%-15s%19s |\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
          "Luong");
      for (int i = 0; i < arrPerson.length; i++) {
        if (arrPerson[i].getName().equalsIgnoreCase(name)) {
          arrPerson[i].Xuat_thong_tin();
        }
      }
      System.out.println(
          "|                                                                                                                    |");
      System.out.println(
          "*--------------------------------------------------------------------------------------------------------------------*\n");
    } else if (kt == 0) {
      System.out.println("Khong tim thay nhan vien !");
    }
  }

  public void Tim_nv_id(String id) throws IOException {
    read();
    int kt = 0;
    for (int i = 0; i < arrPerson.length; i++) {
      if (arrPerson[i].getId().equalsIgnoreCase(id)) {
        kt = 1;
      }
    }
    if (kt == 1) {
      System.out.println(
          "\n*--------------------------------------------------------------------------------------------------------------------*");
      System.out.println(
          "|                                              DANH SACH NHAN VIEN                                                   |");
      System.out.println(
          "|                                                                                                                    |");
      System.out.printf("| %-15s%-15s%-25s%-25s%-15s%19s |\n", "Chuc vu", "Id", "Ho ten", "Cong viec", "Ngay vao lam",
          "Luong");
      for (int i = 0; i < arrPerson.length; i++) {
        if (arrPerson[i].getId().equalsIgnoreCase(id)) {
          arrPerson[i].Xuat_thong_tin();
        }
      }
      System.out.println(
          "|                                                                                                                    |");
      System.out.println(
          "*--------------------------------------------------------------------------------------------------------------------*\n");
    } else if (kt == 0) {
      System.out.println("Khong tim thay nhan vien !");
    }
  }

  public void Them_nv() throws IOException {
    read();
    Person nv = new Staff();
    nv.Nhapthongtin();
    arrPerson = Arrays.copyOf(arrPerson, arrPerson.length + 1);
    arrPerson[arrPerson.length - 1] = nv;
    write();
  }

  public void Them_quanly() throws IOException {
    read();
    Person nv = new Manager();
    nv.Nhapthongtin();
    arrPerson = Arrays.copyOf(arrPerson, arrPerson.length + 1);
    arrPerson[arrPerson.length - 1] = nv;
    write();
  }

  public void Xoa_nv_id(String a) throws IOException {
    read();
    int kt = 0;
    Person[] arr = new Person[arrPerson.length - 1];
    for (int i = 0; i <= arr.length; i++) {
      if (arrPerson[i].id.equalsIgnoreCase(a)) {
        for (int j = i; j < arrPerson.length - 1; j++) {
          arr[i] = arrPerson[j + 1];
          i++;
        }
        kt = 1;
        System.out.println("Nhan vien da duoc xoa !");
        break;
      }
      arr[i] = arrPerson[i];
    }
    if (kt == 0) {
      System.out.println("Ko tim thay nhan vien !");
    } else if (kt == 1) {
      arrPerson = new Person[arr.length];
      arrPerson = arr;
    }
    write();
  }

  public void setup() throws IOException {
    arrPerson = new Person[4];
    arrPerson[0] = new Manager("3119560017", "Nguyen Van Hien", "vanhien2001", new Time(1, 12, 2020), 50000);
    arrPerson[1] = new Staff("3119560007", "Huynh Lam Khanh Duy", "123", new Time(1, 12, 2020), 20000, "Lao cong");
    arrPerson[2] = new Staff("3119560029", "Phung Duy Khang", "123", new Time(1, 12, 2020), 30000, "Tiep tan");
    arrPerson[3] = new Staff("3119560018", "Nguyen Thai Phuong", "123", new Time(1, 12, 2020), 25000, "Bao ve");
    write();
  }
}
