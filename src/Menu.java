import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public void menu(Hotel hotel, List_rooms a, List_dichvu b, listPerson c, List_phieudatphong d, Hoadon f) {
        System.out.println();
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
        System.out.print("\nLua chon cua ban : ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                hotel.xuatthongtin();
                menu(hotel, a, b, c, d, f);
                break;
            case 2:
                d.Dat_phong(a);
                menu(hotel, a, b, c, d, f);
                break;
            case 3:
                f.Xuat_hoa_don(d);
                menu(hotel, a, b, c, d, f);
                break;
            case 4:
                menu1(hotel, a, b, c, d, f);
                break;
            default:
                System.out.println("Da thoat chuong trinh");
                break;
        }
    }

    public void menu1(Hotel hotel, List_rooms a, List_dichvu b, listPerson c, List_phieudatphong d, Hoadon f) {
        int kt = 0;
        System.out.print("Id cua ban la : ");
        String id = sc.nextLine();
        for (Person ql : c.arrPerson) {
            if (ql.id.equalsIgnoreCase(id) && ql instanceof Manager) {
                kt = 1;
                break;
            }
        }
        if (kt == 1) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                     XIN CHAO QUAN LY                       |");
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
            System.out.print("\nLua chon cua ban : ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    a.Xuatdsphong();
                    menu1(hotel, a, b, c, d, f);
                    break;
                case 2:
                    a.Xuatdsphongtrong();
                    menu1(hotel, a, b, c, d, f);
                    break;
                case 3:
                    c.Xuat_ds_nv();
                    menu1(hotel, a, b, c, d, f);
                    break;
                case 4:
                    c.Tim_nv();
                    menu1(hotel, a, b, c, d, f);
                    break;
                case 5:
                    c.Them_nv();
                    menu1(hotel, a, b, c, d, f);
                    break;
                case 6:
                    c.Xoa_nv();
                    menu1(hotel, a, b, c, d, f);
                    break;
                case 7:
                    d.Xuatdsphieu(a);
                    menu1(hotel, a, b, c, d, f);
                    break;
                default:
                    menu(hotel, a, b, c, d, f);
                    break;
            }
        } else {
            System.out.println("Ban khong phai la quan ly !");
            menu(hotel, a, b, c, d, f);
        }
    }
}