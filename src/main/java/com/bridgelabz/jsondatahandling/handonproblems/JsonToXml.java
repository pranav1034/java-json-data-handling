package com.bridgelabz.jsondatahandling.handonproblems;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToXml{
    public static void main(String[] args) {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get("user.json")));

            JSONObject json = new JSONObject(jsonContent);

            String xml = XML.toString(json);
            System.out.println(xml);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

