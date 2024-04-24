package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.ChaturyaProduct;
import com.example.day6cw3.repository.ChaturyaProductRepo;

@Service
public class ChaturyaProductService {
    public ChaturyaProductRepo productRepo;
    public ChaturyaProductService(ChaturyaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(ChaturyaProduct product)
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
    public List<ChaturyaProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<ChaturyaProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public ChaturyaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
