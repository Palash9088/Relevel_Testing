package ComparatorEmployee;//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employeeList1 = new Employee(101,"Palash","IT",150000);
        Employee employeeList2 = new Employee(101,"Palak","Admin",180000);
        Employee employeeList3 = new Employee(101,"Kiran","Human Resource",80000);
        Employee employeeList4 = new Employee(101,"Ashutosh","IT",130000);
        Employee employeeList5 = new Employee(101,"Manish","Admin",120000);
        Employee employeeList6 = new Employee(101,"Ritika","Human Resource",50000);

        employeeList.add(employeeList1);
        employeeList.add(employeeList2);
        employeeList.add(employeeList3);
        employeeList.add(employeeList4);
        employeeList.add(employeeList5);
        employeeList.add(employeeList6);

        System.out.println("Before Sorting");

        for(Employee employee: employeeList)
        {
            System.out.println("Employee Name: " + employee.getEmpName() + " Employee ID: " + employee.getEmpId() + " Employee Dept: " +
                    employee.getDeptName() + " Employee Salary: " + employee.getSalary());
        }

        System.out.println("------");
        Collections.sort(employeeList,new EmployeeNameSort());

        System.out.println("After Sorting");
        for(Employee employee: employeeList)
        {
            System.out.println("Employee Name: " + employee.getEmpName() + " Employee ID: " + employee.getEmpId() + " Employee Dept: " +
                    employee.getDeptName() + " Employee Salary: " + employee.getSalary());
        }

    }
}
