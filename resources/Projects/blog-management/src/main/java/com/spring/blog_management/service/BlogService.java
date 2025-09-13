package com.spring.blog_management.service;

import com.spring.blog_management.model.BlogPost;
import com.spring.blog_management.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    // Get all Blog Post
    public List<BlogPost> getAllBlogs() {
        return blogRepository.findAll();
    }

    // Get Blog by ID
    public BlogPost getBlogById(Long id) {
        Optional<BlogPost> optionalBlog = blogRepository.findById(id);
        return optionalBlog.orElse(null);
    }

    // Save or Update a blog post
    public BlogPost saveBlog(BlogPost blogPost) {
        return blogRepository.save(blogPost);
    }

    // Delete Blog Post by ID
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
