import java.io.Serializable;
import java.util.Scanner;

public class Address implements Serializable {
    private String so_nha;
    private String duong;
    private String phuong;
    private String quan;
    private String tinh;
    transient Scanner sc = new Scanner(System.in);

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
        while (true) {
            System.out.print("Duong : ");
            this.duong = sc.nextLine();
            if (phuong != null) {
                break;
            } else {
                System.out.println("vui long khong de trong!");
            }
        }
    }

    public void setPhuong() {
        while (true) {
            System.out.print("Phuong : ");
            this.phuong = sc.nextLine();
            if (phuong != null) {
                break;
            } else {
                System.out.println("vui long khong de trong!");
            }
        }
    }

    public void setQuan() {
        while (true) {
            System.out.print("Quan : ");
            this.quan = sc.nextLine();
            if (phuong != null) {
                break;
            } else {
                System.out.println("vui long khong de trong!");
            }
        }
    }

    public void setSo_nha() {
        while (true) {
            System.out.print("So nha : ");
            this.so_nha = sc.nextLine();
            if (phuong != null) {
                break;
            } else {
                System.out.println("vui long khong de trong!");
            }
        }
    }

    public void setTinh() {
        while (true) {
            System.out.print("Tinh : ");
            this.tinh = sc.nextLine();
            if (phuong != null) {
                break;
            } else {
                System.out.println("vui long khong de trong!");
            }
        }
    }

    public void nhap_thontin() {
        System.out.println("Moi ban nhap dia chi :");
        setSo_nha();
        setDuong();
        setPhuong();
        setQuan();
        setTinh();
    }

    public String toString() {
        return so_nha + " " + duong + ",Phuong " + phuong + ",Quan " + quan + "," + tinh;
    }
}