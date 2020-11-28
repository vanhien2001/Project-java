import java.util.Scanner;

public class Address {
    String so_nha, duong, phuong, quan, tinh;
    Scanner sc = new Scanner(System.in);

    public Address() {
        so_nha = null;
        duong = null;
        phuong = null;
        quan = null;
        tinh = null;
    }

    public Address(String so_nha, String duong, String phuong, String quan, String tinh) {
        this.so_nha = so_nha;
        this.duong = duong;
        this.phuong = phuong;
        this.quan = quan;
        this.tinh = tinh;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getSo_nha() {
        return so_nha;
    }

    public void setSo_nha(String so_nha) {
        this.so_nha = so_nha;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void setDuong() {
        System.out.println("Moi ban nhap duong :");
        this.duong = sc.nextLine();
    }

    public void setPhuong() {
        System.out.println("Moi ban nhap phuong :");
        this.phuong = sc.nextLine();
    }

    public void setQuan() {
        System.out.println("Moi ban nhap quan :");
        this.quan = sc.nextLine();
    }

    public void setSo_nha() {
        System.out.println("Moi ban nhap so nha :");
        this.so_nha = sc.nextLine();
    }

    public void setTinh() {
        System.out.println("Moi ban nhap tinh :");
        this.tinh = sc.nextLine();
    }

    public void Nhap_dc() {
        System.out.println("Moi ban nhap dia chi :");
        setSo_nha();
        setDuong();
        setPhuong();
        setQuan();
        setTinh();
    }

    public String toString() {
        return "Dia chi : " + so_nha + "/" + duong + "/" + phuong + "/" + quan + "/" + tinh;
    }
}