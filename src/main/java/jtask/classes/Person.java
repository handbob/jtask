package jtask.classes;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public Person(String name, int age, String gender, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void free() {
        this.name = null;
        this.age = 0;
        this.gender = null;
        this.address = null;
        this.phoneNumber = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Person Info:");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Gender: %s%n", gender);
        System.out.printf("Address: %s%n", address);
        System.out.printf("Phone Number: %s%n", phoneNumber);
        System.out.println();
    }
}
