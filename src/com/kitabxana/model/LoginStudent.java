package com.kitabxana.model;

public class LoginStudent {

    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String tbSeriaNumber;
    private String age;
    private String password;
   

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTbSeriaNumber() {
        return tbSeriaNumber;
    }

    public void setTbSeriaNumber(String tbSeriaNumber) {
        this.tbSeriaNumber = tbSeriaNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    @Override
    public String toString() {
        return age; //To change body of generated methods, choose Tools | Templates.
    }

}
