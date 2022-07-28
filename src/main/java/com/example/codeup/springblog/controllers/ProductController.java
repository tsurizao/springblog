package com.example.codeup.springblog.controllers;

import com.example.codeup.springblog.models.Product;
import com.example.codeup.springblog.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    // dependency injection
    ProductRepository productDao;

    public ProductController(ProductRepository productDao){
        this.productDao = productDao;
    }

    @GetMapping("/products")
    public String showAllProducts(Model vModel){
        List<Product> productList = productDao.findAll();
        return "products/index";
    }

    @GetMapping("/products/create/test")
    public String createProduct(){
        Product product = new Product("Pug", 20000);
        productDao.save(product);
        return "redirect:/products";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        productDao.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/products/test/{id}")
    public String getProduct(@PathVariable long id){
        System.out.println(productDao.findById(id));
        return "redirect:/products";
    }
}
