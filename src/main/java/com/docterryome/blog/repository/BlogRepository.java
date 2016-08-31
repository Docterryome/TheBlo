package com.docterryome.blog.repository;

import com.docterryome.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Docterryome on 8/29/2016.
 */


public interface BlogRepository extends CrudRepository<Blog, Long> {


}
