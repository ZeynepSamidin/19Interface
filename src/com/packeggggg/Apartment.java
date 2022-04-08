package com.packeggggg;

public class Apartment implements PayUtilitable{

    private String name;
    private int age;

    public Apartment(String name, int age) {
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
    public void communal() {
        System.out.println("Кватиранты платять коммунальные услуги");
    }
    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
