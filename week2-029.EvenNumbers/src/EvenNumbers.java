import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int userInput = 1;
        
        while (userInput <= 100 && userInput > 0) {
            if (userInput % 2 == 0)
            System.out.println(userInput);
            userInput++;
        }
    }
}