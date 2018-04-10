/*
 * Copyright (c) 2018. Mohamed Shalan
 * Android developer
 * mohamed.sh3lan_93@outlook.com.
 */

package com.shalan.mohamed.recyclerviewwithlistadapterexample;

/**
 * Created by mohamed on 4/10/18.
 */

public class BookModel {

    private int bookID;
    private String bookName;
    private String bookQuote;

    public BookModel() {
    }

    public BookModel(int bookID, String bookName, String bookQuote) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookQuote = bookQuote;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookQuote() {
        return bookQuote;
    }

    public void setBookQuote(String bookQuote) {
        this.bookQuote = bookQuote;
    }
}
