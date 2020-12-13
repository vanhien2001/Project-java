import java.util.Arrays;
import java.util.Scanner;

public class List_dichvu {
    Dichvu[] arrs;
    private int n;
    Scanner sc = new Scanner(System.in);

    public List_dichvu() {
        arrs = null;
        n = 0;
    }

    public void setup() {
        arrs = new Dichvu[8];
        arrs[0] = new Dichvu("Nha hang", 200);
        arrs[1] = new Dichvu("Bar", 200);
        arrs[2] = new Dichvu("Thue phuong tien", 500);
        arrs[3] = new Dichvu("Giat la", 50);
        arrs[4] = new Dichvu("Spa", 300);
        arrs[5] = new Dichvu("Fitness center", 200);
        arrs[6] = new Dichvu("Casino", 200);
        arrs[7] = new Dichvu("Trong tre", 200);
    }

    public void Nhapdsdichvu() {
        while (true) {
            try {
                System.out.print("Nhap vao so luong dich vu : ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
            }
        }
        arrs = new Dichvu[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin dich vu thu " + (i + 1));
            arrs[i] = new Dichvu();
            arrs[i].nhap_thontin();
        }
    }

    public void Xuatdsdichvu() {
        System.out.println("\n*----------------------------------------------------*");
        System.out.println("|                  DANH SACH DICH VU                 |");
        System.out.println("|                                                    |");
        System.out.printf("| %-30s%20s |\n", " Ten dichvu", "Gia");
        for (Dichvu arr : arrs) {
            arr.xuatthongtin();
        }
        System.out.println("|                                                    |");
        System.out.println("*----------------------------------------------------*\n");
    }

    public Dichvu Timkiemdichvu(String a) {
        for (Dichvu arr : arrs) {
            if (arr.tendichvu == a)
                return arr;
        }
        return null;
    }

    public void Them_dv() {
        Dichvu dv = new Dichvu();
        dv.nhap_thontin();
        arrs = Arrays.copyOf(arrs, arrs.length + 1);
        arrs[arrs.length - 1] = dv;
        System.out.println("Them dich vu thanh cong");
    }

    public void Xoa_dv(String a) {
        int kt = 0;
        Dichvu[] arr = new Dichvu[arrs.length - 1];
        for (int i = 0; i <= arr.length; i++) {
            if (arrs[i].tendichvu.equalsIgnoreCase(a)) {
                for (int j = i; j < arrs.length - 1; j++) {
                    arr[i] = arrs[j + 1];
                    i++;
                }
                kt = 1;
                System.out.println("Phong da duoc xoa !");
                break;
            }
            arr[i] = arrs[i];
        }
        if (kt == 0) {
            System.out.println("Ko tim thay phong !");
        } else if (kt == 1) {
            arrs = new Dichvu[arr.length];
            arrs = arr;
        }
    }

    public void Suaten_dv(String a, String b) {
        int kt = 0;
        for (Dichvu dv : arrs) {
            if (dv.tendichvu.equalsIgnoreCase(a)) {
                dv.settendichvu(b);
                System.out.println("Sua thong tin thanh cong !");
                kt = 1;
                break;
            }
        }
        if (kt == 0) {
            System.out.println("Ko tim thay dich vu !");
        }
    }

    public void Suagia_dv(String a, int b) {
        int kt = 0;
        for (Dichvu dv : arrs) {
            if (dv.tendichvu.equalsIgnoreCase(a)) {
                dv.setGia(b);
                System.out.println("Sua thong tin thanh cong !");
                kt = 1;
                break;
            }
        }
        if (kt == 0) {
            System.out.println("Ko tim thay dich vu !");
        }
    }
}
