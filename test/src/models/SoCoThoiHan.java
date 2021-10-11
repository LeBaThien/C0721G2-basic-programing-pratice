package models;

public class SoCoThoiHan extends SoTietKiem {
    private String kyHan;

    public SoCoThoiHan(String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, int soTienGui,
                       double laiSuat, String kyHan) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "SoCoThoiHan{" +
                "kyHan='" + kyHan + '\'' +
                "} " + super.toString();
    }
}
