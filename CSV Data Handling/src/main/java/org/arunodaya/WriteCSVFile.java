package org.arunodaya;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {
    public static void main(String[] args) {
        String filePath = "src/data/employees.csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Salary"};
            writer.writeNext(header);
            String[] record1 = {"1", "Aarav Sharma", "IT", "85000"};
            String[] record2 = {"2", "Vihaan Patel", "HR", "90000"};
            String[] record3 = {"3", "Ananya Singh", "Finance", "75000"};
            String[] record4 = {"4", "Diya Gupta", "Marketing", "80000"};
            String[] record5 = {"5", "Krishna Iyer", "Sales", "88000"};
            String[] record6 = {"6", "Rohan Mehta", "IT", "92000"};
            String[] record7 = {"7", "Sara Khan", "HR", "87000"};

            writer.writeNext(record1);
            writer.writeNext(record2);
            writer.writeNext(record3);
            writer.writeNext(record4);
            writer.writeNext(record5);
            writer.writeNext(record6);
            writer.writeNext(record7);

            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
