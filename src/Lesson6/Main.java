package Lesson6;

import HomeWorkMetodi.TextUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String[][] tours = {{"Италия","7","400000","Самолет","5 звезд","полупансионат"},
                          {"Германия","4","100000","Автобус","4 звезды","пансионат"},
                          {"Египет","5","18800","Самолет","3 звезды","полупансионат"},
                          {"Германия","3","100960","Автобус","2 звезды","пансионат"},
                          {"Германия","5","236060","Самолет","5 звезды","пансионат"},
                          {"Кипр","10","44000","Самолет","5 звезд","полупансионат"}};

        Scanner scanner = new Scanner(System.in);
//        System.out.println("В какую страну хотите поехать?");
//        String country = scanner.nextLine();
//
//        ToursUtils.prntToursByCounty(tours,country);

//        System.out.println("На сколько дней хотите поехать?");
//        String days = scanner.nextLine();
//
//        ToursUtils.printToursByDays(tours,days);

        System.out.println("В какую страну хотите поехать?");
        String country = scanner.nextLine();
        System.out.println(ToursUtils.averageCostTourByCountry(tours,country));




    }
}
