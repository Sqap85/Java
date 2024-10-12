public class ArrayExample {
    public static void main(String[] args) {
        // Dizi tanımlama
        int[] numbers = new int[5]; // Boyutu 5 olan bir dizi

        // Eleman ekleme
        numbers[0] = 10;
        numbers[1] = 20;

        // Eleman yazdırma
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }
    }
}