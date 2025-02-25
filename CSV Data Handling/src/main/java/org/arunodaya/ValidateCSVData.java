package org.arunodaya;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static void main(String[] args) {
        String filePath = "src/data/new-employees.csv";
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?+\\.[a-zA-Z]{2,}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        String phoneRegex = "^\\d{10}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Salary", "Email", "Phone Number"};
            writer.writeNext(header);

            String[][] records = {
                    {"1", "Aarav Sharma", "IT", "85000", "aarav.sharma@-example.com", "9876543210"},
                    {"2", "Vihaan Patel", "HR", "90000", "vihaan.patel@example.com", "9876543211"},
                    {"3", "Ananya Singh", "Finance", "75000", "ananya.singh@ex4mple.com", "9876543212"},
                    {"4", "Diya Gupta", "Marketing", "80000", "diya.gupta@4xample.com", "9876543213"},
                    {"5", "Krishna Iyer", "Sales", "88000", "krishna.iyer@example.c", "9876543214"},
                    {"6", "Rohan Mehta", "IT", "92000", "rohan.mehta@example.com", "919876543215"},
                    {"7", "Sara Khan", "HR", "87000", "sara.khan@example.com", "9876543216"}
            };

            for (String[] record : records) {
                String email = record[4];
                String phoneNumber = record[5];

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneNumberValid = phonePattern.matcher(phoneNumber).matches();

                if (isEmailValid && isPhoneNumberValid) {
                    writer.writeNext(record);
                } else {
                    System.out.printf("Invalid record: %s, Error: %s\n", String.join(", ", record),
                            !isEmailValid ? "Invalid Email" : "Invalid Phone Number");
                }
            }

            System.out.println("CSV file created successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
