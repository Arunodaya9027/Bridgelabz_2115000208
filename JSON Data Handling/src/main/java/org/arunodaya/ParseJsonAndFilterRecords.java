package org.arunodaya;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class ParseJsonAndFilterRecords {
    public static void main(String[] args) {
        try {
            String filePath = "src/data/users.json";
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            List<JsonNode> filteredRecords = new ArrayList<>();
            for (JsonNode record : jsonNode)
                if (record.get("age").asInt() > 25) 
                    filteredRecords.add(record);

            System.out.println(filteredRecords);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
