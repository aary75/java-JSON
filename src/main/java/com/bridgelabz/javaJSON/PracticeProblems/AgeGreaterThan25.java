package com.bridgelabz.javaJSON.PracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class AgeGreaterThan25 {
    public static void main(String[] args){
        String jsonData = "[{\"name\":\"Aaryan\",\"age\":22},{\"name\":\"Riya\",\"age\":28},{\"name\":\"Kabir\",\"age\":30}]";

        JSONArray original = new JSONArray(jsonData);
        JSONArray filter = new JSONArray();

        for(int i= 0;i<original.length();i++){
            JSONObject person = original.getJSONObject(i);

            int age = person.getInt("age");

            if(age > 25){
                filter.put(person);
            }
        }

        System.out.println(filter.toString());
    }
}

//[{"name":"Riya","age":28},{"name":"Kabir","age":30}]