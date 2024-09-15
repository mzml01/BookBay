package com.youtube.bookbay.service;

import com.youtube.bookbay.dao.ProductDAO;
import com.youtube.bookbay.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
    public Product addProduct(Product product) {
        return productDAO.save(product);
    }
}
