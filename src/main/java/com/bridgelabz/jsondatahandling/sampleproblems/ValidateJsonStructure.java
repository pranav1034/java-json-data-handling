package com.bridgelabz.jsondatahandling.sampleproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class User2 {
    private String name;
    private int age;
    private String city;

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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class ValidateJsonStructure {
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"Pranav\", \"age\": 22, \"city\": \"Chandigarh\" }";

        ObjectMapper mapper = new ObjectMapper();
        try{
            User2 user = mapper.readValue(jsonString, User2.class);
            System.out.println("Valid JSON structure");
            System.out.println(user);
        }
        catch(Exception e){
            System.out.println("Invalid JSON structure: " + e.getMessage());
        }
    }
}
