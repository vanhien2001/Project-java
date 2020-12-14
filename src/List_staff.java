import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class List_staff implements Filehandle {
  int n;
  Staff[] arrPerson;

  transient Scanner sc = new Scanner(System.in);

  public List_staff() {
    n = 0;
    arrPerson = null;
  }

  @Override
  public void read() throws IOException {
    ObjectInputStream oi = null;
    try {
      oi = new ObjectInputStream(new FileInputStream(file_staff));
      arrPerson = (Staff[]) oi.readObject();

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
      oo = new ObjectOutputStream(new FileOutputStream(file_staff));
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
    arrPerson = new Staff[n];
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
        arrPerson[i].Nhapthongtin(shortArr(arrPerson));
      } else if (x >= 2) {
        arrPerson[i] = new Service_staff();
        arrPerson[i].Nhapthongtin(shortArr(arrPerson));
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

  public boolean timNv(String id) {
    for (Staff person : arrPerson) {
      if (person.getId().equalsIgnoreCase(id)) {
        return true;
      }
    }
    return false;
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

  public static String[] shortArr(Staff[] arr) {
    String[] arr2 = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i].id;
    }
    return arr2;
  }

  public void Them_nv() throws IOException {
    read();
    Staff nv = new Service_staff();
    nv.Nhapthongtin(shortArr(arrPerson));
    arrPerson = Arrays.copyOf(arrPerson, arrPerson.length + 1);
    arrPerson[arrPerson.length - 1] = nv;
    write();
  }

  public void Them_quanly() throws IOException {
    read();
    Staff nv = new Manager();
    nv.Nhapthongtin(shortArr(arrPerson));
    arrPerson = Arrays.copyOf(arrPerson, arrPerson.length + 1);
    arrPerson[arrPerson.length - 1] = nv;
    write();
  }

  public void Xoa_nv_id(String a) throws IOException {
    read();
    int kt = 0;
    Staff[] arr = new Staff[arrPerson.length - 1];
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
      arrPerson = new Staff[arr.length];
      arrPerson = arr;
    }
    write();
  }

  public void setup() throws IOException {
    arrPerson = new Staff[4];
    arrPerson[0] = new Manager("Nguyen Van Hien", "0936642182", "049201000116", "25/27", "Son Ky", "Son Ky", "Tan Phu",
        "Tp.HCM", "3119560017", "vanhien2001", new Time(1, 11, 2020), 50000);
    arrPerson[1] = new Service_staff("Huynh Lam Khanh Duy", "0936642182", "049201000116", "25/27", "Son Ky", "Son Ky",
        "Tan Phu", "Tp.HCM", "3119560007", "123", new Time(1, 11, 2020), 30000, "Tiep tan");
    arrPerson[2] = new Service_staff("Phung Duy Khang", "0936642182", "049201000116", "25/27", "Son Ky", "Son Ky",
        "Tan Phu", "Tp.HCM", "3119560029", "pdk3107", new Time(1, 11, 2020), 30000, "Tiep tan");
    arrPerson[3] = new Service_staff("Nguyen Thai Phuong", "0936642182", "049201000116", "25/27", "Son Ky", "Son Ky",
        "Tan Phu", "Tp.HCM", "3119560029", "123", new Time(1, 11, 2020), 30000, "Tiep tan");
    write();
  }
}