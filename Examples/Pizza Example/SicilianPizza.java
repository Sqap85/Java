public class SicilianPizza extends Pizza {

    SicilianPizza(Size size) {
        super(size);
    }

    @Override
    protected double getPrice() {
        return size.getintSize() * 5; // Example calculation based on size multiplier
    }

    public void Make(){
        System.out.println("Sicilian Pizza is making..");
    }

    @Override
    public String toString() {
        return "Sicilian Pizza " + "Size: " + size + " Price: " + getPrice();
        //  getClass().getName() ismi verir
    }
}