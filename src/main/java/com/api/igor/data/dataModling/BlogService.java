package com.api.igor.data.dataModling;

import java.util.ArrayList;
import java.util.List;

import com.api.igor.data.entity.BlogEntity;
import com.api.igor.data.repository.BlogRepository;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Salvatore Parascandola
 * @version 1.0
 */
public class BlogService implements DataAccessInterface<BlogEntity> {

    @Autowired
    private BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<BlogEntity> findAll() {

        List<BlogEntity> blogs = new ArrayList<BlogEntity>();

        try {
            Iterable<BlogEntity> incoming = blogRepository.findAll();
            incoming.forEach(blogs::add);

            return blogs;

        } catch (Exception e) {

            e.printStackTrace();

            blogs.add(new BlogEntity(0L, "ERROR", "500", "No Blogs Found", "Problem Will Be Resolved Soon!", null));

            return blogs;
        }
    }

    @Override
    public BlogEntity findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int create(BlogEntity blogEntity) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(BlogEntity blogEntity) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(BlogEntity blogEntity) {
        // TODO Auto-generated method stub
        return 0;
    }

}
