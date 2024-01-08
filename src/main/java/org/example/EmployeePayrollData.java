package org.example;

import java.util.List;

/**
 * Created an Employee payroll data class to declare and initialize the variables.
 */
public class EmployeePayrollData {

    private int empId;
    private String empName;
    private double empSalary;

    /**
     * Constructor to initialize all the variables.
     * @param empId take the employee ID.
     * @param empName take the employee Name.
     * @param empSalary take the employee salary.
     */
    public EmployeePayrollData(int empId, String empName, double empSalary){
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    /**
     * Overriding toString method to represent the strings however I want.
     * @return returning the employee id, name, salary.
     */
    @Override
    public String toString(){
        return " Employee Id: "+empId
                +"\nEmployee Name: "+empName
                +"\nEmployee Salary: "+empSalary;
    }
}
