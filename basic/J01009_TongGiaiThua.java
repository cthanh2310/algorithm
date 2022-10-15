package practice.basic;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static long tich(long n) {
        long tich = 1;
        for (long i = 1; i <= n; i++)
            tich *= i;
        return tich;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++)
            sum += tich(i);
        System.out.println(sum);
    }
}
