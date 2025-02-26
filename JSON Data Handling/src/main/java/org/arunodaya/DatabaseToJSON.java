package org.arunodaya;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseToJSON {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_master1", "root", "arun@1234");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student_master");

            JSONArray jsonArray = new JSONArray();
            while (rs.next()) {
                JSONObject obj = new JSONObject();
                obj.put("Id", rs.getInt("Student_ID"));
                obj.put("Name", rs.getString("Student_FName"));
                obj.put("Email", rs.getString("email"));
                jsonArray.put(obj);
            }

            System.out.println("JSON Report: " + jsonArray.toString(2));
            conn.close();
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
