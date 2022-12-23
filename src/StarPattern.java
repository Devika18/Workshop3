public class StarPattern {
    public static void main(String[] args) {
        int rows = 4;
        System.out.println("\nThe Star Pattern is: ");
        for(int m = 1; m <= rows; m++) {                        //Used to print the rows
            for(int n = 1; n <= rows; n++) {                    //Used to print the columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
