package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.ChaturyaProduct;
import com.example.springapp.repository.ChaturyaProductRepo;

@Service
public class ChaturyaProductService {
    @Autowired
    private ChaturyaProductRepo productRepo;

    public boolean saveProduct(ChaturyaProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<ChaturyaProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public ChaturyaProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public ChaturyaProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}