package services;

public interface KhachHang extends DichVu {
    @Override
    void show();

    @Override
    void add();

    @Override
    void delete();
}
