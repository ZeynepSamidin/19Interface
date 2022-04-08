package com.packeggggg;

public class Hotel implements PayRentable{

    private String name;
    private int age;

    public Hotel(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public void payRental() {
        System.out.println("Арендаторы...");
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
