package com.sevak;

import java.util.Scanner;

public class TaxiTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxiService taxiService = new TaxiService();
        Taxi taxi1 = taxiService.createTaxi();
        System.out.println(taxi1);
        Taxi taxi2 = taxiService.createTaxi();
        System.out.println(taxi2);
        Taxi taxi3 = taxiService.createTaxi();
        System.out.println(taxi3);

        Taxi[] taxis = new Taxi[10];
        for (int i = 0; i <taxis.length ; i++) {
            taxis[i] = taxiService.createTaxi();
        }

        boolean cycle = true;

        while (cycle){
            System.out.println("Enter command number ");
            System.out.println("print cost and topSpeed if the taxi is sport otherwise print model and country 1");
            System.out.println("return the Taxi which one is newer (if they have the same age return first one). 2");
            System.out.println("print country of the Taxi with smallest seats count (if they have the same - print first). 3");
            System.out.println("print all not sport Taxis. 4");
            System.out.println("print all sport Taxis which were road more than 50000 km (milage). 5");
            System.out.println("return the Taxi with minimal weight (if there are some of them return last one). 6");
            System.out.println("return the Taxi with minimal cost from all sport Taxis (if there are some of them return first one). 7");
            System.out.println("print Taxi in ascending form order by year. 8");

            //System.out.println(2----);
            //System.out.println(3----);
            String action = scanner.nextLine();
            switch (action){
                case "1" -> taxiService.ifSportCoastAndTopSpeed(taxi1);
                case "2" -> taxiService.newerTaxi(taxi1, taxi2);
                case "3" -> taxiService.countryOfSmallestSets(taxi1, taxi2, taxi3);
                case "4" -> taxiService.notSportTaxis(taxis);
                case "5" -> taxiService.allSportsRoadMore5000(taxis);
                case "6" -> taxiService.minWeight(taxis);
                case "7" -> taxiService.minCoastAllSports(taxis);
                case "8" -> taxiService.allByYear(taxis);

                 case "9"-> cycle=false;
                default -> System.out.println("Number is incorrect");

            }
        }


    }
}
