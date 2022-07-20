package com.fincareemployee.Employee.controller;


import com.fincareemployee.Employee.DTO.EmployeeDTO;
import com.fincareemployee.Employee.DTO.PrdtDTO;
import com.fincareemployee.Employee.DTO.Response;
import com.fincareemployee.Employee.DTO.ResponseDTO;
import com.fincareemployee.Employee.entity.EmployeeEntity;
import com.fincareemployee.Employee.proxy.FeignProxy;
import com.fincareemployee.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
//@RequestMapping("/demo")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveEmpl")
    public EmployeeEntity saveEmpl(@Valid @RequestBody EmployeeEntity employeeEntity)
    {
        return employeeService.saveEmpl(employeeEntity);
    }

    @PostMapping("/saveAllEmpl")
    public List<EmployeeEntity> saveAllEmpl(@Valid @RequestBody List<EmployeeEntity> employeeEntities)
    {
        return employeeService.saveAllEmpl(employeeEntities);
    }

    @GetMapping("/getEmp/{id}")
    public EmployeeEntity getEmpl(@PathVariable("id") int id)
    {
        return employeeService.getEmpl(id);
    }

    @GetMapping("/getAllEmpl")
    public List<EmployeeEntity> getAllEmpl()
    {
        return employeeService.getAllEmpl();
    }

    @PutMapping("/updateEmpl/{id}")
    public EmployeeEntity updateEmpl(@Valid @RequestBody EmployeeEntity employeeEntity,@PathVariable ("id") int id)
    {
        return employeeService.updateEmpl(employeeEntity,id);
    }

    @DeleteMapping("deleteEmpl/{id}")
    public String employeeEntity(@PathVariable ("id") int id)
    {
        return employeeService.deleteEmpl(id);
    }

    ////////////////////////////////////////////////////
    @GetMapping("employeeToDTO/{id}")
    public EmployeeDTO employeeToDTO(@PathVariable ("id") int id)
    {
        return employeeService.employeeToDTO(id);
    }

    @GetMapping("DtoEmployee/{id}")
    public Response FeignCall(@PathVariable ("id") int id)
    {
        return employeeService.get(id);
    }

    @GetMapping("/response")
    public Response response(@RequestBody ResponseDTO responseDTO)
    {
        return employeeService.response(responseDTO);
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NoSuchElementException.class)
    public String handleException(NoSuchElementException ex)
    {
        return "No Such Id Present";
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>>handleMethodArgumentNotValidException(MethodArgumentNotValidException ex)
    {
        Map<String,String> resp=new HashMap<>();
       ex.getBindingResult().getFieldErrors().forEach(error->{
          String fieldName= error.getField();
          String message= error.getDefaultMessage();
          resp.put(fieldName,message);
       });
       return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
    }



}
