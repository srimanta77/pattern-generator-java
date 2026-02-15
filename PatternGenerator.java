import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===================PATTERN MENU===================");
            System.out.println("1. Number Tringle");
            System.out.println("2. Star Square");
            System.out.println("3. Right Tringle Star");
            System.out.println("4. Inverted Tringle");
            System.out.println("5. Floyd's Tringle");
            System.out.println("6. Exit");
            System.out.print("Choose an Option: ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Program Ended..! Thank you!");
                break;
            }

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            if (choice == 1) {
                for(int i = 1; i <= rows; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
            else if (choice == 2) {
                for(int i = 1; i <= rows; i++) {
                    for(int j = 1; j <= rows; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if (choice == 3) {
                for(int i = 1; i <= rows; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if (choice == 4) {
                for(int i = rows; i >= 1; i--) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if (choice == 5) {
                int num = 1;

                for(int i = 1; i <= rows; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print(num + " ");
                        num ++;
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input option.. Try again.!");
            }
        }
        scanner.close();
    }
}