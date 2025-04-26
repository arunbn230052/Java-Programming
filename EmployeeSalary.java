abstract class EmployeeSalaryBase {
    String name;
    String empcode;

    EmployeeSalaryBase(String name, String empcode) {
        this.name = name;
        this.empcode = empcode;
    }
    abstract double salaryCalculation();
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee Code: " + empcode);
    }
}

class FullTimeEmployee extends EmployeeSalaryBase {
    double monthlySalary;

    FullTimeEmployee(String name, String empcode, double monthlySalary) {
        super(name, empcode);
        this.monthlySalary = monthlySalary;
    }
    @Override
    double salaryCalculation() {
        return monthlySalary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Arun Prasad Patel", "E101", 4500.00);
        emp1.displayInfo();
        System.out.println("Salary: $" + emp1.salaryCalculation());
    }
}


