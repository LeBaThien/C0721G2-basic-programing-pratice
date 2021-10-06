package case_study.models;

public class Customer extends Person {
    private int idCustomer;
    private String typeOfCustomer;
    private String addressCustomer;

    public static final String DIAMOND = "Diamond";
    public static final String PLATINUM = "Platinum";
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String MEMBER = "Member";
//
    public Customer (){
        super();
    }

    public Customer(String name, String dateBirth, String sex, int identification, int phoneNumber, String email,
                    int idCustomer, String typeOfCustomer, String addressCustomer) {
        super(name, dateBirth, sex, identification, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.addressCustomer = addressCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }


    @Override
    public String toString() {
        return  "\nCustomer{" +
                "idCustomer=" + idCustomer +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                "} " + super.toString() ;

    }

    public String getInformationCustomer(){
        return getName() +"," + getDateBirth() + ","
                + getSex() + "," + getIdCustomer() +","
                + getPhoneNumber() + "," + getEmail() + ","
                + getIdCustomer() + "," + getTypeOfCustomer() + ","
                + getAddressCustomer();
    }



}
