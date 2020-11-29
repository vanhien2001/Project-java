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
        System.out.println("Nhap vao so luong phong :");
        n = Integer.parseInt(sc.nextLine());
        arrRooms = new Room[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phong thu :" + (i + 1));
            arrRooms[i]=new Room();
            arrRooms[i].nhap_thontin();

        }
    }

    
}
