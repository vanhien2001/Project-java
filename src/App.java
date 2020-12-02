public class App {
    public static void printMenu() {
        System.out.println("*-------------------------Menu-------------------------*");
        System.out.println("|   1 .xem danh sach phong                             |");
        System.out.println("|   2 .xem phong con trong                             |");
        System.out.println("|   3 .Tim kiem va xem thong tin phong                 |");
        System.out.println("|   4 .xem danh sach nhan vien                         |");
        System.out.println("|   5 .tim kiem va xem thong tin nhan vien             |");
        System.out.println("|   6 .them nhan vien                                  |");
        System.out.println("|   7 .xoa nhan vien                                   |");
        System.out.println("|   8 .xem danh sach khach hang                        |");
        System.out.println("|   9 .xem danh sach khach hang trong ngay             |");
        System.out.println("|   10.xem danh sach phong                             |");
        System.out.println("|   11.them khach hang                                 |");
        System.out.println("|   12.xoa khach hang                                  |");
        System.out.println("*------------------------------------------------------*");
    }

    public static void cls() {
        System.out.println("\033[H\033[2J");
    }

    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        System.out.println("Hello, World!");
        System.out.println("\033[H\033[2J");
        System.out.println("hello");

=======
        List_rooms a = new List_rooms();
        List_dichvu b = new List_dichvu();
        Hoadon f = new Hoadon();
        a.Nhapdsphong();
        b.Nhapdsdichvu();
        List_phieudatphong d = new List_phieudatphong(a, b);
        d.Dat_phong(a);
        f.Xuat_hoa_don(d);
>>>>>>> 233d230007d84cb33cb5ae585da8e85835650e82
    }
}
