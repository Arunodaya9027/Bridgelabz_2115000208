class StudentNode {
    final String rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(String rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    public StudentNode createNode(String rollNumber, String name, int age, String grade) {return new StudentNode(rollNumber, name, age, grade);}

    public int sizeOf() {
        if(head == null)
            return 0;
        
        int count = 0;
        StudentNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void addRecordAtBeginning(StudentNode node) {
        if (head == null)
            head = node;
        else {
            node.next = head;
            head = node;
        }
        System.out.println("Student Record is added at the Beginning");
    }

    public void addRecordAtEnd(StudentNode node) {
        if (head == null)
            head = node;
        else {
            StudentNode temp = head;
            while (temp.next != null) 
                temp = temp.next;
            temp.next = node;
        }
        System.out.println("Student Record is added at the very end");
    }

    public void addRecordAtMid(StudentNode node, int position) {
        if(head == null && position > 1) {
            System.out.printf("List is empty, can't insert at %d position\n", position);
            return;
        }
        else if(position == 1) 
            addRecordAtBeginning(node);
        else if(head != null && position == sizeOf()+1)
            addRecordAtEnd(node);
        else if(position > sizeOf()+1 || position < 1)
            System.out.printf("Out of Bounds, can't insert at %d position\n", position);
        else {
            StudentNode temp = head;
            int pointer = position - 1;
            while (--pointer > 0) 
                temp = temp.next;
            node.next = temp.next;
            temp.next = node;
            System.out.printf("Student Record is added at your Position %d\n", position);
        }
    }

    public void delete(String rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (head.rollNumber.equals(rollNumber)) {
            head = head.next;
            System.out.println("Student Record is deleted");
        }
        else {
            StudentNode temp = head;
            while (temp.next != null) {
                if (temp.next.rollNumber.equals(rollNumber)) {
                    temp.next = temp.next.next;
                    System.out.println("Student Record is deleted");
                    return;
                }
                temp = temp.next;
            }

            System.out.printf("Student Record with Roll Number %s doesn't exists, can't be deleted\n", rollNumber);
        }
    }

    public void search(String rollNumber) {
        if(head == null)
            System.out.println("List is empty");
        else {
            int position = 1;
            StudentNode temp = head;
            while(temp != null) {
                if(temp.rollNumber.equals(rollNumber)) {
                    System.out.printf("Student Record with Roll Number %s is found at Position %d\n", rollNumber, position);
                    return;
                }
                position++;
                temp = temp.next;
            }

            System.out.printf("Student Record with Roll Number %s is doesn't exists!\n", rollNumber);
        }
    }

    public void display() {
        StudentNode temp = head;
        System.out.println();
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            System.out.println();
            temp = temp.next;
        }
    }

    public void update(String rollNumber, String grade) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            StudentNode temp = head;
            while (temp != null) {
                if(temp.rollNumber.equals(rollNumber)) {
                    temp.grade = grade;
                    System.out.printf("Student Record with Roll Number %s is updated\n", rollNumber);
                    return;
                }
                temp = temp.next;
            }
            System.out.printf("Student Record with Roll Number %s is doesn't exists!\n", rollNumber);
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList studentRecordLog = new StudentLinkedList();
        StudentNode student1 = studentRecordLog.createNode("2115000056", "John Doe", 20, "A");
        StudentNode student2 = studentRecordLog.createNode("2115000209", "John Doe", 20, "A");
        StudentNode student3 = studentRecordLog.createNode("2115000304", "John Doe", 20, "A");
        StudentNode student4 = studentRecordLog.createNode("2115000746", "John Doe", 20, "A");

        studentRecordLog.addRecordAtBeginning(student1);
        studentRecordLog.addRecordAtEnd(student2);
        studentRecordLog.addRecordAtMid(student3, 2);
        studentRecordLog.addRecordAtBeginning(student4);
        studentRecordLog.display();

        studentRecordLog.search("2115000242");
        studentRecordLog.search("2115000746");
        studentRecordLog.update("2115000056", "B");
        studentRecordLog.display();
        studentRecordLog.delete("2115000304");
        studentRecordLog.display();
    }
}