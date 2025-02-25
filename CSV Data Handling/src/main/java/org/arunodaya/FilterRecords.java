package org.arunodaya;
import com.opencsv.CSVReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "src/data/studentDetails.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            System.out.println("Student who scored more than 80:");
            while ((nextLine = reader.readNext()) != null) {
                if(nextLine[0].equals("ID"))
                    System.out.printf("%s\t%s\t\t\t%s\t\t%s\n", nextLine[0], nextLine[1], nextLine[2], nextLine[3]);
                else if(Integer.parseInt(nextLine[3]) > 80)
                    System.out.printf("%s\t%s    %s\t\t%s\n", nextLine[0], nextLine[1], nextLine[2], nextLine[3]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
