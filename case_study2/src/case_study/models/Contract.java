package case_study.models;

public class Contract {
    private int idContract;
    private int idBooking;
    private double depositAdvance;
    private double totalPayment;
    private int idCustomer;
    private Booking booking;

    public Contract(int idContract, int idBooking, double depositAdvance, double totalPayment, int idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.depositAdvance = depositAdvance;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public Contract(int idContract, double depositAdvance, double totalPayment, Booking booking) {
        this.idContract = idContract;
        this.depositAdvance = depositAdvance;
        this.totalPayment = totalPayment;
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDepositAdvance() {
        return depositAdvance;
    }

    public void setDepositAdvance(double depositAdvance) {
        this.depositAdvance = depositAdvance;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

//    @Override
//    public String toString() {
//        return "Contract{" +
//                "idContract=" + idContract +
//                ", idBooking=" + idBooking +
//                ", depositAdvance=" + depositAdvance +
//                ", totalPayment=" + totalPayment +
//                ", idCustomer=" + idCustomer +
//                '}';
//    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", depositAdvance=" + depositAdvance +
                ", totalPayment=" + totalPayment +
                "\n" + booking +
                '}';
    }
}
