package com.docterryome.blog.controller;

import com.docterryome.blog.model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Docterryome on 8/25/2016.
 */


@Controller
public class BlogController {
    List<Blog> blogs = Arrays.asList(new Blog("Hello World", "Some Blah Blah stuff", new Date()),
            new Blog("Good Things", "Comming to those who chase", new Date()));

    @RequestMapping("/blog")
    public String blogView(ModelMap modelMap){
        modelMap.put("blogs", blogs);
        return "blogpost";
    }

    @RequestMapping("/create")
    public String createBlog(Model model){
        model.addAttribute("blog", new Blog());
        return "createblog";
    }

}
