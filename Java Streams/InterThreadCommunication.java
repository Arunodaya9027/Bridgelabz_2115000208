import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pipedOutputStream.write(i);
                System.out.println("Data written: " + i);
                Thread.sleep(1000);
            }
            pipedOutputStream.close();
        } 
        catch (IOException | InterruptedException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pipedInputStream;

    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pipedInputStream.read()) != -1) {
                System.out.println("Data read: " + data);
            }
            pipedInputStream.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

            WriterThread writerThread = new WriterThread(pipedOutputStream);
            ReaderThread readerThread = new ReaderThread(pipedInputStream);

            writerThread.start();
            readerThread.start();
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}