package com.packeggggg;

public class Main {
    public static void main(String[] args) {
        /**  1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
         2. Квартирада жашагандар ком услуга толошот
         3. Общежитие менен гостиницада жашагандар аренда толошот
         4. Уй-булолор бир канча адамдан турушат
         5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
         6. Жашоо демек озунун адресин корсотуу*/

        Apartment apartment1 = new Apartment("Aziza", 19);
        Apartment apartment2 = new Apartment("Hurbek", 20);
        Apartment apartment3 = new Apartment("Hursultan", 22);

        apartment1.communal();

        Apartment[] apartments = {apartment1, apartment2,apartment3};

        for (Apartment apartment : apartments) {
            System.out.println(apartment);

        }
        System.out.println("* * * * * * * * *");

        Hostel hostel1 = new Hostel("Sonya", 24);
        Hostel hostel2 = new Hostel("Sanya", 22);
        Hostel hostel3 = new Hostel("Vanya", 23);

        hostel1.payRental();

        Hostel[] hostels = {hostel1,hostel2,hostel3};

        for (Hostel hostel : hostels) {
            System.out.println(hostel);

        }
        System.out.println(" * * * * * * * * *");

      Hotel hotel1 = new Hotel("Tom", 24);
      Hotel hotel2 = new Hotel("Tamara", 34);
      Hotel hotel3 = new Hotel("Toktogul", 44);

       hostel1.payRental();

       Hotel[] hotels = {hotel1,hotel2,hotel3};

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }



    }

}