package models;

public class SoVoThoiHan extends SoTietKiem{

    public SoVoThoiHan(String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, int soTienGui,
                       double laiSuat) {
        super(maSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
    }



    @Override
    public String toString() {
        return "SoVoThoiHan{" + '\'' +
                "} " + super.toString();
    }
}
