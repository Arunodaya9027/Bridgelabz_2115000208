class Process {
    int processID;
    int burstTime;
    int priority;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class ProcessQueue {
    Process head;

    public int sizeOf() {
        if (head == null)
            return 0;

        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public void addProcessAtEnd(Process node) {
        if (head == null) {
            head = node;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = node;
            node.next = head;
        }
        System.out.println("Process is added at the very end");
    }

    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("List is empty, can't remove any process");
            return;
        }

        Process temp = head;
        Process prev = null;
        do {
            if (temp.processID == processID) {
                if (temp == head) {
                    Process last = head;
                    while (last.next != head)
                        last = last.next;
                    if (head == head.next)
                        head = null;
                    else {
                        head = head.next;
                        last.next = head;
                    }
                } else
                    prev.next = temp.next;
                System.out.println("Process with ID " + processID + " is removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Process with ID " + processID + " is not found");
    }

    public void simulateRoundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("List is empty, can't simulate round robin scheduling");
            return;
        }
        Process temp = head;
        do {
            if (temp.burstTime > timeQuantum) {
                temp.burstTime -= timeQuantum;
                System.out.println("Process with ID " + temp.processID + " is executed for " + timeQuantum + " units");
            } else {
                System.out.println("Process with ID " + temp.processID + " is executed for " + temp.burstTime + " units");
                removeProcess(temp.processID);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("List is empty, can't display any process");
            return;
        }

        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public void calculateAverageWaitingTimeAndTurnAroundTime() {
        if (head == null) {
            System.out.println("List is empty, can't calculate average waiting time and turn around time");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        Process temp = head;
        do {
            totalWaitingTime += temp.burstTime;
            totalTurnAroundTime += temp.burstTime + temp.priority;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Average Waiting Time: " + (totalWaitingTime / sizeOf()));
        System.out.println("Average Turn Around Time: " + (totalTurnAroundTime / sizeOf()));
    }
}

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        ProcessQueue processQueue = new ProcessQueue();
        processQueue.addProcessAtEnd(new Process(1, 10, 2));
        processQueue.addProcessAtEnd(new Process(2, 5, 1));
        processQueue.addProcessAtEnd(new Process(3, 8, 3));
        processQueue.addProcessAtEnd(new Process(4, 12, 4));
        processQueue.addProcessAtEnd(new Process(5, 7, 5));

        processQueue.displayProcesses();
        processQueue.simulateRoundRobinScheduling(5);
        processQueue.displayProcesses();
        processQueue.calculateAverageWaitingTimeAndTurnAroundTime();
    }
}