package com.bridgelabz.javaJSON.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.Iterator;

public class MergeJSONobject {
    public static void main(String[] args){
        JSONObject studentDetails = new JSONObject();

        studentDetails.put("Collage","Chitkara University");
        studentDetails.put("Age",21);
        studentDetails.put("Name","Aaryan");

        JSONObject studentGrades = new JSONObject();

        studentGrades.put("Grade","A+");
        studentGrades.put("Department","CSE");

        Iterator<String> keys = studentDetails.keys();
        while(keys.hasNext()){
            String key = keys.next();
            Object value = studentDetails.get(key);

            studentGrades.put(key,value);
        }

        System.out.println(studentGrades.toString());
    }
}
