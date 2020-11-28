public class Phong {
  private String maPhong;
  private String tenPhong;
  private String maLoai;
  private boolean tinhTrang;
  // true la cho thue, false la con trong
  private int soKhachHangToiDa;

  public Phong() {
    maPhong = null;
    tenPhong = null;
    maLoai = null;
    tinhTrang = false;
    soKhachHangToiDa = 0;
  }

  public Phong(String maPhong, String tenPhong, String maLoai, boolean tinhTrang, int soKhachHang) {
    this.maPhong = maPhong;
    this.tenPhong = tenPhong;
    this.maLoai = maLoai;
    this.tinhTrang = tinhTrang;
    this.soKhachHangToiDa = soKhachHang;
  }

  public String getMaPhong() {
    return maPhong;
  }

  public void setMaPhong(String maPhong) {
    this.maPhong = maPhong;
  }

  public String getTenPhong() {
    return tenPhong;
  }

  public void setTenPhong(String tenPhong) {
    this.tenPhong = tenPhong;
  }

  public String getMaLoai() {
    return maLoai;
  }

  public void setMaLoai(String maLoai) {
    this.maLoai = maLoai;
  }

  public void setTinhTrang(boolean tinhTrang) {
    this.tinhTrang = tinhTrang;
  }

  public boolean isTinhTrang() {
    return tinhTrang;
  }

  public int getSoKhachHangToiDa() {
    return soKhachHangToiDa;
  }

  public void setSoKhachHangToiDa(int soKhachHangToiDa) {
    this.soKhachHangToiDa = soKhachHangToiDa;
  }
}
