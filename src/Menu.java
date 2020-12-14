import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Hotel hotel;
    List_rooms a = new List_rooms();
    List_dichvu b = new List_dichvu();
    List_staff c = new List_staff();
    List_phieudatphong d = new List_phieudatphong();
    Hoadon f = new Hoadon();
    Scanner sc = new Scanner(System.in);

    public Menu() {
    }

    public void menu() throws IOException {
        setup();
        while (true) {
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
            int x;
            while (true) {
                try {
                    System.out.print("\n\nLua chon cua ban : ");
                    x = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception ex) {
                    System.out.print("Cu phap ko chinh xac moi ban nhap lai !!! ");
                }
            }
            switch (x) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    hotel.xuatthongtin();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    d.Dat_phong(a, b);
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    f.Xuat_hoa_don(d);
                    break;
                case 4:
                    int kt = 0;
                    System.out.println("\nNhap id va password cua ban ");
                    System.out.print("Id : ");
                    String id = sc.nextLine();
                    System.out.print("Pass : ");
                    String pass = sc.nextLine();
                    for (Staff ql : c.arrPerson) {
                        if (ql.id.equalsIgnoreCase(id) && ql instanceof Manager && ql.pass.equals(pass)) {
                            kt = 1;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            menu1(ql);
                            c.write();
                            break;
                        }
                    }
                    if (kt == 0) {
                        System.out.println("Ban khong phai la quan ly !");

                    }
                    break;

                case 5:
                    System.out.println("\nDa thoat chuong trinh\n\n");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 5) {
                break;
            }
        }
    }

    public void menu1(Staff ql) throws IOException {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                     XIN CHAO QUAN LY                       |");
            System.out.println("|                                                            |");
            System.out.println("|     1.  Xem danh sach phong                                |");
            System.out.println("|     2.  Xem danh sach phong trong                          |");
            System.out.println("|     3.  Them phong                                         |");
            System.out.println("|     4.  Xoa phong                                          |");
            System.out.println("|     5.  Xem danh sach dich vu                              |");
            System.out.println("|     6.  Sua thong tin dich vu                              |");
            System.out.println("|     7.  Them dich vu                                       |");
            System.out.println("|     8.  Xoa dich vu                                        |");
            System.out.println("|     9.  Xem danh sach nhan vien                            |");
            System.out.println("|     10. Tim thong tin nhan vien                            |");
            System.out.println("|     11. Them nhan vien                                     |");
            System.out.println("|     12. Xoa nhan vien                                      |");
            System.out.println("|     13. Xem danh sach khach hang                           |");
            System.out.println("|     14. Thay doi password                                  |");
            System.out.println("|     15. Quay lai                                           |");
            System.out.println("|                                                            |");
            System.out.println("*------------------------------------------------------------*");
            int x;
            while (true) {
                try {
                    System.out.print("\n\nLua chon cua ban : ");
                    x = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception ex) {
                    System.out.print("Cu phap ko chinh xac moi ban nhap lai !!! ");
                }
            }
            switch (x) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    a.Xuatdsphong();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    a.Xuatdsphongtrong();
                    break;
                case 3:
                    a.Them_room();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhap ten phong muon xoa : ");
                    String e = sc.nextLine();
                    a.Xoa_room(e);
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    b.Xuatdsdichvu();
                    break;
                case 6:
                    Sua_dv();
                    break;
                case 7:
                    b.Them_dv();
                    break;
                case 8:
                    sc.nextLine();
                    System.out.print("Nhap ten dich vu muon xoa : ");
                    String g = sc.nextLine();
                    b.Xoa_dv(g);
                    break;
                case 9:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    c.Xuat_ds_nv();
                    break;
                case 10:
                    Tim_nv();
                    break;
                case 11:
                    Them_nv();
                    break;
                case 12:
                    sc.nextLine();
                    System.out.print("Nhap id nhan vien ban can xoa : ");
                    String id = sc.nextLine();
                    c.Xoa_nv_id(id);
                    break;
                case 13:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    d.Xuatdsphieu(a);
                    break;
                case 14:
                    ql.setPass();
                    break;
                case 15:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 15) {
                break;
            }
        }
    }

    public void Tim_nv() throws IOException {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                  TIM THONG TIN NHAN VIEN                   |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Tim bang id                                         |");
            System.out.println("|     2. Tim bang ten                                        |");
            System.out.println("|     3. Quay lai                                            |");
            System.out.println("|                                                            |");
            System.out.println("*------------------------------------------------------------*");
            int x;
            while (true) {
                try {
                    System.out.print("\n\nLua chon cua ban : ");
                    x = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception ex) {
                    System.out.print("Cu phap ko chinh xac moi ban nhap lai !!! ");
                }
            }
            switch (x) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nhap id nhan vien ban can tim : ");
                    String id = sc.nextLine();
                    c.Tim_nv_id(id);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Nhap ten nhan vien ban can tim : ");
                    String name = sc.nextLine();
                    c.Tim_nv_name(name);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 3) {
                break;
            }
        }
    }

    public void Them_nv() throws IOException {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                        THEM NHAN VIEN                      |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Them quan ly                                        |");
            System.out.println("|     2. Them nhan vien                                      |");
            System.out.println("|     3. Quay lai                                            |");
            System.out.println("|                                                            |");
            System.out.println("*------------------------------------------------------------*");
            int x;
            while (true) {
                try {
                    System.out.print("\n\nLua chon cua ban : ");
                    x = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception ex) {
                    System.out.print("Cu phap ko chinh xac moi ban nhap lai !!! ");
                }
            }
            switch (x) {
                case 1:
                    System.out.println("Nhap thong tin quan ly  ");
                    c.Them_quanly();
                    break;
                case 2:
                    System.out.println("Nhap thong tin nhan vien  ");
                    c.Them_nv();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 3) {
                break;
            }
        }
    }

    public void Sua_dv() throws IOException {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                    SUA THONG TIN DUCH VU                   |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Sua ten dich vu                                     |");
            System.out.println("|     2. Sua gia dich vu                                     |");
            System.out.println("|     3. Quay lai                                            |");
            System.out.println("|                                                            |");
            System.out.println("*------------------------------------------------------------*");
            int x;
            while (true) {
                try {
                    System.out.print("\n\nLua chon cua ban : ");
                    x = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception ex) {
                    System.out.print("Cu phap ko chinh xac moi ban nhap lai !!! ");
                }
            }
            switch (x) {
                case 1:
                    b.Suaten_dv();
                    break;
                case 2:
                    b.Suagia_dv();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 3) {
                break;
            }
        }
    }

    public void setup() throws IOException {
        hotel = new Hotel("Lotus Cental", 5, new Address("102", "Le Thi Hong Gam", "Nguyen Thai Binh", "1", "Tp.HCM"));
        a.setup();
        b.setup();
        c.setup();
        d.setup(a);
    }
}