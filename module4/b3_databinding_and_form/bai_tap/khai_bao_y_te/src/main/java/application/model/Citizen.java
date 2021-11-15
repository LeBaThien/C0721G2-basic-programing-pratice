package application.model;

public class Citizen {
    private String name;
    private String birthday;
    private String gender;
    private String national;
    private String idCard;
    private String vehicleMove;
    private String vehicleNumber;
    private String chairNumber;
    private String startDate;
    private String endDate;
    private String movingInfo;
    private String cityName;
    private String districtName;
    private String wardsName;
    private String phone;
    private String email;

    public Citizen(){

    }

    public Citizen(String name, String birthday, String gender, String national, String idCard, String vehicleMove,
                   String vehicleNumber, String chairNumber, String startDate, String endDate, String movingInfo, String cityName, String districtName, String wardsName, String phone, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.national = national;
        this.idCard = idCard;
        this.vehicleMove = vehicleMove;
        this.vehicleNumber = vehicleNumber;
        this.chairNumber = chairNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.movingInfo = movingInfo;
        this.cityName = cityName;
        this.districtName = districtName;
        this.wardsName = wardsName;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVehicleMove() {
        return vehicleMove;
    }

    public void setVehicleMove(String vehicleMove) {
        this.vehicleMove = vehicleMove;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(String chairNumber) {
        this.chairNumber = chairNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getMovingInfo() {
        return movingInfo;
    }

    public void setMovingInfo(String movingInfo) {
        this.movingInfo = movingInfo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getWardsName() {
        return wardsName;
    }

    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
