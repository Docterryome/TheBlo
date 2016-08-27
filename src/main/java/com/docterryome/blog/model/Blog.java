package com.docterryome.blog.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Docterryome on 8/21/2016.
 */
public class Blog {
    String title;
    String entry;

    @DateTimeFormat(pattern = "MM/dd/YYYY")
    Date date;

    public Blog(String title, String entry, Date date) {
        this.title = title;
        this.entry = entry;
        this.date = date;
    }

    public Blog(){};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
