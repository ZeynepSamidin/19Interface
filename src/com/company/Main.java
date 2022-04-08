package com.company;

public class Main {

    public static void main(String[] args) {

   Swimable okeanarium1 = new Shark();
   Swimable okeanarium2 = new Shark();
   Swimable okeanarium3 = new Shark();
   Swimable okeanarium4 = new Shark();
   Swimable okeanarium5 = new Shark();

   Swimable okeanarium6 = new Dack();
   Swimable okeanarium7 = new Dack();
   Swimable okeanarium8 = new Dack();
   Swimable okeanarium9 = new Dack();
   Swimable okeanarium10 = new Dack();

   Swimable okeanarium11 = new Turtle();
   Swimable okeanarium12 = new Turtle();
   Swimable okeanarium13 = new Turtle();
   Swimable okeanarium14 = new Turtle();
   Swimable okeanarium15 = new Turtle();

   Swimable[] okean = {okeanarium1,okeanarium2,okeanarium3,okeanarium4,okeanarium5,okeanarium6,
           okeanarium7,okeanarium8,okeanarium9,okeanarium10,okeanarium11,okeanarium12,okeanarium13,
            okeanarium14,okeanarium15};

        for (Swimable swimable : okean) {
            System.out.println(swimable);



        }

    }
}
