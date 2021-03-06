package com.products.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.products.api.model.Product;
import com.products.api.repository.query.ProductRepositoryQuery;

public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryQuery {

	Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
