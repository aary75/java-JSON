package com.bridgelabz.javaJSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class Student{
    private String name;
    private String email;
    private int age;
    private String department;

    public Student(){}

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public String getDepartment(){
        return department;
    }

}

public class ReadJSONfile {
     public static void main(String[] args){
         try{
             // Creating of objectMapper
             ObjectMapper objectMapper = new ObjectMapper();

             // Reading the file
             Student student = objectMapper.readValue(new File("src/main/java/com/bridgelabz/javaJSON/PracticeProblems/data.json"),Student.class);

             System.out.println("Name: " + student.getName());
             System.out.println("Email: "+ student.getEmail());

             // Another way
//             ObjectMapper mapper = new ObjectMapper();
//
//             // Read JSON file into JsonNode
//             JsonNode rootNode = mapper.readTree(new File("data.json"));
//
//             // Extract specific fields
//             String name = rootNode.path("name").asText();
//             String email = rootNode.path("email").asText();
//
//             // Print the extracted fields
//             System.out.println("Name: " + name);
//             System.out.println("Email: " + email);

         } catch (Exception e){
             e.printStackTrace();
         }
     }
}

//Name: Aaryan
//Email: aaryan@gmail.com
