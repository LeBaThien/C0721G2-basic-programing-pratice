package services;

import models.SoCoThoiHan;
import models.SoTietKiem;
import models.SoTietKiemDaiHan;
import models.SoVoThoiHan;
import utils.CheckInput;
import utils.CheckValidate;
import utils.Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySoTietKiem implements DichVu {
    private static List<SoTietKiem> soTietKiems = new ArrayList<>();
//    private static List<SoTietKiemDaiHan> soTietKiemDaiHans = new ArrayList<>();
//    private static List<SoCoThoiHan> soCoThoiHans = new ArrayList<>();
//    private static List<SoVoThoiHan> soVoThoiHans = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String MA_TIET_KIEM = "^STK-[0-9]{4}+$";
    private static final String TIEN_GUI = "^[0-9]{7,}+$";
    private static final String NGAY = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";

    @Override
    public void show() {
//        soTietKiems = ToCSV.readData();
        for (SoTietKiem e : soTietKiems) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the number, bạn muốn thêm \r"
                    + "1. So tiet kiem dai han\n"
                    + "2. So tiet kiem vô thời hạn\n"
                    + "3. So tiết kiệm có thời hạn\n"
                    + "4. Back to menu\n"
            );

            int choice = CheckInput.checkInputSelection();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập mã số sổ");
                    String maSo = CheckValidate.validateInput(MA_TIET_KIEM);
                    System.out.println("Nhap ma Kh");
                    String maKhachHang = scanner.nextLine();
                    System.out.println("Nhap ngày mở sổ");
                    String ngayMoSo = CheckValidate.validateInput(NGAY);
                    System.out.println("Nhap thoi gian bat dau gui");
                    String thoiGianBatDauGui = CheckValidate.validateInput(NGAY);
                    System.out.println("Nhap so tien gui");
                    int soTienGui = Integer.parseInt(CheckValidate.validateInput(TIEN_GUI));
                    System.out.println("Nhap lai suat");
                    double laiSuat = scanner.nextDouble();
                    System.out.println("Nhap ky han");
                    String kyHan = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Nhap uu dai");
                    String uuDai = scanner.nextLine();
                    scanner.nextLine();
                    //String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, int soTienGui,
                    //                            double laiSuat, String kyHan, String uuDai
                    SoTietKiemDaiHan soTietKiemDaiHan = new SoTietKiemDaiHan(maSo, maKhachHang, ngayMoSo,
                            thoiGianBatDauGui, soTienGui, laiSuat, kyHan, uuDai);
                    soTietKiems.add(soTietKiemDaiHan);
                    return;
                }
                case 2: {
                    System.out.println("Nhập mã số sổ");
                    String maSo = CheckValidate.validateInput(MA_TIET_KIEM);
                    System.out.println("Nhap ma Kh");
                    String maKhachHang = scanner.nextLine();
                    System.out.println("Nhap ngày mở sổ");
                    String ngayMoSo = CheckValidate.validateInput(NGAY);
                    System.out.println("Nhap thoi gian bat dau gui");
                    String thoiGianBatDauGui = CheckValidate.validateInput(NGAY);
                    System.out.println("Nhap so tien gui");
                    int soTienGui = Integer.parseInt(CheckValidate.validateInput(TIEN_GUI));
                    System.out.println("Nhap lai suat");
                    double laiSuat = scanner.nextDouble();
                    System.out.println("Đã đầy đủ");
                    SoVoThoiHan soVoThoiHan = new SoVoThoiHan(maSo, maKhachHang, ngayMoSo,
                            thoiGianBatDauGui, soTienGui, laiSuat);
                    //String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, int soTienGui,
                    //                       double laiSuat, String kyhan
                    soTietKiems.add(soVoThoiHan);
                    return;
                }
                case 3: {
                    System.out.println("Nhập mã số sổ");
                    String maSo = CheckValidate.validateInput(MA_TIET_KIEM);
                    System.out.println("Nhap ma Kh");
                    String maKhachHang = scanner.nextLine();
                    System.out.println("Nhap ngày mở sổ");
                    String ngayMoSo = CheckValidate.validateInput(NGAY);
                    System.out.println("Nhap thoi gian bat dau gui");
                    String thoiGianBatDauGui = CheckValidate.validateInput(NGAY);
                    System.out.println("Nhap so tien gui");
                    int soTienGui = Integer.parseInt(CheckValidate.validateInput(TIEN_GUI));
                    System.out.println("Nhap lai suat");
                    double laiSuat = scanner.nextDouble();
                    System.out.println("Nhap ky han");
                    String kyHan = scanner.nextLine();
                    SoCoThoiHan soCoThoiHan = new SoCoThoiHan(maSo, maKhachHang, ngayMoSo,
                            thoiGianBatDauGui, soTienGui, laiSuat,kyHan);
                    soTietKiems.add(soCoThoiHan);
                    //String maSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui,
                    //                       int soTienGui, double laiSuat
                    return;
                }
                case 4: {
                    flag = false;
                    break;
                }
                case 5: {
                    System.out.println("Please check your number !!!");
                    break;
                }

            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhap mã sổ tiết kiệm bạn muốn xóa");
        String maSo = scanner.nextLine();
        scanner.nextLine();
            for(SoTietKiem soTietKiem : soTietKiems){
                if(maSo.equals(soTietKiem.getMaSo())){
                    soTietKiems.remove(soTietKiem);
                    System.out.println("done!!!");
                    break;
                }
            }


    }


}
