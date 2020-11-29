import java.util.Scanner;

public class Room {
    String tenphong;
    int loai,so_giuong,gia;
    Scanner sc=new Scanner(System.in);
    public Room(){
        tenphong=null;
        loai=0;
        so_giuong=0;
        gia=0;
    }
    public Room(String tenphong,int loai,int so_giuong,int gia){
        this.tenphong=tenphong;
        this.loai=loai;
        this.so_giuong=so_giuong;
        this.gia=gia;
    }
    public int getGia() {
        return gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }
    public int getLoai() {
        return loai;
    }
    public void setLoai(int loai) {
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
        System.out.println("Ten phong :");
        this.tenphong = sc.nextLine();
    }

    public void setLoai() {
        System.out.println("Loai :");
        this.loai = sc.nextInt();
    }

    public void setSo_giuong() {
        System.out.println("So giuong :");
        this.so_giuong = sc.nextInt();
    }

    public void setGia() {
        System.out.println("Gia :");
        this.gia=sc.nextInt();
    }

    public void nhap_thontin() {
        setTenphong();
        setLoai();
        setSo_giuong();
        setGia();
    }

    

}
