import java.util.Scanner;

public class Room {
    String tenphong;
    String loai;
    int so_giuong, gia;
    boolean booked = false;
    Scanner sc = new Scanner(System.in);

    public Room() {
        tenphong = null;
        loai = null;
        so_giuong = 0;
        gia = 0;
    }

    public Room(String tenphong, String loai, int so_giuong, int gia) {
        this.tenphong = tenphong;
        this.loai = loai;
        this.so_giuong = so_giuong;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSo_giuong() {
        return so_giuong;
    }

    public void setSo_giuong(int so_giuong) {
        this.so_giuong = so_giuong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public void setTenphong() {
        System.out.print("Ten phong : ");
        this.tenphong = sc.nextLine();
    }

    public void setLoai() {
        System.out.print("Loai : ");
        this.loai = sc.nextLine();
    }

    public void setSo_giuong() {
        while (true) {
            try {
                System.out.print("So giuong : ");
                this.so_giuong = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
            }
        }
    }

    public void setGia() {
        while (true) {
            try {
                System.out.print("Gia : ");
                this.gia = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! \n");
            }
        }
    }

    public void nhap_thontin() {
        setTenphong();
        setLoai();
        setSo_giuong();
        setGia();
    }

    public void xuatthongtin() {
        System.out.printf("| %-20s%-20s%-15s%15d000d |\n", tenphong, loai, so_giuong, gia);
    }

}
