package org.arunodaya;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}

public class ConvertJavaObjectToJsonArray {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Arunodaya", 30, "Mathura"));
        employees.add(new Employee("Jessie", 35, "Nagpur"));
        employees.add(new Employee("Aman", 25, "Shimla"));

        try {
            String jsonArray = new ObjectMapper().writeValueAsString(employees);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}