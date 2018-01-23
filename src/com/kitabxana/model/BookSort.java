
package com.kitabxana.model;

public class BookSort {
    
    private int id;
    private String bookSortName;

    public BookSort(String bookSortName) {
        this.bookSortName = bookSortName;
    }

    public BookSort() {
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookSortName() {
        return bookSortName;
    }

    public void setBookSortName(String bookSortName) {
        this.bookSortName = bookSortName;
    }

    @Override
    public String toString() {
        return bookSortName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
