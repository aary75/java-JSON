package com.bridgelabz.javaJSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

// fields in the class must be public
class Car{
    public String model;
    public String color;
    public String company;

    public Car(String model,String color,String company){
        this.model = model;
        this.color = color;
        this.company = company;
    }
}
public class JavaObjectToJSON {
    public static void  main(String[] args){
        try{

            // Creation of object mapping
            ObjectMapper objectMapper = new ObjectMapper();

            Car car = new Car("Creta","Merchant Navy","Suzuki");

            // conversion of java object to JSON string
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
