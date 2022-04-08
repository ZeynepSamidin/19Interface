package com.packeggggg;

public class Hostel implements PayRentable{

    private String name;
    private int age;

    public Hostel(String name, int age) {
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
    public void payRental(){
        System.out.println("Аренда толошот..." );
    }
    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
