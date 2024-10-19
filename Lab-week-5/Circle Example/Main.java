import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Circle[] circles = {circle1,circle2,circle3};


        //(VeriTipi eleman : koleksiyon)
        for (Circle i : circles){
            System.out.println(i.computeArea());
        }

    }
}