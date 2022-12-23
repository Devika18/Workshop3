import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want to print the pattern?");
        int rows = scanner.nextInt();
        System.out.println("\nThe Star Pattern is: ");
        for(int m = 1; m <= rows; m++) {                        //Used to print the rows
            for(int n = 1; n <= rows; n++) {                    //Used to print the columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
