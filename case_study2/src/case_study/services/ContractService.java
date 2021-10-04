package case_study.services;

public interface ContractService extends Services {
//    void creatNewContract ();
    @Override
    void add();

    @Override
    void edit();

    @Override
    void delete();

    @Override
    void display();
}
