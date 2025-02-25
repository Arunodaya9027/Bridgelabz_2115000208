package org.arunodaya;
import com.opencsv.CSVReader;
import java.io.FileReader;

public class RowsInCSVFile {
    public static void main(String[] args) {
        String filePath = "src/data/employees.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            int totalRows = 0;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[0].equals("ID"))
                    continue;
                else
                    totalRows++;
            }

            System.out.println("Total rows in the CSV file: " + totalRows);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
