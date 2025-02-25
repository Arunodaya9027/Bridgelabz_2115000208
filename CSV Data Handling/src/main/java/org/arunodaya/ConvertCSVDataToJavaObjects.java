package org.arunodaya;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;
    int marks;
    int id;

    public Student(int id , String name , int age , int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void displayStudentData(){
        System.out.println("====================");
        System.out.println("Id:- " + id);
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
        System.out.println("Marks:- " + marks);
        System.out.println("=====================");
    }
}

public class ConvertCSVDataToJavaObjects {
    public static void main(String[] args) {
        String path = "src/data/studentDetails.csv";
        List<Student> studentList = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(path))){
            String[] record;
            reader.readNext();
            while ((record = reader.readNext())!= null)
                studentList.add(new Student(Integer.parseInt(record[0]) , record[1] , Integer.parseInt(record[2]) , Integer.parseInt(record[3])));

            for(Student stu : studentList)
                stu.displayStudentData();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}