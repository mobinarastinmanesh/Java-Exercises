package com.company;

public class InformationBuilder {
    public String name;
    public String username;
    public String userpassword;
    public String address;
    public String numberphone;
    public String education;
    public String age;


    public InformationBuilder setName(String name) {
        this.name = name;
        return  this ;
    }

    public InformationBuilder setUsername(String username) {
        this.username = username;
        return  this ;
    }

    public InformationBuilder setUserpassword(String userpassword) {
        this.userpassword = userpassword;
        return  this ;
    }

    public InformationBuilder setAddress(String address) {
        this.address = address;
        return  this ;
    }

    public InformationBuilder setNumberphone(String numberphone) {
        this.numberphone = numberphone;
        return  this ;
    }

    public InformationBuilder setEducation(String education) {
        this.education = education;
        return  this ;
    }

    public InformationBuilder setAge(String age) {
        this.age = age;
        return  this ;
    }
    public Information builder(){

        return new Information(this);
    }

}
