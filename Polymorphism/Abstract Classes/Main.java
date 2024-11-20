//Soyut sınıflar, ortak davranışları tanımlayan ancak tamamen uygulanmayan sınıflardır. Alt sınıflar bu davranışları tamamlar.
//eger 1 tane bile abstract method varsa class abstract olacak demektir bu classdan kendi basina obje olusturulamaz
abstract class Employee {
    abstract double earnings();
}

class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    double earnings() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new SalariedEmployee(5000);
        System.out.println(emp.earnings());
    }
}