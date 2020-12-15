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

    public void Login() throws IOException {
        setup();
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                         XIN CHAO                           |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xem thong tin khach san.                            |");
            System.out.println("|     2. Truy cap voi quyen nhan vien.                       |");
            System.out.println("|     3. Truy cap voi quyen quan ly.                         |");
            System.out.println("|     4. Thoat chuong trinh.                                 |");
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
                    int kt = 0;
                    System.out.println("\nNhap id va password cua ban ");
                    System.out.print("Id : ");
                    String id = sc.nextLine();
                    System.out.print("Pass : ");
                    String pass = sc.nextLine();
                    for (Staff nv : c.arrPerson) {
                        if (nv.id.equalsIgnoreCase(id) && nv.manager == false && nv.pass.equals(pass)) {
                            kt = 1;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            menu(nv);
                            c.write();
                            break;
                        }
                    }
                    if (kt == 0) {
                        System.out.println("Sai thong tin dang nhap !");

                    }
                    break;
                case 3:
                    int kt1 = 0;
                    System.out.println("\nNhap id va password cua ban ");
                    System.out.print("Id : ");
                    String id1 = sc.nextLine();
                    System.out.print("Pass : ");
                    String pass1 = sc.nextLine();
                    for (Staff ql : c.arrPerson) {
                        if (ql.id.equalsIgnoreCase(id1) && ql.manager == true && ql.pass.equals(pass1)) {
                            kt1 = 1;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            menu1(ql);
                            c.write();
                            break;
                        }
                    }
                    if (kt1 == 0) {
                        System.out.println("Sai thong tin dang nhap !");

                    }
                    break;

                case 4:
                    System.out.println("\nDa thoat chuong trinh\n\n");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 4) {
                break;
            }
        }
    }

    public void menu(Staff nv) throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                         XIN CHAO                           |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xem thong tin khach san                             |");
            System.out.println("|     2. Dat phong                                           |");
            System.out.println("|     3. Tra phong                                           |");
            System.out.println("|     4. Cai dat tai khoan                                   |");
            System.out.println("|     5. Dang xuat                                           |");
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
                    d.Dat_phong(a, b, nv);
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    f.Xuat_hoa_don(d, a);
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    taikhoan(nv);
                    break;

                case 5:
                    System.out.println("\nDang xuat thanh cong !\n\n");
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

    public void taikhoan(Staff nv) throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                        TAI KHOAN                           |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xem thong tin ban than                              |");
            System.out.println("|     2. Sua thong tin                                       |");
            System.out.println("|     3. Thay doi password                                   |");
            System.out.println("|     4. Quay lai                                            |");
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
                    nv.Xuat_thong_tin_chi_tiet();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Change(nv);
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    nv.resetPass();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 4) {
                break;
            }
        }
    }

    public void Change(Staff nv) throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                   SUA THONG TIN TAI KHOAN                  |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Thay doi sdt                                        |");
            System.out.println("|     2. Thay doi dia chi                                    |");
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
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    nv.Xuat_thong_tin_chi_tiet();
                    System.out.println("Nhap sdt moi");
                    nv.setSdt();
                    System.out.println("Da luu thay doi !");
                    c.write();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    nv.Xuat_thong_tin_chi_tiet();
                    System.out.println("Nhap dia chi moi");
                    nv.setDiachi();
                    System.out.println("Da luu thay doi !");
                    c.write();
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

    public void menu1(Staff ql) throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                     XIN CHAO QUAN LY                       |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xem thong tin khach san                             |");
            System.out.println("|     2. Dat phong                                           |");
            System.out.println("|     3. Tra phong                                           |");
            System.out.println("|     4. Quan ly thong tin khach san                         |");
            System.out.println("|     5. Cai dat tai khoan                                   |");
            System.out.println("|     6. Dang xuat                                           |");
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
                    d.Dat_phong(a, b, ql);
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    f.Xuat_hoa_don(d, a);
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    menu2(ql);
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    taikhoan(ql);
                    break;

                case 6:
                    System.out.println("\nDang xuat thanh cong !\n\n");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 6) {
                break;
            }
        }
    }

    public void menu2(Staff ql) throws IOException {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                QUAN LY THONG TIN KHACH SAN                 |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Quan ly thong tin phong                             |");
            System.out.println("|     2. Quan ly thong tin dich vu                           |");
            System.out.println("|     3. Quan ly thong tin nhan vien                         |");
            System.out.println("|     4. Quan ly thong tin khach hang                        |");
            System.out.println("|     5. Thong ke khach san                                  |");
            System.out.println("|     6. Quay lai                                            |");
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
                    room();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    dichvu();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    staff();
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    d.Xuatdsphieu(a);
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Thong_ke();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 6) {
                break;
            }
        }
    }

    public void room() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                   QUAN LY THONG TIN PHONG                  |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xuat danh sach phong                                |");
            System.out.println("|     2. Xuat danh sach phong trong                          |");
            System.out.println("|     3. Them phong                                          |");
            System.out.println("|     4. Xoa phong                                           |");
            System.out.println("|     5. Sua thong tin phong                                 |");
            System.out.println("|     6. Quay lai                                            |");
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
                    a.Xoa_room();
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    room1();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 6) {
                break;
            }
        }
    }

    public void room1() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                     SUA THONG TIN PHONG                    |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Thay doi ten phong                                  |");
            System.out.println("|     2. Thay doi loai phong                                 |");
            System.out.println("|     3. Thay doi so giuong                                  |");
            System.out.println("|     4. Thay doi so gia                                     |");
            System.out.println("|     5. Quay lai                                            |");
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
                    a.Suaten_phong();
                    break;
                case 2:
                    a.Sualoai_phong();
                    break;
                case 3:
                    a.Suasogiuong_phong();
                    break;
                case 4:
                    a.Suagia_phong();
                    break;
                case 5:
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

    public void staff() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                 QUAN LY THONG TIN NHAN VIEN                |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xuat danh sach nhan vien                            |");
            System.out.println("|     2. Tim thong tin nhan vien                             |");
            System.out.println("|     3. Them nhan vien                                      |");
            System.out.println("|     4. Xoa nhan vien                                       |");
            System.out.println("|     5. Thang cap                                           |");
            System.out.println("|     6. Giang cap                                           |");
            System.out.println("|     7. Quay lai                                            |");
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
                    c.Xuat_ds_nv();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Tim_nv();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Them_nv();
                    break;
                case 4:
                    c.Xoa_nv_id();
                    break;
                case 5:
                    c.Thangcap_nv();
                    break;
                case 6:
                    c.Giangcap_nv();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("\nLua chon khong hop le !!!\n");
                    break;
            }
            if (x == 7) {
                break;
            }
        }
    }

    public void dichvu() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                 QUAN LY THONG TIN DICH VU                  |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Xuat danh sach dich vu                              |");
            System.out.println("|     2. Them dich vu                                        |");
            System.out.println("|     3. Xoa dich vu                                         |");
            System.out.println("|     4. Sua thong tin dich vu                               |");
            System.out.println("|     5. Quay lai                                            |");
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
                    b.Xuatdsdichvu();
                    break;
                case 2:
                    b.Them_dv();
                    break;
                case 3:
                    b.Xoa_dv();
                    break;
                case 4:
                    dichvu1();
                    break;
                case 5:
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

    public void dichvu1() throws IOException {
        while (true) {
            System.out.println();
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                    SUA THONG TIN DICH VU                   |");
            System.out.println("|                                                            |");
            System.out.println("|     1. Thay doi ten dich vu                                |");
            System.out.println("|     2. Thay doi so gia                                     |");
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
                    c.Tim_nv_id();
                    break;
                case 2:
                    c.Tim_nv_name();
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
        d.setup(a, b, c);
    }

    public void Thong_ke() throws IOException {
        int s, k;
        System.out.println("\n*--------------------------------------------------------------*");
        System.out.println("|                         THONG KE                             |");
        for (int i = 11; i <= 12; i++) {
            k = 0;
            System.out.println("|                                                              |");
            System.out.printf("| %-60s |\n", "Thang " + i + " :");
            for (Room room : a.arrRooms) {
                room.dem = 0;
            }
            for (Dichvu dv : b.arrs) {
                dv.dem = 0;
            }
            for (Phieudatphong phieu : d.arrBooked) {
                if (phieu.customer.dayBooking.getMonth() == i) {
                    a.Timkiemphong(phieu.tenphong).dem++;
                    for (Dichvu dv1 : phieu.arr_dichvu) {
                        b.Timkiemdichvu(dv1.tendichvu).dem++;
                    }
                }
                a.write();
                b.write();
            }
            System.out.println("|                                                              |");
            System.out.printf("| %-20s%20s%20s |\n", "Ten phong", "So lan duoc dat", "Doanh thu");
            a.read();
            for (Room room : a.arrRooms) {
                s = room.gia * room.dem * 1000;
                k += s;
                System.out.printf("| %-30s%10d%19dd |\n", room.tenphong, room.dem, s);
            }
            System.out.println("|                                                              |");
            System.out.printf("| %-20s%20s%20s |\n", "Ten dich vu", "So lan duoc su dung", "Doanh thu");
            b.read();
            for (Dichvu dv : b.arrs) {
                s = dv.gia * dv.dem * 1000;
                k += s;
                System.out.printf("| %-30s%10d%19dd |\n", dv.tendichvu, dv.dem, s);
            }
            System.out.println("|                                                              |");
            System.out.printf("| %-60s |\n", "Tong doanh thu : " + k + "d");

        }
        System.out.println("|                                                              |");
        System.out.println("*--------------------------------------------------------------*\n");
    }
}