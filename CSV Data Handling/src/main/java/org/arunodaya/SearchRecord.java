package org.arunodaya;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
        String filePath = "src/data/employees.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[1].equals(name))
                    System.out.printf("Department: %s\nSalary: %s\n", nextLine[2], nextLine[3]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}