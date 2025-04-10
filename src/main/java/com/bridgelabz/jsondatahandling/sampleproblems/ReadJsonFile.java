package com.bridgelabz.jsondatahandling.sampleproblems;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(new File("User.json"), User.class);

            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
