package com.bridgelabz.jsondatahandling.sampleproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(){
    }
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
}

public class JavaObjectsToJsonArray {
    public static void main(String[] args) {
        Person person1 = new Person("Pranav", 22, "Chandigarh");
        Person person2 = new Person("Nikhil", 21, "Patiala");

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(person1);
        peopleList.add(person2);

        ObjectMapper mapper = new ObjectMapper();
        try{
            String str = mapper.writeValueAsString(peopleList);
            JSONArray jsonArray = new JSONArray(str);
            System.out.println(jsonArray);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
