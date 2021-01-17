package com.company;


public class Form {

    private  String jub ;
    private  String name ;
    private  String age ;
    private  String education ;

    private Form(){}

    private static Form ourInstance = new Form();

    public  static Form getInstance() {
        return ourInstance;

    }

    public void setJub(String jub) {

        this.jub = jub;
    }

    public String getJub() {

        return jub;
    }

    public void setName(String name) {

        this.name = name;
    }

    public  String getName() {

        return name;
    }

    public  void setAge(String age) {
        this.age = age;
    }

    public String getAge() {

        return age;
    }


    public void setEducation(String education) {

        this.education = education;
    }

    public String getEducation() {
        return education;
    }
}
