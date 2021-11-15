package application.model;

public class Email {
    private String Language;
    private String pageSize;
    private String signature;
    private String spamsFilters;

    public Email(){

    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSpamsFilters() {
        return spamsFilters;
    }

    public void setSpamsFilters(String spamsFilters) {
        this.spamsFilters = spamsFilters;
    }
}
