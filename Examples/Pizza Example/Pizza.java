abstract public class Pizza {

    final Size size;

    Pizza(Size size) {
        this.size = size;
    }

    // Getter method for size
    protected Size getSize() {
        return size;
    }

    // Abstract method to calculate price
    protected abstract double getPrice();

}