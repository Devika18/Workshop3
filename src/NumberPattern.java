public class NumberPattern {
    public static void main(String[] args) {
        int rows = 6;
        System.out.println("\nThe Pattern is");
        for(int i = 1; i <= rows; i++) {
            for(int j = 3; j <= i; j++) {
                System.out.print(i+ "");
            }
            System.out.println();
        }
    }
}
