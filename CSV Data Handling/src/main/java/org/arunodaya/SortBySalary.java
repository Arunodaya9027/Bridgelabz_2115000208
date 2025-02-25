package org.arunodaya;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SortBySalary {
    public static void main(String[] args) {
        String filePath = "src/data/employees.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            List<String[]> records = new ArrayList<>();
            while ((nextLine = reader.readNext()) != null) 
                records.add(nextLine);
            
            records.sort((record1, record2) -> {
                if (record1[0].equals("ID")) return -1;
                if (record2[0].equals("ID")) return 1;
                return Double.compare(Double.parseDouble(record2[3]), Double.parseDouble(record1[3]));
            });

            System.out.println("Top 5 highest-paid employees:");
            for (int i = 0; i < Math.min(6, records.size()); i++) {
                String[] record = records.get(i);
                System.out.printf("%s\t%s\t\t%s\t\t%s\n", record[0], record[1], record[2], record[3]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
