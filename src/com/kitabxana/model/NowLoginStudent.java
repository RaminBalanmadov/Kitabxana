
package com.kitabxana.model;

public class NowLoginStudent {
    
    private int id;
    private String name;
    private String surname;
    private String yaziciName;
    private String bookName;
    private String tbSeriaNumber;

    public NowLoginStudent() {
    }

    
    public NowLoginStudent(String name, String surname, String tbSeriaNumber) {
        this.name = name;
        this.surname = surname;
        this.tbSeriaNumber = tbSeriaNumber;
    }

  
    public NowLoginStudent(String yaziciName, String bookName) {
        this.yaziciName = yaziciName;
        this.bookName = bookName;
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

    public String getYaziciName() {
        return yaziciName;
    }

    public void setYaziciName(String yaziciName) {
        this.yaziciName = yaziciName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTbSeriaNumber() {
        return tbSeriaNumber;
    }

    public void setTbSeriaNumber(String tbSeriaNumber) {
        this.tbSeriaNumber = tbSeriaNumber;
    }

    
    
}
