package org.arunodaya;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenerateReportFromDatabase {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/student_master1";
        String username = "root";
        String password = "arun@1234";
        String csvFilePath = "src/data/employee_report.csv";
        String query = "SELECT id, name, age, dept_id, salary FROM employee";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();
             CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {

            String[] header = {"Employee ID", "Name", "Age", "Department Id", "Salary"};
            writer.writeNext(header);

            while (resultSet.next()) {
                String employeeId = resultSet.getString("id");
                String name = resultSet.getString("name");
                String age = resultSet.getString("age");
                String departmentId = resultSet.getString("dept_id");
                String salary = resultSet.getString("salary");

                String[] record = {employeeId, name, age, departmentId, salary};
                writer.writeNext(record);
            }

            System.out.println("CSV Report generated successfully at: " + csvFilePath);
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
        }
    }
}

