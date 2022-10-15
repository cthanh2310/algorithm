package practice.dynamic;

import java.util.Scanner;

public class T305_TongLonNhatCuaDayConTangDan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            System.out.println(qhd(a, n));
        }
    }

    public static int qhd(int a[], int n) {
        int f[] = new int[n], i, j, kq = 0;
        f[0] = a[0];
        for (i = 1; i < n; i++) {
            f[i] = a[i];
            for (j = 0; j < i; j++) {
                if (a[j] < a[i])
                    f[i] = Math.max(f[i], f[j] + a[i]);
            }
            kq = Math.max(kq, f[i]);
        }
        return kq;
    }
}
