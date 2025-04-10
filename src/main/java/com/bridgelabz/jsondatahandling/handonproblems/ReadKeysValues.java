package com.bridgelabz.jsondatahandling.handonproblems;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadKeysValues {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));

        root.fieldNames().forEachRemaining(field -> {
            JsonNode value = root.get(field);
            System.out.println("Key: " + field + ", Value: " + value);
        });
    }
}

