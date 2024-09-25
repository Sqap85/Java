import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Worker worker = new Worker();

        Scanner input = new Scanner(System.in);

        System.out.println("please input your name:");
        worker.name = input.next();

        System.out.println("please input your SSC:");
        worker.socialSecurityNumber = input.nextInt();

        System.out.println("please input your wage:");
        worker.wage = input.nextFloat();

        System.out.println("please input your working hours:");
        worker.workingHours = input.nextInt();

    worker.displayInfo();
    worker.displaySalary();

        }


}