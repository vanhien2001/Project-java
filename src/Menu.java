import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public void menu(Hotel hotel, List_rooms a, List_dichvu b, listPerson c, List_phieudatphong d, Hoadon f) {
        System.out.println("*------------------------------------------------------------*");
        System.out.println("|                 KHACH SAN XIN CHA0 QUY KHACH               |");
        System.out.println("|                                                            |");
        System.out.println("|     1. Xem thong tin khach san                             |");
        System.out.println("|     2. Dat phong                                           |");
        System.out.println("|     3. Tra phong                                           |");
        System.out.println("|     4. Muc danh cho quan ly                                |");
        System.out.println("|     5. Thoat chuong trinh                                  |");
        System.out.println("|                                                            |");
        System.out.println("*------------------------------------------------------------*");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                hotel.xuatthongtin();
                break;
            case 2:
                d.Dat_phong(a);
                break;
            case 3:
                f.Xuat_hoa_don(d);
                break;
            case 4:
                System.out.println("*---------------------XIN CHAO QUAN LY-----------------------*");
                System.out.println("|                                                            |");
                System.out.println("|     1. Xem danh sach phong                                 |");
                System.out.println("|     2. Xem danh sach phong trong                           |");
                System.out.println("|     3. Xem danh sach nhan vien                             |");
                System.out.println("|     4. Tim thong tin nhan vien                             |");
                System.out.println("|     5. Them nhan vien                                      |");
                System.out.println("|     6. Xoa nhan vien                                       |");
                System.out.println("|     7. Xem danh sach khach hang                            |");
                System.out.println("|     8. Quay lai man hinh chinh                             |");
                System.out.println("|                                                            |");
                System.out.println("*------------------------------------------------------------*");
                System.out.println();
                int y = sc.nextInt();
                switch (y) {
                    case 1:
                        a.Xuatdsphong();
                        break;
                    case 2:
                        a.Xuatdsphongtrong();
                        break;
                    case 3:
                        c.Xuat_ds_nv();
                        break;
                    case 4:
                        c.Tim_nv();
                        break;
                    case 5:
                        c.Them_nv();
                        break;
                    case 6:
                        c.Xoa_nv();
                        break;
                    case 7:
                        d.Xuatdsphieu(a);
                        break;
                    default:
                        menu(hotel, a, b, c, d, f);
                        break;
                }
                break;
            default:
                System.out.println("Da thoat chuong trinh");
                break;
        }
    }
}