package practice.recursive;

import java.util.Scanner;

public class T205_LuyThua {
    static int n, k, mod = (int) 1e9+7;
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            System.out.println(powMod(n,k));
        }
    }
    public static long powMod(int n, int k) {
        if (k==0) return 1;
        long x = powMod(n, k/2);
        if (k%2 == 0) return x*x%mod;
        return n*(x*x%mod)%mod;
    }
}
