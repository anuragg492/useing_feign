package com.fincareproducts.products.controller;


import com.fincareproducts.products.entity.PrdEntiry;
import com.fincareproducts.products.entity.ProductDTO;
import com.fincareproducts.products.service.PrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrdController {

    @Autowired
    PrdService prdService;

    @PostMapping("/save")
    public PrdEntiry save(@RequestBody PrdEntiry prdEntiry)
    {
        return prdService.save(prdEntiry);
    }

    @PostMapping("/saveAllDetail")
    public List<PrdEntiry> saveAllDetail(@RequestBody List<PrdEntiry> prdEntiry)
    {
        return prdService.saveAllDetail(prdEntiry);
    }

    @GetMapping("/getDetail/{id}")
    public PrdEntiry getDetail(@PathVariable("id") int id)
    {
        return prdService.getDetail(id);
    }

    @GetMapping("getAllDetail")
    public List<PrdEntiry> getAllDetail()
    {
        return prdService.getAllDetail();
    }



//    @GetMapping("/DTODetail/{id}")
//    public PrdEntiry dtoDetail(@PathVariable("id") int id)
//    {
//        return prdService.dtoDetail(id);
//    }

    @GetMapping("/dtoDetail/{id}")
    public ProductDTO dtoDetail(@PathVariable("id") int id)
    {
        return prdService.dtoDetail(id);
    }
}
