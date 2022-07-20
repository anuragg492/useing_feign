package com.fincareemployee.Employee.proxy;

import com.fincareemployee.Employee.DTO.PrdtDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "products",url = "http://localhost:8082/")
public interface FeignProxy {

    @GetMapping("/dtoDetail/{id}")
    public PrdtDTO dtoDetail(@PathVariable("id") int id);
}
