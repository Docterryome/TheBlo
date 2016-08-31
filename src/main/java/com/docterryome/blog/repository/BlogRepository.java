package com.docterryome.blog.repository;

import com.docterryome.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Docterryome on 8/29/2016.
 */


@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {

    @Override
    List<Blog> findAll();
}
