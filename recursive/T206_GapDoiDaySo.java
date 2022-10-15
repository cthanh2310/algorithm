package practice.recursive;

import java.util.Scanner;

public class T206_GapDoiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(tinh(n, k));
        }
    }

    public static int tinh(int n, long k) {
        long x = (long) Math.pow(2, n - 1);
        if (k == x) return n;
        if (k < x) return tinh(n - 1, k);
        return tinh(n - 1, k - x);
    }
}
