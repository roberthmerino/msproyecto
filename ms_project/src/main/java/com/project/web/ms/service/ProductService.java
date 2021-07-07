package com.project.web.ms.service;

import java.util.*;

import com.project.web.ms.entity.Category;
import com.project.web.ms.entity.Product;

public interface ProductService {
    public List<Product> listAllProduct();
    public Product getProduct(Long id);

    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public  Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
