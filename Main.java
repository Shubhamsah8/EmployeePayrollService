package org.example;
import java.util.Scanner;

/**
 * Main class to take input and print the employee details.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmploeePayrollData(scanner);
        employeePayrollService.writeEmployeePayrollData();
    }
}