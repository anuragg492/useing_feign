package com.feignEmpl.controller;

import com.feignEmpl.entity.FeignEntity;
import com.feignEmpl.proxy.FeignProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeignController {

    @Autowired
    FeignProxy feignProxy;

    @PostMapping("/save")
    public FeignEntity save(@RequestBody FeignEntity feignEntity)
    {
        return feignProxy.saveEmpl(feignEntity);
    }

    @GetMapping("/getEmp/{id}")
    public FeignEntity getById(@PathVariable("id") int id)
    {
        return feignProxy.getById(id);
    }

}
