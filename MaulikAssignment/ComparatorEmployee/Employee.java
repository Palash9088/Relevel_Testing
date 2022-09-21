package ComparatorEmployee;//import java.util.*;

public class Employee {
    int empId;
    String empName;
    String deptName;
    double Salary;

    public Employee(int empId, String empName, String deptName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptName;
        Salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
