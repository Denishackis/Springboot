package com.tiendasara.tienda.Sara.services;




import org.springframework.data.jpa.repository.JpaRepository;

import com.tiendasara.tienda.Sara.models.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}

