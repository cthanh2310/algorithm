package practice.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class TN01_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        BigInteger[] f = new BigInteger[100];
        f[0] = new BigInteger("1");
        f[1] = new BigInteger("1");
        for (int i = 2; i <= 99; i++)
            f[i] = f[i - 1].add(f[i - 2]);
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(f[n - 1]);
        }
    }
}
