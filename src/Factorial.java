import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(recursion(n));
        scanner.close();
    }

    private static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursion(n - 1);
    }
}
