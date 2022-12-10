package com.alexn.serviceproduct.repository;

import com.alexn.serviceproduct.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, String>{
}
