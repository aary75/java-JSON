package com.bridgelabz.javaJSON.PracticeProblems;

import com.google.gson.Gson;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student1{
    String name;
    int age;
    String department;

    public Student1(String name,int age,String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

public class ObjectListToJSONarray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Object> studentList = new ArrayList<>();

        System.out.print("Total number of students:");
        int size = scanner.nextInt();
        scanner.nextLine();
        while(size > 0){
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();
            String department = scanner.nextLine();
          //  Student1 student = new Student1(name, age, department);
            studentList.add( new Student1(name, age, department));
            size--;
        }

        Gson gson = new Gson();
        String jsonArray = gson.toJson(studentList);
        System.out.println(jsonArray);
    }
}
