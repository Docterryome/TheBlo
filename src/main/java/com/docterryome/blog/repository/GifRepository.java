package com.docterryome.blog.repository;

import com.docterryome.blog.model.Blog;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Docterryome on 8/27/2016.
 */

@Component
public class GifRepository {

    private static List<Blog> blogs = new ArrayList<Blog>(Arrays.asList(new Blog("Hello World", "Some Blah Blah stuff", new Date()),
            new Blog("Good Things", "Comming to those who chase", new Date())));


    public List<Blog> getAllBlogs(){
        return blogs;
    }

    public void addToList(Blog blog){
        blogs.add(blog);
    }
}
