package com.bridgelabz.jsondatahandling.sampleproblems;

import com.google.gson.Gson;
import org.json.JSONObject;

class Car{
    String name;
    int year;
    String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return "Car-> " +
                "name= " + name  +
                ", year= " + year +
                ", color= " + color;
    }
}

public class ObjectToJson {
    public static void main(String[] args) {
        Car car = new Car("Audi",2024,"Blue");
        System.out.println(car);

        JSONObject jsonCar = new JSONObject();
        jsonCar.put("name", car.name);
        jsonCar.put("year", car.year);
        jsonCar.put("color", car.color);

        System.out.println(jsonCar);
    }
}
