public class MixPizza extends Pizza {

    MixPizza(Size size) {
        super(size);
    }

    @Override
    protected double getPrice() {
        switch (getSize()) { // Pizzadaki getSize methodunu kullandi miras sayesinde
            case SMALL:
                return 10.0; // Example price for SMALL
            case MEDIUM:
                return 15.0; // Example price for MEDIUM
            case LARGE:
                return 20.0; // Example price for LARGE
            default:
                throw new IllegalStateException("Unexpected value: " + getSize());
        }
    }

    @Override
    public String toString() {
        return  "Miz Pizza" + " Size: " + size + " Price: " + getPrice();
          //getClass().getName() ismi verir
    }
}