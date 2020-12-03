public class App {
    public static void Setup(Hotel hotel,List_rooms a,List_dichvu b,listPerson c) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                        CAI DAT KHACH SAN\n\n");
        System.out.println("Nhap thong tin khach san :");
        hotel.nhap_thontin();
        System.out.println("Nhap thong tin cac phong :");
        a.Nhapdsphong();
        System.out.println("Nhap thong tin cac dich vu :");
        b.Nhapdsdichvu();
        System.out.println("Nhap thong tin cac nhan vien :");
        c.Nhap_ds_nv();
        System.out.println("----------------------------------------------------------------");
    }
    public void test(){

    }
    public static void main(String[] args) throws Exception {
        Hotel hotel=new Hotel();
        List_rooms a = new List_rooms();
        List_dichvu b = new List_dichvu();
        Hoadon f = new Hoadon();
        List_phieudatphong d = new List_phieudatphong(a, b);
        listPerson c = new listPerson();
        Menu g = new Menu();
        Setup(hotel, a, b, c);
        g.menu(hotel, a, b, c, d, f);
    }
}
