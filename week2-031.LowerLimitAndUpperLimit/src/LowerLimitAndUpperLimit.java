
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int userInput1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int userInput2 = Integer.parseInt(reader.nextLine());
        
        while (userInput1 <= userInput2) {
            System.out.println(userInput1);
            userInput1++;
        }
    }
}
