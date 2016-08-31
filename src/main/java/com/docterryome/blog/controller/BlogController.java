package com.docterryome.blog.controller;

import com.docterryome.blog.model.Blog;
import com.docterryome.blog.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by Docterryome on 8/25/2016.
 */


@Controller
public class BlogController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/blog")
    public String blogView(ModelMap modelMap){
        modelMap.put("blogs", gifRepository.getAllBlogs());
        return "blogpost";
    }

    @RequestMapping("/create")
    public String createBlog(Model model){
        model.addAttribute("blog", new Blog());
        return "createblog";
    }

    @RequestMapping(value = "/blog/add", method = RequestMethod.POST)
    public String addBlog(@ModelAttribute Blog blog){
        blog.setDate(new Date());

        return "redirect:/blog";
    }
}
