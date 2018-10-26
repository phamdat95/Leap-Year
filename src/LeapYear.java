import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int number = scanner.nextInt();

        if (number % 4 == 0){
            if (number % 100 == 0){
                if (number % 400 == 0){
                    System.out.printf("%d is leap year!" , number);
                } else System.out.printf("%d isn't leap year!" , number);
            } else System.out.printf("%d is leap year!" , number);
        } else System.out.printf("%d isn't leap year!" , number);
    }
}
