package com.guvihcl.second_task.controller;

import com.guvihcl.second_task.entity.Product;
import com.guvihcl.second_task.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    // Home page with options
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Show add product form
    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // Process add product form
    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/display-products";
    }

    // Display all products
    @GetMapping("/display-products")
    public String displayProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "display-products";
    }

    // Get products by category (API endpoint)
    @GetMapping("/products/category/{category}")
    @ResponseBody
    public List<Product> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }
}