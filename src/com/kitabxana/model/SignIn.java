
package com.kitabxana.model;

public class SignIn {
   
    
    private int id;
    private String name;
    private String surname;
    private String password;
    private String tbSeriaNumber;

    public String getTbSeriaNumber() {
        return tbSeriaNumber;
    }

    public void setTbSeriaNumber(String tbSeriaNumber) {
        this.tbSeriaNumber = tbSeriaNumber;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
