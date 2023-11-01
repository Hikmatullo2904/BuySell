package com.hikmatullo.uz.controller;

import com.hikmatullo.uz.model.Product;
import com.hikmatullo.uz.service.ProductService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService service) {
        this.productService = service;
    }
    @GetMapping
    public String getProducts(@RequestParam(value = "title", required = false) String title, Model model) {
        model.addAttribute("products", productService.getProducts(title));
        return "products";
    }

    @GetMapping("/product/{id}")
    public String getInfo(@PathVariable Long id, @NotNull Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/";
    }

    @PostMapping("product/create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/";
    }
}
