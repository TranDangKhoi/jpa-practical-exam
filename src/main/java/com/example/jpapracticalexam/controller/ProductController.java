package com.example.jpapracticalexam.controller;

import com.example.jpapracticalexam.entity.ProductEntity;
import com.example.jpapracticalexam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> getListProduct() {
        return productService.getListProduct();
    }

    @PostMapping("/create")
    public void createNewProduct(@RequestBody ProductEntity productEntity) throws Exception {
        productService.createNewProduct(productEntity);
    }

    @DeleteMapping("/delete/{prodId}")
    public void deleteProductById(@PathVariable Long prodId) throws Exception {
        productService.deleteProductById(prodId);
    }
}
