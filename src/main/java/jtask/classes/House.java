package jtask.classes;

public class House {
    private String address;
    private int numberOfRooms;
    private double price;
    private String houseType;
    private int yearBuilt;

    public House(String address, int numberOfRooms, double price, String houseType, int yearBuilt) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.houseType = houseType;
        this.yearBuilt = yearBuilt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void displayInfo() {
        System.out.println("House Info:");
        System.out.printf("Address: %s%n", address);
        System.out.printf("Number of Rooms: %d%n", numberOfRooms);
        System.out.printf("Price: %.2f%n", price);
        System.out.printf("Type: %s%n", houseType);
        System.out.printf("Year Built: %d%n", yearBuilt);
        System.out.println();
    }
}
