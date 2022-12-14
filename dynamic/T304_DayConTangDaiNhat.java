package practice.dynamic;

import java.util.Scanner;

public class T304_DayConTangDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        System.out.println(qhd(a, n));
    }

    public static int qhd(int a[], int n) {
        int f[] = new int[n], i, j, kq = 0;
        f[0] = 1;
        for (i = 1; i < n; i++) {
            f[i] = 1;
            for (j = 0; j < i; j++) {
                if (a[j] < a[i])
                    f[i] = Math.max(f[i], f[j] + 1);
            }
            kq = Math.max(kq, f[i]);
        }
        return kq;
    }
}
