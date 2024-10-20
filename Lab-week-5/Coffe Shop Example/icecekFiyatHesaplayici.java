import java.util.ArrayList;
public class icecekFiyatHesaplayici {

    private static int fiyatsabiti = 5;  // Fiyat sabiti

    double fiyatHesapla(ArrayList<Icecek> icecekler){

        double Total = 0;
        for (Icecek i : icecekler){
            int boyutFiyat = i.getBoyutISim().getBoyutInt();
            int tipFiyat = i.getTipIsim().getTipInt() * fiyatsabiti;

            Total += tipFiyat + boyutFiyat;
        }
        return Total;
    }
}