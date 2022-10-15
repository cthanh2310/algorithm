package practice.basic;

import java.util.Scanner;

public class TN02_USNTLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n == i) {
                    System.out.println(n);
                    check = false;
                    break;
                }
                while (n % i == 0)
                    n /= i;
            }
            if (check) System.out.println(n);
        }
    }
}
