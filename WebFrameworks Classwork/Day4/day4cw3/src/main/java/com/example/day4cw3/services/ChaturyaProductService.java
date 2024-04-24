package com.example.day4cw3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw3.model.ChaturyaProduct;
import com.example.day4cw3.repository.ChaturyaProductRepo;

@Service
public class ChaturyaProductService {
    public ChaturyaProductRepo productRepo;
    public ChaturyaProductService(ChaturyaProductRepo productRepo)
    {
        this.productRepo=productRepo;
    }
    public boolean saveProduct(ChaturyaProduct product)
    {
        try{
            productRepo.save(product);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChaturyaProduct> getProducts()
    {
        return productRepo.findAll();
    }
    public ChaturyaProduct getProductById(int id)
    {
        Optional<ChaturyaProduct> obj = productRepo.findById(id);
        return obj.orElse(new ChaturyaProduct());
    }
}
