import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // 1. Iterator Kullanımı
        System.out.println("1. Iterator Kullanımı:");
        ArrayList<String> iteratorList = new ArrayList<>();
        iteratorList.add("Ali");
        iteratorList.add("Veli");
        iteratorList.add("Ahmet");

        Iterator<String> iterator = iteratorList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n2. ListIterator Kullanımı:");
        // 2. ListIterator Kullanımı
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Abant");
        linkedList.add("Mengen");
        linkedList.add("Gerede");

        ListIterator<String> listIterator = linkedList.listIterator();

        System.out.println("İleri Yönde İterasyon:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nGeri Yönde İterasyon:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\n3. ArrayList ve LinkedList Farkları:");
        // 3. ArrayList ve LinkedList Farkları
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Jack");
        arrayList.add("Mike");
        arrayList.add("Hulk");
        System.out.println("ArrayList Elemanları: " + arrayList);

        LinkedList<String> anotherLinkedList = new LinkedList<>();
        anotherLinkedList.add("Jade");
        anotherLinkedList.add("June");
        anotherLinkedList.add("April");
        System.out.println("LinkedList Elemanları: " + anotherLinkedList);

        System.out.println("\n4. LinkedList Özel Metotları:");
        // 4. LinkedList Özel Metotları
        LinkedList<String> specialLinkedList = new LinkedList<>();
        specialLinkedList.addFirst("İlk");
        specialLinkedList.addLast("Son");
        System.out.println("İlk Eleman: " + specialLinkedList.getFirst());
        System.out.println("Son Eleman: " + specialLinkedList.getLast());

        specialLinkedList.removeFirst();
        specialLinkedList.removeLast();
        System.out.println("Güncel Liste: " + specialLinkedList);

        System.out.println("\n5. ArrayList ile Kapasite Yönetimi:");
        // 5. ArrayList ile Kapasite Yönetimi
        ArrayList<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("ArrayList Elemanları: " + numbers);
        numbers.ensureCapacity(10); // Kapasiteyi artırma

        System.out.println("\n6. Iterator Kullanılarak Güvenli Silme:");
        // 6. Iterator Kullanılarak Güvenli Silme
        ArrayList<String> listWithIterator = new ArrayList<>();
        listWithIterator.add("Ali");
        listWithIterator.add("Veli");
        listWithIterator.add("Ahmet");
        listWithIterator.add("Fatma");

        System.out.println("Başlangıç Listesi: " + listWithIterator);
        Iterator<String> safeIterator = listWithIterator.iterator();
        while (safeIterator.hasNext()) {
            String element = safeIterator.next();
            if (element.startsWith("A")) { // 'A' harfiyle başlayanları silelim
                safeIterator.remove(); // Güvenli silme
            }
        }

        System.out.println("Son Liste (Güvenli Silme): " + listWithIterator);
    }
}