import java.io.*; // Dosya işlemleri için gerekli olan sınıfları içe aktarır.
import java.util.*; // Listeler ve diğer veri yapıları için gerekli olan sınıfları içe aktarır.

class Simulation {
    // Bir dosyadan öğeleri yükleyen bir yöntem.
    public ArrayList<Item> loadItems(String filename) throws FileNotFoundException {
        ArrayList<Item> items = new ArrayList<>(); // Öğeleri depolamak için bir liste oluşturulur.
        Scanner scanner = new Scanner(new File(filename)); // Belirtilen dosyayı okumak için Scanner kullanılır.
        while (scanner.hasNextLine()) { // Dosyada okunacak satır olduğu sürece döngü devam eder.
            String[] parts = scanner.nextLine().split("="); // Satır, "=" işaretine göre bölünür.
            items.add(new Item(parts[0], Integer.parseInt(parts[1]))); // Bölünen parçalar kullanılarak bir Item nesnesi oluşturulur ve listeye eklenir.
        }
        scanner.close(); // Dosya okuma işlemi tamamlanınca Scanner kapatılır.
        return items; // Öğelerin bulunduğu liste döndürülür.
    }

    // U1 roketlerini yükleyen bir yöntem.
    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>(); // U1 roketlerini depolamak için bir liste oluşturulur.
        Rocket rocket = new U1(); // Yeni bir U1 roketi oluşturulur.
        for (Item item : items) { // Öğeler üzerinde döngü yapılır.
            if (!rocket.canCarry(item)) { // Eğer roket bu öğeyi taşıyamazsa:
                rockets.add(rocket); // Dolmuş olan roket listeye eklenir.
                rocket = new U1(); // Yeni bir U1 roketi oluşturulur.
            }
            rocket.carry(item); // Öğeyi roketin taşıdığı yük listesine ekler.
        }
        rockets.add(rocket); // Son roket listeye eklenir.
        return rockets; // U1 roketlerinin listesi döndürülür.
    }

    // U2 roketlerini yükleyen bir yöntem.
    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> rockets = new ArrayList<>(); // U2 roketlerini depolamak için bir liste oluşturulur.
        Rocket rocket = new U2(); // Yeni bir U2 roketi oluşturulur.
        for (Item item : items) { // Öğeler üzerinde döngü yapılır.
            if (!rocket.canCarry(item)) { // Eğer roket bu öğeyi taşıyamazsa:
                rockets.add(rocket); // Dolmuş olan roket listeye eklenir.
                rocket = new U2(); // Yeni bir U2 roketi oluşturulur.
            }
            rocket.carry(item); // Öğeyi roketin taşıdığı yük listesine ekler.
        }
        rockets.add(rocket); // Son roket listeye eklenir.
        return rockets; // U2 roketlerinin listesi döndürülür.
    }

    // Simülasyonu çalıştıran bir yöntem.
    public int runSimulation(ArrayList<Rocket> rockets) {
        int totalCost = 0; // Toplam maliyeti tutmak için bir değişken.
        for (Rocket rocket : rockets) { // Her bir roket üzerinde döngü yapılır.
            totalCost += rocket.cost; // İlk deneme maliyeti eklenir.
            while (!rocket.launch() || !rocket.land()) { // Roket başarısız olursa:
                totalCost += rocket.cost; // Yeni bir roket maliyeti eklenir.
            }
        }
        return totalCost; // Toplam maliyet döndürülür.
    }
}