package practice.dynamic;

import java.util.Scanner;

public class T308_ToHop {
    static int c[][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = new int[1005][1005];
        int mod = (int) 1e9 + 7;
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) c[i][j] = 1;
                else c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
            }
        }

        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt(), k = in.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
