package com.feignEmpl.proxy;

import com.feignEmpl.entity.FeignEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "Employee",url = "http://localhost:8080/demo")
public interface FeignProxy {

    @PostMapping("/saveEmpl")
    public FeignEntity saveEmpl(FeignEntity feignEntity);

    @GetMapping("/getEmp/{id}")
    public FeignEntity getById(@PathVariable("id") int id);

//    @PostMapping("/saveAllEmpl")
//    public List<EmployeeEntity> saveAllEmpl(@Valid @RequestBody List<EmployeeEntity> employeeEntities)
//    {
//        return employeeService.saveAllEmpl(employeeEntities);
//    }
//
//    @GetMapping("/getEmp/{id}")
//    public EmployeeEntity getEmpl(@PathVariable("id") int id)
//    {
//        return employeeService.getEmpl(id);
//    }
//
//    @GetMapping("/getAllEmpl")
//    public List<EmployeeEntity> getAllEmpl()
//    {
//        return employeeService.getAllEmpl();
//    }
//
//    @PutMapping("/updateEmpl/{id}")
//    public EmployeeEntity updateEmpl(@Valid @RequestBody EmployeeEntity employeeEntity,@PathVariable ("id") int id)
//    {
//        return employeeService.updateEmpl(employeeEntity,id);
//    }
//
//    @DeleteMapping("deleteEmpl/{id}")
//    public String employeeEntity(@PathVariable ("id") int id)
//    {
//        return employeeService.deleteEmpl(id);
//    }
}
