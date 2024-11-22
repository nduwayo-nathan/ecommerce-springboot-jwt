package com.naythan.ecom_proj.controller;

import com.naythan.ecom_proj.model.Product;
import com.naythan.ecom_proj.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    @Autowired
   private ProductService productService;

    @GetMapping("/product")
    private List<Product> getAllProducts(){
        return  productService.getAllProducts();
    }


}
