package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class T218__PhanTuDauTienBenPhaiLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            xuly(a, n);
        }
    }

    private static void xuly(int[] a, int n) {
        int right[] = new int[n], i;
        Stack<Integer> st = new Stack<>();
        for (i = n - 1; i >= 0; i--) {
            while (!st.empty() && a[i] >= st.peek()) st.pop();
            if (!st.empty()) right[i] = st.peek();
            else right[i] = -1;
            st.push(a[i]);
        }
        for (i = 0; i < n; i++)
            System.out.print(right[i] + " ");
        System.out.println();
    }
}
