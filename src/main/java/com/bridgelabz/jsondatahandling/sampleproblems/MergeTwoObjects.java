package com.bridgelabz.jsondatahandling.sampleproblems;

import org.json.JSONObject;

public class MergeTwoObjects {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Pranav");
        obj1.put("age", 22);

        JSONObject obj2 = new JSONObject();
        obj2.put("city", "Chandigarh");
        obj2.put("country", "India");

        for(String key: obj2.keySet()){
            obj1.put(key,obj2.get(key));
        }
        System.out.println(obj1);
    }
}
