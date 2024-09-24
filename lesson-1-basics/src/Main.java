import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner kullanarak kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        // Tamsayı türleri
        System.out.print("Bir byte değeri girin (-128 ile 127 arasında): ");
        byte b = input.nextByte();

        System.out.print("Bir short değeri girin (-32,768 ile 32,767 arasında): ");
        short s = input.nextShort();

        System.out.print("Bir int değeri girin: ");
        int i = input.nextInt();

        System.out.print("Bir long değeri girin: ");
        long l = input.nextLong();

        // Ondalıklı sayı türleri
        System.out.print("Bir float değeri girin: ");
        float f = input.nextFloat();

        System.out.print("Bir double değeri girin: ");
        double d = input.nextDouble();

        // Karakter ve boolean türleri
        System.out.print("Bir karakter girin: ");
        char c = input.next().charAt(0);

        System.out.print("Bir boolean değeri girin (true/false): ");
        boolean bool = input.nextBoolean();

        // if-else kullanımı
        if (b > 0) {
            System.out.println("byte değeri pozitif.");
        } else {
            System.out.println("byte değeri negatif veya sıfır.");
        }

        // for döngüsü kullanımı
        System.out.println("\n1'den int değerinize kadar sayalım:");
        for (int count = 1; count <= i; count++) {
            System.out.println(count);
        }

        // while döngüsü kullanımı
        System.out.println("\nShort değeri 0 olana kadar azaltalım:");
        while (s > 0) {
            System.out.println("short: " + s);
            s--;
        }

        // do-while döngüsü
        System.out.println("\nlong değeri pozitif olana kadar soralım:");
        do {
            System.out.println("long: " + l);
            l--;
        } while (l > 0);

        // Çıktıların yazdırılması
        System.out.println("\nGirdiğiniz float değeri: " + f);
        System.out.println("Girdiğiniz double değeri: " + d);
        System.out.println("Girdiğiniz char değeri: " + c);
        System.out.println("Girdiğiniz boolean değeri: " + bool);

        // Kaynakları serbest bırakmak için Scanner kapatılır
        input.close();
    }
}