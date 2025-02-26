package org.arunodaya;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            String filePath = "src/data/students.json";
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(filePath));
            System.out.printf("Name\t\t\t\tEmail\n");
            for (JsonNode studentNode : rootNode) {
                String name = studentNode.path("Name").asText();
                String email = studentNode.path("Email").asText();

                System.out.printf("%s\t\t%s\n", name, email);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}