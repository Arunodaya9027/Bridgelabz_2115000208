package org.arunodaya;

import com.fasterxml.jackson.databind.ObjectMapper;
public class ValidateJsonStructure {
    public static void main(String[] args) {
        String json = "{\"name\":\"Arunodaya\",\"age\":30,\"address\":{\"city\":\"Bangalore\",\"state\":\"Karnataka\"}}";
        String invalidJson = "{\"name\":\"Arunodaya\",\"age\":30,\"address\":{\"city\":\"Bangalore\",\"state\":\"Karnataka\"}";

        System.out.println("Valid JSON: " + isValidJson(json));
        System.out.println("Invalid JSON: " + isValidJson(invalidJson));
    }

    private static boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
