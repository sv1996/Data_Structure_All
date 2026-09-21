package Collections.Comparable;


import groovy.transform.ToString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@ToString
class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}

public class Main {


    public static void main(String[] args) {
        Car[] car = new Car[3];
        car[0] = new Car("BMW", 2020);
        car[1] = new Car("Audi", 2018);
        car[2] = new Car("Mercedes", 2021);
        for (Car c : car) {
            System.out.println(c.getModel() + " " + c.getYear());
        }

        // sorting the car based on year
        Arrays.sort(car, (c1, c2) -> c1.getYear() - c2.getYear());
        System.out.println("After Sorting: ");
        for (Car c : car) {
            System.out.println(c.getModel() + " " + c.getYear());

        }


        System.out.println("Sorting using Comparator Interface: ");

        List<Car> carList = new java.util.ArrayList<>(List.of(
                new Car("BMW", 2020),
                new Car("Audi", 2018),
                new Car("Mercedes", 2021)
        ));


        Collections.sort(carList, new CarYearComparator());
        System.out.println("After Sorting using Comparator: ");
        for (Car c : carList) {
            System.out.println(c.getModel() + " " + c.getYear());

        }




    }






















}
