class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    private double getSalary() {
        return salary;
    }
    public double getSalaryHR(String departmentPassword) {
        if (departmentPassword.equals("HR123")) { 
            return getSalary();
        } else {
            System.out.println("Access Denied! Only HR can view the salary.");
            return -1; 
        }
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Arun Prasad Patel", 50000);
        Employee emp2 = new Employee("Preiya Sah", 60000);

        System.out.println("Employee: " + emp1.getName());
        System.out.println("Employee: " + emp2.getName());
        System.out.println("Arun Prasad Patel Salary: " + emp1.getSalaryHR("HR123"));
        System.out.println("Preiya Sah Salary: " + emp2.getSalaryHR("WrongPass"));
    }
}
