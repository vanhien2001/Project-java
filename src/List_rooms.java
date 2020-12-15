import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class List_rooms implements Filehandle, Serializable {
    Room[] arrRooms;
    private int n;
    transient Scanner sc = new Scanner(System.in);

    public List_rooms() {
        arrRooms = null;
        n = 0;
    }

    public void read() throws IOException {
        ObjectInputStream oi = null;
        try {
            oi = new ObjectInputStream(new FileInputStream(file_room));
            arrRooms = (Room[]) oi.readObject();

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } finally {
            oi.close();
        }
    }

    public void write() throws IOException {
        ObjectOutputStream oo = null;
        try {
            oo = new ObjectOutputStream(new FileOutputStream(file_room));
            oo.writeObject(arrRooms);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oo.close();
        }
    }

    public void setup() throws IOException {
        arrRooms = new Room[9];
        arrRooms[0] = new Room("101", "normal", 1, 100);
        arrRooms[1] = new Room("102", "normal", 2, 150);
        arrRooms[2] = new Room("103", "normal", 3, 200);
        arrRooms[3] = new Room("201", "normal", 1, 100);
        arrRooms[4] = new Room("202", "normal", 2, 150);
        arrRooms[5] = new Room("203", "normal", 3, 200);
        arrRooms[6] = new Room("301", "vip", 1, 200);
        arrRooms[7] = new Room("302", "vip", 2, 250);
        arrRooms[8] = new Room("303", "vip", 3, 300);
        write();
    }

    public void Nhapdsphong() throws IOException {
        while (true) {
            try {
                System.out.print("Nhap vao so luong phong : ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
            }
        }
        arrRooms = new Room[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phong thu " + (i + 1));
            arrRooms[i] = new Room();
            arrRooms[i].nhap_thontin();
        }
        write();
    }

    public void Xuatdsphong() throws IOException {
        read();
        System.out.println("\n*----------------------------------------------------------------------------*");
        System.out.println("|                                DANH SACH PHONG                             |");
        System.out.println("|                                                                            |");
        System.out.printf("| %-20s%-20s%-15s%19s |\n", "Ten phong", "Loai", "So giuong", "Gia");
        for (Room room : arrRooms) {
            room.xuatthongtin();
        }
        System.out.println("|                                                                            |");
        System.out.println("*----------------------------------------------------------------------------*");
    }

    public void Xuatdsphongtrong() throws IOException {
        read();
        System.out.println("\n*----------------------------------------------------------------------------*");
        System.out.println("|                             DANH SACH PHONG TRONG                          |");
        System.out.println("|                                                                            |");
        System.out.printf("| %-20s%-20s%-15s%19s |\n", "Ten phong", "Loai", "So giuong", "Gia");
        for (Room room : arrRooms) {
            if (!room.booked)
                room.xuatthongtin();
        }
        System.out.println("|                                                                            |");
        System.out.println("*----------------------------------------------------------------------------*");
    }

    public Room Timkiemphong(String a) throws IOException {
        read();
        for (Room room : arrRooms) {
            if (room.tenphong.equalsIgnoreCase(a))
                return room;
        }
        return null;
    }

    public void Them_room() throws IOException {
        read();
        Room a = new Room();
        a.nhap_thontin();
        arrRooms = Arrays.copyOf(arrRooms, arrRooms.length + 1);
        arrRooms[arrRooms.length - 1] = a;
        System.out.println("Them phong thanh cong !");
        write();
    }

    public void Xoa_room() throws IOException {
        read();
        System.out.print("Nhap ten phong can xoa : ");
        String a = sc.nextLine();
        int kt = 0;
        Room[] arr = new Room[arrRooms.length - 1];
        for (int i = 0; i <= arr.length; i++) {
            if (arrRooms[i].tenphong.equalsIgnoreCase(a)) {
                for (int j = i; j < arrRooms.length - 1; j++) {
                    arr[i] = arrRooms[j + 1];
                    i++;
                }
                kt = 1;
                System.out.println("Phong da duoc xoa !");
                break;
            }
            arr[i] = arrRooms[i];
        }
        if (kt == 0) {
            System.out.println("Ko tim thay phong !");
        } else if (kt == 1) {
            arrRooms = new Room[arr.length];
            arrRooms = arr;
        }
        write();
    }
}
