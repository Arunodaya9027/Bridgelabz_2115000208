import java.util.*;

public class RocketLaunch {
    public static void main(String[] args) {
        int counter;
        Scanner input = new Scanner(System.in);
        counter = input.nextInt();
        while(counter > 0){
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
