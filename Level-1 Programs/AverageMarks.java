public class AverageMarks {
    public static void main(String[] args) {
        //Sam's Marks
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int mathMarks = 94;
        int sum = physicsMarks + chemistryMarks + mathMarks;        //Adding all the marks
        int average = sum / 3;      //Finding the average marks by dividing Sum of Marks with Total Subjects
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
