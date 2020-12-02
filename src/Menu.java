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
                break;
        }
    }
}