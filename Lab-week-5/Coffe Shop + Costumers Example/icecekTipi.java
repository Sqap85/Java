public enum icecekTipi {
    CAY(2),
    KAHVE(4);

    private int tip;

     icecekTipi (int _tip){
         this.tip = _tip;
    }

    public int getTipInt() {
        return tip;
    }
}

