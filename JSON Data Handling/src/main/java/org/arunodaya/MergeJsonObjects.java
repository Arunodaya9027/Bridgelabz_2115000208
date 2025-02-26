package org.arunodaya;

import org.json.JSONObject;
public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("Name", "Arunodaya");
        jsonObject1.put("Age", 20);
        jsonObject1.put("City", "Bangalore");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("Email", "arunodaya.pratap@gmail.com");
        jsonObject2.put("Phone", "123-456-7890");

        JSONObject mergedJsonObject = new JSONObject();
        mergedJsonObject.put("Personal Info.", jsonObject1);
        mergedJsonObject.put("Contact", jsonObject2);
        System.out.println(mergedJsonObject.toString());
    }
}
