package practice.basic;

import java.util.Scanner;
import java.util.Stack;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (st.size() == 0)
                st.push(a[i]);
            else if ((st.peek() + a[i]) % 2 == 0)
                st.pop();
            else st.push(a[i]);
        }
        System.out.println(st.size());
    }
}
