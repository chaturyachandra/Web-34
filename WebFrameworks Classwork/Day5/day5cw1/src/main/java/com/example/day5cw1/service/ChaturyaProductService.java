package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.ChaturyaProduct;
import com.example.day5cw1.repository.ChaturyaProductRepo;

@Service
public class ChaturyaProductService {
    public ChaturyaProductRepo productRepo;
    public ChaturyaProductService(ChaturyaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(ChaturyaProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ChaturyaProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public ChaturyaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
