package org.example;
import java.util.*;

/**
 * Created a payroll service class to read and write the employee data.
 */
public class EmployeePayrollService{
    private List<EmployeePayrollData> employeePayrollData;

    /**
     * Constructor to initialize the List interface.
     */
    public EmployeePayrollService(){
        this.employeePayrollData = new ArrayList<>();
    }

    /**
     * It will take the input details of the employee.
     * @param scanner for input
     */
    public void readEmploeePayrollData(Scanner scanner){

        System.out.println("Enter Employee ID: ");
        int empId = scanner.nextInt();
        System.out.println("Enter Employee name: ");
        String empName = scanner.next();
        System.out.println("Enter employee salary: ");
        double empSalary = scanner.nextDouble();
        employeePayrollData.add(new EmployeePayrollData(empId, empName, empSalary));
    }

    /**
     * It will print the employee data.
     */
    public void writeEmployeePayrollData(){
        for(EmployeePayrollData data: employeePayrollData){
            System.out.println(data);
        }
    }
}