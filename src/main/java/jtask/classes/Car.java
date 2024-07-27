package jtask.classes;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private String color;
    private int mileage;

    public Car(String make, String model, int year, double price, String color, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("Car Info:");
        System.out.printf("Make: %s%n", make);
        System.out.printf("Model: %s%n", model);
        System.out.printf("Year: %d%n", year);
        System.out.printf("Price: %.2f%n", price);
        System.out.printf("Color: %s%n", color);
        System.out.printf("Mileage: %d%n", mileage);
        System.out.println();
    }
}
