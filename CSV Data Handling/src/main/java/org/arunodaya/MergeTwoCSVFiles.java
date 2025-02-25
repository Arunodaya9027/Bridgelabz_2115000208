package org.arunodaya;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCSVFiles {
    public static void main(String[] args) {
        String file1Path = "src/data/student1.csv";
        String file2Path = "src/data/student2.csv";
        String outputFilePath = "src/data/merged_students.csv";

        Map<String, String[]> studentData = new HashMap<>();

        try (CSVReader reader1 = new CSVReader(new FileReader(file1Path));
             CSVReader reader2 = new CSVReader(new FileReader(file2Path));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {

            String[] nextLine;
            reader1.readNext();
            while ((nextLine = reader1.readNext()) != null)
                studentData.put(nextLine[0], nextLine);

            reader2.readNext();
            while ((nextLine = reader2.readNext()) != null) {
                String id = nextLine[0];
                if (studentData.containsKey(id)) {
                    String[] studentInfo = studentData.get(id);
                    String[] mergedInfo = new String[studentInfo.length + nextLine.length - 1];
                    System.arraycopy(studentInfo, 0, mergedInfo, 0, studentInfo.length);
                    System.arraycopy(nextLine, 1, mergedInfo, studentInfo.length, nextLine.length - 1);
                    studentData.put(id, mergedInfo);
                }
            }

            String[] header = {"ID", "Name", "Age", "Marks", "Grade"};
            writer.writeNext(header);
            for (String[] record : studentData.values())
                writer.writeNext(record);

            System.out.println("CSV files merged successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}