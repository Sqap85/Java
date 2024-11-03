public class Main {
    public static void main(String[] args) {
        try {
            // Create three Car objects using different constructors
            Car car1 = new Car(2020);  // Using constructor with year only
            Car car2 = new Car(2018, "Toyota");  // Using constructor with year and brand
            Car car3 = new Car(2021, 180, "Honda");  // Using constructor with year, maxSpeed, and brand

            // Attempt to set an invalid year to trigger the exception
            // car3.setYear(2023);  // This will throw an exception

            // Create a Factory object with the Car objects
            Car[] cars = { car1, car2, car3 };
            Factory factory = new Factory(cars);

            // Call printAllCarsInfo() method to print all cars' information
            factory.printAllCarsInfo();
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Car {
    private String brand = "Unknown"; // Default brand
    private int maxSpeed = 120; // Default max speed
    private int year;

    // Constructors
    Car(int year, int maxSpeed, String brand) {
        setYear(year);
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    Car(int year, String brand) {
        setYear(year);
        this.brand = brand;
    }

    Car(int year) {
        setYear(year);
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        if (year > 2022) {
            throw new IllegalArgumentException("Year cannot be greater than 2022.");
        }
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Method to get car information
    public String getCarInfo() {
        return "Brand: " + brand + ", Max Speed: " + maxSpeed + ", Year: " + year;
    }
}

class Factory {
    private Car[] cars;

    // Constructor
    Factory(Car[] cars) {
        this.cars = cars;
    }

    // Method to print information of all cars
    void printAllCarsInfo() {
        for (Car car : cars) {
            System.out.println(car.getCarInfo());
        }
    }
}
