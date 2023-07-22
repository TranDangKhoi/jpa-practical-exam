package com.example.jpapracticalexam.repo;
import com.example.jpapracticalexam.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

    ProductEntity findByProdName(String prodName);

}
