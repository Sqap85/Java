public enum icecekBoyut {

        KUCUK(2),
        ORTA(4),
        BUYUK(6);

        private final int boyut;

        icecekBoyut(int _boyut){
            this.boyut = _boyut;
        }

        public int getBoyutInt(){
            return boyut;
        }
    }

