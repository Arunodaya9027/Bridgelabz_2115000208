package org.arunodaya;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonObject {
    public static void main( String[] args ) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put("OOPS & Java Programming");
        jsonArray.put("Data Structures & Algorithms");
        jsonArray.put("MySQL & DBMS");
        jsonArray.put("Spring Boot");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Arunodaya");
        jsonObject.put("Age", 20);
        jsonObject.put("Subjects", jsonArray);

        System.out.println(jsonObject.toString());
    }
}
