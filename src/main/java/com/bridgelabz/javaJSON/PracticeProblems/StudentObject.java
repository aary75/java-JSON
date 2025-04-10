package com.bridgelabz.javaJSON.PracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentObject {
    public static void main(String[] args){
        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("English");
        subjects.put("Hindi");
        subjects.put("General Knowledge");

        JSONObject student = new JSONObject();

        student.put("Name","Aaryan");
        student.put("Age",32);
        student.put("Subjects",subjects);

        System.out.println(student.toString());
    }
}
