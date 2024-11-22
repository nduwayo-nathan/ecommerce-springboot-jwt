package com.naythan.ecom_proj.service;

import com.naythan.ecom_proj.model.Product;
import com.naythan.ecom_proj.repository.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    private List<Product> getAllProducts(){
        return productDao.findAll();
    }
}
