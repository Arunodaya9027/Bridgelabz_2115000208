package org.arunodaya;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

class EmployeeDetails {
    String name;
    int age;

    EmployeeDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJSON {
    public static void main(String[] args) {
        List<EmployeeDetails> employees = new ArrayList<>();
        employees.add(new EmployeeDetails("Amit", 30));
        employees.add(new EmployeeDetails("Rahul", 25));

        JSONArray jsonArray = new JSONArray();
        for (EmployeeDetails emp : employees) {
            JSONObject obj = new JSONObject();
            obj.put("name", emp.name);
            obj.put("age", emp.age);
            jsonArray.put(obj);
        }

        System.out.println(jsonArray.toString(2));
    }
}
