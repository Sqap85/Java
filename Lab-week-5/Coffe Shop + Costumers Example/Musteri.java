import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String isim;
    private ArrayList<Icecek> siparisler;

    public Musteri(String isim) {
        this.isim = isim;
        this.siparisler = new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    public ArrayList<Icecek> getSiparisler() {
        return siparisler;
    }

    public void siparisEkle(Icecek icecek) {
        siparisler.add(icecek);
    }
}
