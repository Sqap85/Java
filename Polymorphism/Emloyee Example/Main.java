// Abstract Employee class
abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for calculating earnings
    public abstract double earnings();

    // Override toString method to display employee information
    @Override
    public String toString() {
        return "Employee Name: " + name + ", Earnings: " + earnings();
    }
}

// HourlyEmployee class
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        return hourlyRate * hoursWorked;
    }

    // Override toString to display HourlyEmployee specific information
    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

// SalariedEmployee class
class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double earnings() {
        return salary;
    }

    // Override toString to display SalariedEmployee specific information
    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}

// CommissionEmployee class
class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionEmployee(String name, double sales, double commissionRate) {
        super(name);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return sales * commissionRate;
    }

    // Override toString to display CommissionEmployee specific information
    @Override
    public String toString() {
        return super.toString() + ", Sales: " + sales + ", Commission Rate: " + commissionRate;
    }
}

// BasePlusCommissionEmployee class (extends CommissionEmployee)
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, double sales, double commissionRate, double baseSalary) {
        super(name, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    // Override toString to display BasePlusCommissionEmployee specific information
    @Override
    public String toString() {
        return super.toString() + ", Base Salary: " + baseSalary;
    }
}

// Main class to test the hierarchy
public class Main {
    public static void main(String[] args) {
        // Create an array of Employee references
        Employee[] employees = new Employee[4];
        employees[0] = new HourlyEmployee("Alice", 20.0, 40);
        employees[1] = new SalariedEmployee("Bob", 5000);
        employees[2] = new CommissionEmployee("Charlie", 10000, 0.1);
        employees[3] = new BasePlusCommissionEmployee("David", 10000, 0.1, 2000);

        // Display information of all employees
        for (Employee employee : employees) {
            System.out.println(employee);  // Using toString to print details
        }
    }
}