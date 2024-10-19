public class Circle {
    private final double pi = 3.141519;
    private int radius;

    Circle(int _radius){
        this.radius = _radius;
    }

    double computeArea(){
        return pi * (radius*radius);
    }
}
