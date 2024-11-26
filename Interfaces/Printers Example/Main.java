// Ana interface: Printer
interface Printer {
    void print();
}

// Ek fonksiyonları belirten interface'ler
interface ColoredPrinter extends Printer {
    void coloredPrint();
}

interface Fax {
    void fax();
}

interface Scan {
    void scan();
}

// Canon Professional Sınıfı
class CanonProfessional implements ColoredPrinter, Fax, Scan {
    @Override
    public void print() {
        System.out.println("Canon Professional is printing...");
    }

    @Override
    public void coloredPrint() {
        System.out.println("Canon Professional is printing in color...");
    }

    @Override
    public void fax() {
        System.out.println("Canon Professional is sending a fax...");
    }

    @Override
    public void scan() {
        System.out.println("Canon Professional is scanning...");
    }
}

// Canon Basic Sınıfı
class CanonBasic implements Printer, Scan {
    @Override
    public void print() {
        System.out.println("Canon Basic is printing...");
    }

    @Override
    public void scan() {
        System.out.println("Canon Basic is scanning...");
    }
}

// Canon Office Sınıfı
class CanonOffice implements Printer, Fax, Scan {
    @Override
    public void print() {
        System.out.println("Canon Office is printing...");
    }

    @Override
    public void fax() {
        System.out.println("Canon Office is sending a fax...");
    }

    @Override
    public void scan() {
        System.out.println("Canon Office is scanning...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Yazıcı nesneleri oluşturuluyor
        Printer[] printers = {
                new CanonProfessional(),
                new CanonBasic(),
                new CanonOffice()
        };

        // Sadece Fax interface'ine sahip olan nesnelerin fax() özelliği çalıştırılıyor
        for (Printer printer : printers) {
            if (printer instanceof Fax) {
                ((Fax) printer).fax();
            }
        }
    }
}