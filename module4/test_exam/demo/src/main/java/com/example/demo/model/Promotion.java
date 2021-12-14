package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity()
public class Promotion implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Pattern(regexp = "^0\\d{9}$")
//@Pattern(regexp ="^0[35789]\\d{8}$" , message = "Số điện thoại chưa đúng định dạng (0xxxxxxxxx).")
//@NotBlank(message = "Số điện thoại không được để trống.")
//@Column(name = "phone", nullable = false, unique = true)
//private String phone;



//    @Pattern(regexp = "^CI-[0-9]{4}$", message = "showtime code format is CI-XXXX,and XXXX>0")
    private String title;

//    @NotNull(message = "Not empty")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
////Kiểu date mới dùng đc annotation này


    @Min(value = 10000, message = "Discount must be greater than 10.000")
    private String discount;

//    @FutureOrPresent(message = " Date Start must be in the present or future!")
    private String dateStart;
    private String dateEnd;
    private String details;


    public Promotion(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

//
//    public Date getDateStart() {
//        return dateStart;
//    }
//
//    public void setDateStart(Date dateStart) {
//        this.dateStart = dateStart;
//    }
//
//    public Date getDateEnd() {
//        return dateEnd;
//    }
//
//    public void setDateEnd(Date dateEnd) {
//        this.dateEnd = dateEnd;
//    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
       Promotion promotion = (Promotion) target;

//        String showtimeCode = showtime.getShowtimeCode();
////        String date = showtime.getDate();
        String discount = promotion.getDiscount() ;
        ValidationUtils.rejectIfEmpty(errors,"title", "title.empty");
        ValidationUtils.rejectIfEmpty(errors, "dateEnd", "dateEnd.empty");
        ValidationUtils.rejectIfEmpty(errors, "dateStart", "dateStart.empty");
        ValidationUtils.rejectIfEmpty(errors, "discount", "discount.empty");
        ValidationUtils.rejectIfEmpty(errors, "details", "details.empty");


//        if(Integer.parseInt(numberOfTicket) <= 0){
//            errors.rejectValue("numberOfTicket", "numberOfTicket.value");
//        }
//        if(!showtimeCode.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
//            errors.rejectValue("customerEmail", "customerEmail.matches");
//        }
//        if(!phone.matches("^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$")){
//            errors.rejectValue("customerPhone", "customerPhone.matches");
//        }
//        if(date)
    }
}
