import java.util.Scanner;

public class List_rooms {
    Room[] arrRooms;
    private int n;
    Scanner sc = new Scanner(System.in);

    public List_rooms() {
        arrRooms = null;
        n = 0;
    }

    public void Nhapdsphong() {
        System.out.print("Nhap vao so luong phong : ");
        n = Integer.parseInt(sc.nextLine());
        arrRooms = new Room[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phong thu " + (i + 1));
            arrRooms[i] = new Room();
            arrRooms[i].nhap_thontin();
        }
    }

    public void Xuatdsphong() {
        System.out.println("\n*------------------------------------------------------------*");
        System.out.println("|                      DANH SACH PHONG                       |");
        System.out.println("|                                                            |");
        System.out.printf("|%-20s%-20s%19s |\n", " Ten phong", "So giuong", "Gia");
        for (Room room : arrRooms) {
            room.xuatthongtin();
        }
        System.out.println("*------------------------------------------------------------*\n");
    }

    public void Xuatdsphongtrong() {
        System.out.println("\n*------------------------------------------------------------*");
        System.out.println("|                   DANH SACH PHONG TRONG                    |");
        System.out.println("|                                                            |");
        System.out.printf("|%-20s%-20s%19s |\n", " Ten phong", "So giuong", "Gia");
        for (Room room : arrRooms) {
            if (!room.booked)
                room.xuatthongtin();
        }
        System.out.println("*------------------------------------------------------------*\n");
    }

    public Room Timkiemphong(String a) {
        for (Room room : arrRooms) {
            if (room.tenphong.equalsIgnoreCase(a))
                return room;
        }
        return null;
    }
}
