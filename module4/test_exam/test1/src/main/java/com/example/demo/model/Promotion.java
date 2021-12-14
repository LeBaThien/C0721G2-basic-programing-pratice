package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity(name = "promotion")
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
//    @FutureOrPresent(message = " Date must be in the present or future!")

//    @Min(value = 0, message = "Number ticket must be greater than 0")
    private String discount;
    private Date dateStart;
    private Date dateEnd;
    private String details;

//    @ManyToOne(targetEntity = Film.class)
//    private Film film;

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

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

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
       Promotion showtime = (Promotion) target;

//        String showtimeCode = showtime.getShowtimeCode();
////        String date = showtime.getDate();
//        String numberOfTicket = showtime.getNumberOfTicket();
        ValidationUtils.rejectIfEmpty(errors,"showtimeCode", "showtimeCode.empty");
        ValidationUtils.rejectIfEmpty(errors, "date", "date.empty");
        ValidationUtils.rejectIfEmpty(errors, "numberOfTicket", "numberOfTicket.empty");


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
