package com.company;


public class Information {
    public String name;
    public String username;
    public String userpassword;
    public String address;
    public String numberphone;
    public String education;
    public String age;

    public Information(InformationBuilder builder){
        this.name=builder.name;
        this.username=builder.username;
        this.userpassword=builder.userpassword;
        this.address=builder.address;
        this.numberphone=builder.numberphone;
        this.education=builder.education;
        this.age=builder.age;
    }
    //public  Information(){}

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public String getAddress() {
        return address;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public String getEducation() {
        return education;
    }

    public String getAge() {
        return age;
    }

}
