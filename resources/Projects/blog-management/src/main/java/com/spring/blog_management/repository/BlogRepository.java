package com.spring.blog_management.repository;

import com.spring.blog_management.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<BlogPost, Long> {

    // No Additional methods needed for basic CURD Op..
}
