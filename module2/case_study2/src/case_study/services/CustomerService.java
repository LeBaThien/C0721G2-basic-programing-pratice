package case_study.services;

public interface CustomerService extends Services {
//Ke thua tu cha
    @Override
    void add();

    @Override
    void delete();

    @Override
    void display();

    void edit(int id);


}
