package com.bridgelabz.jsondatahandling.sampleproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(
                    new File("user2.json")
            );

            for(JsonNode node : root){
                if(node.get("age").asInt() > 25){
                    System.out.println(node);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
