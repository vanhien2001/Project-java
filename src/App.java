public class App {
    public static void main(String[] args) throws Exception {
        List_rooms a = new List_rooms();
        List_dichvu b = new List_dichvu();
        Phieudatphong c=new Phieudatphong(a, b);
        List_phieudatphong d = new List_phieudatphong();
        Hoadon f=new Hoadon();
        a.Nhapdsphong();
        b.Nhapdsdichvu();
        c.Dat_phong(a);
        c.Su_dung_dichvu();
        f.Xuat_hoa_don(d);

    }
}
