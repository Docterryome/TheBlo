package com.docterryome.blog.service;

import com.docterryome.blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Docterryome on 8/30/2016.
 */

@Service
public interface BlogService {

    public void save(Blog blog);
    public List<Blog> findAll();

}
