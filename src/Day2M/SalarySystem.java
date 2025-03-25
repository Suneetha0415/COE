
class Employee {
    double calculateSalary() {
        return 50000; 
    }
}
class Manager extends Employee {
    @Override
    double calculateSalary() {
        return super.calculateSalary() + 10000; 
    }
}
public class SalarySystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();
        
        System.out.println("Employee Salary: " + emp.calculateSalary()); 
        System.out.println("Manager Salary: " + mgr.calculateSalary()); 
    }
}
