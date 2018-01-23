
package com.kitabxana.model;

public class AddKitabxana {
    
    private int id;
    private String bookName;
    private String yaziciName;
    
    private String bookSort;
    private String refNumber;
    private String siraNumber;
    private String sutunNumber;
    private String bookAbout;

    public AddKitabxana(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AddKitabxana() {
    }

  


    public String getBookAbout() {
        return bookAbout;
    }

    public void setBookAbout(String bookAbout) {
        this.bookAbout = bookAbout;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getYaziciName() {
        return yaziciName;
    }

    public void setYaziciName(String yaziciName) {
        this.yaziciName = yaziciName;
    }

    
    public String getBookSort() {
        return bookSort;
    }

    public void setBookSort(String bookSort) {
        this.bookSort = bookSort;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getSiraNumber() {
        return siraNumber;
    }

    public void setSiraNumber(String siraNumber) {
        this.siraNumber = siraNumber;
    }

    public String getSutunNumber() {
        return sutunNumber;
    }

    public void setSutunNumber(String sutunNumber) {
        this.sutunNumber = sutunNumber;
    }

    
}
