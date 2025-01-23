import java.util.*;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        int counter;
        Scanner input = new Scanner(System.in);
        counter = input.nextInt();
        for(int i = counter; i > 0; i--){
            System.out.println(i);
        }
        input.close();
    }
}