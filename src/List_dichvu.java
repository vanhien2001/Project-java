import java.util.Scanner;

public class List_dichvu {
    Dichvu[] arrs;
    private int n;
    Scanner sc = new Scanner(System.in);

    public List_dichvu() {
        arrs = null;
        n = 0;
    }

    public void Nhapdsphong() {
        System.out.println("Nhap vao so luong dich vu :");
        n = Integer.parseInt(sc.nextLine());
        arrs = new Dichvu[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin dich vu thu :" + (i + 1));
            arrs[i] = new Dichvu();
            arrs[i].nhap_thontin();
        }
    }

    public void Xuatdsdichvu() {
        System.out.println("Danh sach dichvu :");
        System.out.printf("%-15s%-14s%d\n", "Ten dichvu", "Gia");
        for (Dichvu arr : arrs) {
            arr.xuatthongtin();
        }
    }

    public Dichvu Timkiemdichvu(String a) {
        for (Dichvu arr : arrs) {
            if (arr.tendichvu == a)
                return arr;
        }
        return null;
    }
}
