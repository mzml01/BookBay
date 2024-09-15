package com.youtube.bookbay.dao;

import com.youtube.bookbay.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

}
