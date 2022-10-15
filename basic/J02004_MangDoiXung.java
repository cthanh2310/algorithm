package practice.basic;

import java.util.Scanner;

public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = scanner.nextInt();
            boolean ok = true;
            // Duyet thua xiu cung duoc
            for (int i = 0; i <= n / 2 + 1; i++) {
                if (a[i] != a[n - 1 - i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
