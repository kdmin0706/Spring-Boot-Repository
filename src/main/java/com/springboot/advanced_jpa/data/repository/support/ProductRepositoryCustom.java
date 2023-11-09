package com.springboot.advanced_jpa.data.repository.support;

import com.springboot.advanced_jpa.data.entity.Product;
import com.springboot.advanced_jpa.data.repository.ProductRepository;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> findByName(String name);
}
