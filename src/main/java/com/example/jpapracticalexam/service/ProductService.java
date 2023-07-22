package com.example.jpapracticalexam.service;
import com.example.jpapracticalexam.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getListProduct();

    void createNewProduct(ProductEntity productEntity) throws Exception;

    void deleteProductById(Long prodId) throws Exception;

}
