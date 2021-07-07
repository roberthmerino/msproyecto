package com.project.web.ms.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web.ms.entity.Category;
import com.project.web.ms.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	public List<Product> findByCategory(Category category);
}
