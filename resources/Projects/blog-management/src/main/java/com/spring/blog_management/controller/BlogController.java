package com.spring.blog_management.controller;

import com.spring.blog_management.model.BlogPost;
import com.spring.blog_management.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // Display list of all blog posts
    @GetMapping
    public String listBlogs(Model model) {
        model.addAttribute("blogs", blogService.getAllBlogs());
        return "index";  // Render index.html
    }

    // Show form to create a new blog post
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("blogPost", new BlogPost());
        return "create";  // Render create.html
    }

    // Handle form submission to save a new blog post
    @PostMapping
    public String saveBlog(@ModelAttribute BlogPost blogPost) {
        blogService.saveBlog(blogPost);
        return "redirect:/blogs";
    }

    // Show form to edit existing blog post
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        BlogPost blogPost = blogService.getBlogById(id);
        model.addAttribute("blogPost", blogPost);
        return "edit";  // Render edit.html
    }

    // Handle form submission to update a blog post
    @PostMapping("/update/{id}")
    public String updateBlog(@PathVariable Long id, @ModelAttribute BlogPost blogPost) {
        blogPost.setId(id);  // Ensure the correct ID is set
        blogService.saveBlog(blogPost);
        return "redirect:/blogs";
    }

    // Delete a blog post
    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable Long id) {
        blogService.deleteBlog(id);
        return "redirect:/blogs";
    }
}