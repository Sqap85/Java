public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo(){
        System.out.printf("Name:%s Social Security Number:%d ",name,socialSecurityNumber);
    }
    void displaySalary(){
        System.out.printf("Salary=%.2f\n",wage*workingHours);
    }

}