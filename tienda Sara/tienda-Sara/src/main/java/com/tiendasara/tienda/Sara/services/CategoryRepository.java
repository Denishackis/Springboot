package com.tiendasara.tienda.Sara.services;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tiendasara.tienda.Sara.models.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
