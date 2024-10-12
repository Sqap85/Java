import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList tanımlama
        ArrayList<Integer> numbers = new ArrayList<>();

        // Eleman ekleme
        numbers.add(10);
        numbers.add(20);

        // Eleman yazdırma
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }

        // Eleman çıkarma
        numbers.remove(0); // İlk elemanı çıkar

        // Güncellenmiş elemanları yazdırma
        System.out.println("\nAfter removing first element:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }
    }
}