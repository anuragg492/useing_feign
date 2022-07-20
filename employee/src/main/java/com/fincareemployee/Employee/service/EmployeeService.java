package com.fincareemployee.Employee.service;


import com.fincareemployee.Employee.DTO.EmployeeDTO;
import com.fincareemployee.Employee.DTO.PrdtDTO;
import com.fincareemployee.Employee.DTO.Response;
import com.fincareemployee.Employee.DTO.ResponseDTO;
import com.fincareemployee.Employee.entity.EmployeeEntity;
import com.fincareemployee.Employee.proxy.FeignProxy;
import com.fincareemployee.Employee.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private FeignProxy feignProxy;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeEntity saveEmpl(EmployeeEntity employeeEntity) {
        return employeeRepo.save(employeeEntity);
    }

    public List<EmployeeEntity> saveAllEmpl(List<EmployeeEntity> employeeEntities) {
        return employeeRepo.saveAll(employeeEntities);
    }

    public EmployeeEntity getEmpl(int id) {
        return employeeRepo.findById(id).get();
    }

    public List<EmployeeEntity> getAllEmpl() {
        return employeeRepo.findAll();
    }

    public EmployeeEntity updateEmpl(EmployeeEntity employeeEntity, int id) {
     EmployeeEntity employeeEntity1=employeeRepo.findById(id).get();

     employeeEntity1.setName(employeeEntity.getName());
     employeeEntity1.setSalary(employeeEntity.getSalary());

        return employeeRepo.save(employeeEntity1);
    }

    public String deleteEmpl(int id) {

        EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
            if(employeeEntity==null)
            {
                throw new RuntimeException("Please provide valid id");
            }
          employeeRepo.deleteById(id);
        return "Deleted Successfully";
    }

    public EmployeeDTO employeeToDTO(int id){
        EmployeeEntity employeeEntity=employeeRepo.findById(id).get();

        EmployeeDTO employeeDTO=new EmployeeDTO();

        employeeDTO.setName(employeeEntity.getName());
        employeeDTO.setSalary(employeeEntity.getSalary());

        return employeeDTO;
    }

//    public Response get(int id)
//    {
//        EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
//        PrdtDTO prdtDTO=feignProxy.dtoDetail(id);
//        EmployeeDTO employeeDTO=new EmployeeDTO();
//        employeeDTO.setName(employeeEntity.getName());
//        employeeDTO.setSalary(employeeEntity.getSalary());
//        ResponseDTO responseDTO=new ResponseDTO();
//
//        responseDTO.setEmployeeDTO(employeeDTO);
//        responseDTO.setPrdtDTO(prdtDTO);
//        Response response=modelMapper.map(responseDTO.getEmployeeDTO(),Response.class);
//        response=modelMapper.map(responseDTO.getPrdtDTO(),Response.class);
//        return response;
//    }

    public Response get(int id)
    {
        EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
        PrdtDTO prdtDTO=feignProxy.dtoDetail(id);
        Response response=new Response();
        response.setName(employeeEntity.getName());
        response.setSalary(employeeEntity.getSalary());

        response.setAadharNumber(prdtDTO.getAadharNumber());
        response.setPanNumber(prdtDTO.getPanNumber());

        return response;
    }


    public Response response(ResponseDTO responseDTO) {

        Response response=this.modelMapper.map(responseDTO.getEmployeeDTO(),Response.class);
        response=this.modelMapper.map(responseDTO.getPrdtDTO(),Response.class);

        return response;
    }



}
