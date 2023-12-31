package com.wannacode.productmicroservice.repository;

import com.wannacode.productmicroservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String> {


}
