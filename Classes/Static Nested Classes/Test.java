/*
  Statik İç Sınıfın Temel Özellikleri:
Bağımsız Kullanım: Statik iç sınıf, dış sınıfın örneği oluşturulmadan kullanılabilir.
Sadece Statik Üyelere Erişim: Statik iç sınıf, dış sınıfın sadece statik olan üyelerine (değişken ve metotlara) doğrudan erişebilir. Dış sınıfın statik olmayan (instance) üyelerine erişemez.
Daha Az Bağlılık: Statik iç sınıf, normal iç sınıflardan farklı olarak dış sınıfla daha az bağımlı olup daha bağımsız çalışabilir.

 */
class OuterClass {
    static int x = 10;
    
    static class StaticNestedClass {
        void display() {
            System.out.println("Outer x = " + x);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}
