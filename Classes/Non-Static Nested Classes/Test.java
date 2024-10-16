/*
    •	Dış Sınıfa Erişim: Non-statistik iç sınıflar, dış sınıfın örnek değişkenlerine ve yöntemlerine erişebilirler. Bu, dış sınıfın durumuna (state) doğrudan erişim sağlar.
	•	Oluşturma: Non-statistik iç sınıfın bir örneğini oluşturmak için önce dış sınıfın bir örneği oluşturulmalıdır.
*/
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
