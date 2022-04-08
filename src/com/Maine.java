package com;

public class Maine {
    public static void main(String[] args) {

        Bear bear = new Bear("beer", 6);
        bear.hunt();
        System.out.println(bear.getAge()+ " " +bear.getName());

        Volf volf = new Volf("Volf", 5);
        volf.hunt();
        System.out.println(volf.getName()+ " " +volf.getAge());

        Lion lion = new Lion("Leon", 7);
        lion.hunt();
        System.out.println(lion.getName()+ " " +volf.getAge());
    }
}
