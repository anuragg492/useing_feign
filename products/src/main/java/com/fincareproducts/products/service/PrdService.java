package com.fincareproducts.products.service;

import com.fincareproducts.products.entity.PrdEntiry;
import com.fincareproducts.products.entity.ProductDTO;
import com.fincareproducts.products.repo.PrdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrdService {

    @Autowired
    PrdRepo prdRepo;

    public PrdEntiry save(PrdEntiry prdEntiry) {
     return prdRepo.save(prdEntiry);
    }

    public PrdEntiry getDetail(int id) {
        return prdRepo.findById(id).get();
    }

    public List<PrdEntiry> getAllDetail() {
     return prdRepo.findAll();
    }

    public List<PrdEntiry> saveAllDetail(List<PrdEntiry> prdEntiry) {
      return prdRepo.saveAll(prdEntiry);
    }

    public ProductDTO dtoDetail(int id) {
    PrdEntiry prdEntiry=prdRepo.findById(id).get();

    ProductDTO productDTO=new ProductDTO();
    productDTO.setAadharNumber(prdEntiry.getAadharNumber());
    productDTO.setPanNumber(prdEntiry.getPanNumber());

    return productDTO;
   }

}
