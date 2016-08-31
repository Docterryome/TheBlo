package com.docterryome.blog.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Docterryome on 8/21/2016.
 */

@Entity
public class Blog {



    @Id
    @GeneratedValue
    Long id;
    String title;
    String entry;

    @DateTimeFormat(pattern = "MM/dd/YYYY")
    Date date;

    public Blog(String title, String entry, Date date) {
        this.title = title;
        this.entry = entry;
        this.date = date;
    }

    public Blog(String title, String entry){
        this(title, entry, new Date());
    }

    public Blog(){};


    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", entry='" + entry + '\'' +
                ", date=" + date +
                '}';
    }
}
