package models;

public class SoTietKiemDaiHan extends SoTietKiem {
    private String kyHan;
    private String uuDai;

    public SoTietKiemDaiHan(String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, int soTienGui,
                            double laiSuat, String kyHan, String uuDai) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "SoTietKiemDaiHan{" +
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
                "} " + super.toString();
    }
}
