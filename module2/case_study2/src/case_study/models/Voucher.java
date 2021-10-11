package case_study.models;

public class Voucher {
    private String discount;
    private static final String VOUCHER_10 = "Voucher 10%";
    private static final String VOUCHER_20 = "Voucher 20%";
    private static final String VOUCHER_50 = "Voucher 50%";

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public static String getVoucher10() {
        return VOUCHER_10;
    }

    public static String getVoucher20() {
        return VOUCHER_20;
    }

    public static String getVoucher50() {
        return VOUCHER_50;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "discount='" + discount + '\'' +
                '}';
    }
}
