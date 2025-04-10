package com.bridgelabz.javaJSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

class User{
    private String name;
    private String email;
    private int age;

    // getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
public class ValidateJSON {
    public static void main(String[] args){
       try{
           // Create JSONObject
           JSONObject jsonObject = new JSONObject();
           jsonObject.put("name","Aaryan");
           jsonObject.put("email","aaryan@gmail.com");
           jsonObject.put("age",21);

           // Convert jsonobject to string
           String jsonString = jsonObject.toString();

           // validing the JSONObject
           ObjectMapper mapper = new ObjectMapper();
           User user = mapper.readValue(jsonString, User.class);

           System.out.println(jsonObject.toString());
           System.out.println("Valid JSON");
       } catch (Exception e){
           System.out.println("JSON validation failed: " + e.getMessage());
       }
    }
}

//{"name":"Aaryan","email":"aaryan@gmail.com","age":21}
//Valid JSON
