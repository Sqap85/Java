class OuterClass {
    int x = 10;
    
    class InnerClass {
        int y = 5;
        
        void display() {
            System.out.println("Outer x = " + x + "\nInner y = " + y);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
