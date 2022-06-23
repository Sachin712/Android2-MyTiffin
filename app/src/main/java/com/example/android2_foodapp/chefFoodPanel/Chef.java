package com.example.android2_foodapp.chefFoodPanel;

public class Chef {
    private String area, city, confirmPassword, emailId, fName, house, lName, mobile, password, postCode, state;

    public Chef(String area, String city, String confirmPassword, String emailId, String fName, String house, String lName, String mobile, String password, String postCode, String state) {
        this.area = area;
        this.city = city;
        this.confirmPassword = confirmPassword;
        this.emailId = emailId;
        this.fName = fName;
        this.house = house;
        this.lName = lName;
        this.mobile = mobile;
        this.password = password;
        this.postCode = postCode;
        this.state = state;
    }

    public Chef(){}
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
