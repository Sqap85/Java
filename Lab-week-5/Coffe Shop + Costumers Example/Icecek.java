public class Icecek {
    private icecekTipi Tip;
    private icecekBoyut Boyut;

    Icecek (icecekBoyut _boyut, icecekTipi _tip){
        this.Tip = _tip;
        this.Boyut = _boyut;
    }

    icecekTipi getTipIsim(){
        return Tip;
    }

    icecekBoyut getBoyutIsim(){
        return Boyut;
    }

}
