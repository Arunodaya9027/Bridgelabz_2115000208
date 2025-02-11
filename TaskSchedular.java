class Task {
    final String taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(String taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TasksLinkedList {
    Task head;

    public int sizeOf() {
        if(head == null)
            return 0;
        
        int count = 1;
        Task temp = head;
        while(temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insert(Task node) {
        Task temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    public void addRecordAtBeginning(Task node) {
        if (head == null) {
            head = node;
            head.next = head;
        }
        else {
            insert(node);
            head = node;
        }
        System.out.println("Task is added at the Beginning");
    }

    public void addRecordAtEnd(Task node) {
        if (head == null) {
            head = node;
            head.next = head;
        }
        else 
            insert(node);
        System.out.println("Task is added at the very end");
    }

    public void addRecordAtMid(Task node, int position) {
        if(head == null && position > 1) {
            System.out.printf("List is empty, can't insert at position %d\n", position);
            return;
        }
        else if(position == 1) 
            addRecordAtBeginning(node);
        else if(head != null && position == sizeOf()+1)
            addRecordAtEnd(node);
        else if(position > sizeOf()+1 || position < 1)
            System.out.printf("Out of Bounds, can't insert at position %d \n", position);
        else {
            Task temp = head;
            int pointer = position - 1;
            while (--pointer > 0) 
                temp = temp.next;
            node.next = temp.next;
            temp.next = node;
            System.out.printf("Task is added at Position %d\n", position);
        }
    }

    public void delete(String taskId) {
        if (head == null) {
            System.out.println("List is empty");
        }
        // else if (head.taskId.equals(taskId)) {
        //     Task temp = head;
        //     while (temp.next != head) 
        //         temp = temp.next;
        //     head = head.next;
        //     temp.next = head;
        //     System.out.println("Task is deleted");
        // }
        else {
            Task temp = head;
            while (temp.next != head) {
                if (temp.next.taskId.equals(taskId)) {
                    temp.next = temp.next.next;
                    System.out.println("Task is deleted");
                    return;
                }
                temp = temp.next;
            }

            System.out.printf("Task with id %s doesn't exists, can't be deleted\n", taskId);
        }
    }

    public void search(int priority) {
        if(head == null)
            System.out.println("List is empty");
        else {
            int position = 1;
            Task temp = head;
            while(temp != head) {
                if(temp.priority == priority) {
                    System.out.printf("Task with priority %d is found at Position %d\n", priority, position);
                    return;
                }
                position++;
                temp = temp.next;
            }

            System.out.printf("Task with priority %d is doesn't exists!\n", priority);
        }
    }

    public void display() {
        Task temp = head;
        Task target = null;
        System.out.println();
        while (temp != target) {
            System.out.println("Task Id: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority Level: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println();
            target = head;
            temp = temp.next;
        }
    }
}

public class TaskSchedular {
    public static void main(String[] args) {
        TasksLinkedList tasks = new TasksLinkedList();
        tasks.addRecordAtBeginning(new Task("T1", "Task 1", 1, "2021-09-01"));
        tasks.addRecordAtEnd(new Task("T2", "Task 2", 2, "2021-09-02"));
        tasks.addRecordAtMid(new Task("T3", "Task 3", 3, "2021-09-03"), 1);
        tasks.addRecordAtMid(new Task("T4", "Task 4", 4, "2021-09-04"), 4);
        tasks.addRecordAtMid(new Task("T5", "Task 5", 5, "2021-09-05"), 2);
        tasks.display();
        tasks.delete("T3");
        tasks.display();
        tasks.search(4);
    }
}
