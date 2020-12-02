public class Menu {
    Hotel hotel;
    List_rooms a = new List_rooms();
    List_dichvu b = new List_dichvu();
    Hoadon f = new Hoadon();
    List_phieudatphong d = new List_phieudatphong(a, b);

    public void Setup() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                        CAI DAT KHACH SAN\n\n");
        System.out.println("Nhap thong tin khach san :");
        hotel.nhap_thontin();
        System.out.println("Nhap thong tin cac phong :");
        a.Nhapdsphong();
        System.out.println("Nhap thong tin cac dich vu :");
        b.Nhapdsdichvu();

    }

    public void Menu1() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("        KHACH SAN " + hotel.getName() + " XIN CHAP QUY KHACH\n\n");
        System.out.println("1.Xem thong tin khach san :");
        System.out.println("2.Dat phong :");
        System.out.println("3.Muc danh cho quan ly :");
    }

    public static void lua_chon(int x) {
        switch (x) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                System.out.println("*-------------------------Menu-------------------------*");
                System.out.println("|   1 .Xem danh sach phong                             |");
                System.out.println("|   2 .Xem phong con trong                             |");
                System.out.println("|   3 .Xem thong tin cac phong                         |");
                System.out.println("|   4 .Xem danh sach nhan vien                         |");
                System.out.println("|   5 .Tim kiem va xem thong tin nhan vien             |");
                System.out.println("|   6 .Them nhan vien                                  |");
                System.out.println("|   7 .Xoa nhan vien                                   |");
                System.out.println("|   8 .Xem danh sach khach hang                        |");
                System.out.println("*------------------------------------------------------*");
                break;
        }
    }
}