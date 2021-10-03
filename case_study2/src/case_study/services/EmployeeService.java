package case_study.services;

public interface EmployeeService extends Services {
    void showList();//ghi lai cac phuong thuc nay, => dung de ghi de lai, tái sử dụng cho đối tượng customer
    void add();
    void editEmployee(int id);
}
