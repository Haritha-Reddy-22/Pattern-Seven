import java.util.Scanner;

public class PatternSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the diamond (odd number recommended): ");
        int n = sc.nextInt();
        sc.close();

        int spaces = n / 2; // Spaces before the first star
        int stars = 1; // Starts with one star

        // Upper part of the diamond
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower part of the diamond
        spaces = 1;
        stars = n - 2;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}
