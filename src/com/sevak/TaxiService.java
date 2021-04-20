package com.sevak;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaxiService {
    Scanner scanner = new Scanner(System.in);

    public Taxi createTaxi() {
        Taxi taxi = new Taxi();
        boolean happyEnd = false;

        while (true) {
            System.out.println("Please enter taxi parameters");
            //Model
            System.out.println("Please enter model(Any not empty string)");
            String model = scanner.nextLine();
            model = model.trim();
            if (model.equals("")) {
                System.out.println("Model is incorrect");
                continue;
            } else {
                taxi.setModel(model);
            }
            //Country
            System.out.println("Please enter Country(Any not empty string)");
            String country = scanner.nextLine();
            country = country.trim();
            if (country.equals("")) {
                System.out.println("Country is incorrect");
                break;
            } else {
                taxi.setCountry(country);
            }
            //Year
            System.out.println("Please enter Year(from 1903 to 2020)");
            int year = scanner.nextInt();
            if (year < 1902 || year > 2020) {
                System.out.println("Year is incorrect");
                break;
            } else {
                taxi.setYear(year);
            }

            //Mile
            System.out.println("Please enter the Mile");
            int mile = scanner.nextInt();
            if (mile < 0 || mile > 999_999) {
                System.out.println("Mile is incorrect");
                break;
            } else {
                taxi.setMile(mile);
            }
            //Sport
            System.out.println("Please enter the sport Yes or No");
            String sport = scanner.next();
            if (sport.equals("Yes")) {
                taxi.setSport(true);
            } else {
                if (sport.equals("No")) {
                    taxi.setSport(false);
                } else {
                    System.out.println("Sport is incorrect");
                    break;
                }
            }


            //weight
            System.out.println("Please enter the Weight");
            int weight = scanner.nextInt();
            if(weight<1000||weight>3000) {
                System.out.println("Weight is incorrect");
                break;
            }else {
                taxi.setWeight(weight);
            }

            //topSpeed
            System.out.println("Please enter the TopSpeed maximal speed per hour (220 km/h) (any not negative value)");
            int speed = scanner.nextInt();
            if(speed<0||speed>220){
                System.out.println("Speed is incorrect");
                break;
            }else {
                taxi.setTopSpeed(speed);
            }

            //seats - number of seats (any not negative value)
            System.out.println("Please enter the Seats number of seats (any not negative value)");
            int seats = scanner.nextInt();
            if(seats<=0){
                System.out.println("Number of seats is incorrect");
                break;
            }else {
                taxi.setSeats(seats);
            }
            //        cost - cost of the car (ex: 445.6$) (any not negative value)
            System.out.println("Please enter the double coast  (any not negative value) ");
            double cost = scanner.nextDouble();
            if(cost<0.0){
                System.out.println("Coast is incorrect");
                break;
            }else {
                taxi.setCost(cost);
            }
            happyEnd=true;
            break;



        }
        return happyEnd ? taxi : null;
    }

    public void ifSportCoastAndTopSpeed(Taxi taxi){
        if(taxi.isSport()){
            System.out.println("Taxi coast "+taxi.getCost() + "Taxi topSpeed "+taxi.getTopSpeed());
        }else {
            System.out.println("Taxi model "+taxi.getModel()+"Taxi country "+taxi.getCountry());
        }
    }

    public void newerTaxi(Taxi taxi1, Taxi taxi2){
        if(taxi1.getYear()>taxi2.getYear()) {
            System.out.println("Newer " + taxi1);
        }else {
            System.out.println("Newer " + taxi2);
        }
    }

    public void countryOfSmallestSets(Taxi taxi1, Taxi taxi2, Taxi taxi3){
        Taxi taxi = taxi1;
        if(taxi1.getSeats()>taxi2.getSeats()) {
            taxi = taxi2;
        }
        if(taxi.getSeats()>taxi3.getSeats()){
            taxi = taxi3;
        }
        System.out.println("Country of the Taxi with smallest seats count "+taxi.getCountry());
    }

    public void notSportTaxis(Taxi []taxis){
        System.out.println("All not sport Taxis");
        for (int i = 0; i < taxis.length; i++) {
            if(!taxis[i].isSport())
                System.out.println(taxis[i]);
        }
    }

    public void allSportsRoadMore5000(Taxi []taxis){
        for (Taxi taxi : taxis) {
            if(taxi.isSport() && taxi.getMile()>=50000) {
                System.out.println(taxis);
            }
        }
    }

    public void minWeight(Taxi []taxis){
        Taxi taxi = taxis[0];
        for (int i = 1; i < taxis.length; i++) {
            if(taxi.getWeight()>taxis[i].getWeight()) {
                taxi = taxis[i];
            }
        }
        System.out.println(taxi);
    }

    public void minCoastAllSports(Taxi []taxis){
        Taxi taxi = new Taxi();
        for (Taxi taxi1 : taxis) {
            if(taxi1.isSport())
                taxi = taxi1;
            break;
        }

        for (Taxi taxi1 : taxis) {
            if(taxi1.isSport() && taxi.getCost()>taxi1.getCost())
            {
                taxi = taxi1;
            }
        }
        System.out.println(taxi);
    }

 public void allByYear(Taxi[] taxis){
     for (Taxi taxi : BubbleSort.sort(taxis)) {
         System.out.println(taxi);
     }

 }







}


















