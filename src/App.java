public class App {
    public static void main(String[] args) throws Exception {
        List_rooms a = new List_rooms();
        List_dichvu b = new List_dichvu();
        Hoadon f = new Hoadon();
        a.Nhapdsphong();
        b.Nhapdsdichvu();
        List_phieudatphong d = new List_phieudatphong(a, b);
        d.Dat_phong(a);
        f.Xuat_hoa_don(d);
    }
}
