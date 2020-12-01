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
        System.out.println("Danh sach phong : ");
        System.out.printf("%-15s%-15s%15s\n", "Ten phong", "So giuong", "Gia");
        for (Room room : arrRooms) {
            room.xuatthongtin();
        }
    }

    public void Xuatdsphongtrong() {
        System.out.println("Danh sach phong trong :");
        System.out.printf("%-15s%-15s%15s\n", "Ten phong", "So giuong", "Gia");
        for (Room room : arrRooms) {
            if (!room.booked)
                room.xuatthongtin();
        }
    }

    public Room Timkiemphong(String a) {
        for (Room room : arrRooms) {
            if (room.tenphong == a)
                return room;
        }
        return null;
    }
}
