package com.example.jpapracticalexam.repo;
import com.example.jpapracticalexam.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepo extends JpaRepository<SaleEntity, Long> {
}
