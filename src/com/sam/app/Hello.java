package com.sam.app;

import com.sam.model.Employee;

public class Hello {
    public static void main(String args[]) {
        Employee e1 = new Employee(1,"Saumya", 20000);
        Employee e2 = new Employee(2,"Deepak", 30000);

        int totalTax = (int)((e1.getEmpSalary() + e2.getEmpSalary()) * 0.25);

        e1.setEmpSalary(e1.getEmpSalary() - (int)(e1.getEmpSalary() * 0.15));
        e2.setEmpSalary(e2.getEmpSalary() - (int)(e2.getEmpSalary() * 0.15));
        System.out.println("Total tax paid: "+totalTax);
    }
}
