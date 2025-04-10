package com.bridgelabz.jsondatahandling.sampleproblems;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JsonObject Student = new JsonObject();
        Student.addProperty("name", "Pranav");
        Student.addProperty("age", 22);

        JsonArray subjects = new JsonArray();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C++");
        Student.add("subjects", subjects);

        System.out.println(Student);

    }
}
