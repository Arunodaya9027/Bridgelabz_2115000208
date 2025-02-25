package org.arunodaya;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;

public class ModifyRecords {
    public static void main(String[] args) {
        String inputFilePath = "src/data/employees.csv";
        String updatedFilePath = "src/data/employees_updated.csv";
        try (CSVReader reader = new CSVReader(new FileReader(inputFilePath));
             CSVWriter writer = new CSVWriter(new FileWriter(updatedFilePath))) {
            List<String[]> records = new ArrayList<>();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (!nextLine[0].equals("ID") && nextLine[2].equals("IT")) {
                    double salary = Double.parseDouble(nextLine[3]);
                    nextLine[3] = String.valueOf(salary * 1.1);
                }
                records.add(nextLine);
            }

            writer.writeAll(records);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
