package com.fincareemployee.Employee.DTO;

public class ResponseDTO {

    private EmployeeDTO employeeDTO;
    private PrdtDTO prdtDTO;

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public PrdtDTO getPrdtDTO() {
        return prdtDTO;
    }

    public void setPrdtDTO(PrdtDTO prdtDTO) {
        this.prdtDTO = prdtDTO;
    }
}
