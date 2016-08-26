package com.docterryome.blog.dao;

import com.docterryome.blog.model.Blog;

import java.util.List;

/**
 * Created by Docterryome on 8/24/2016.
 */
public interface BlogDao {
    List<Blog> getAllBlogs();
    void save(Blog blog);
}
