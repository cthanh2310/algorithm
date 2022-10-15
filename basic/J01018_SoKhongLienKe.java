package practice.basic;

import java.util.Scanner;
import java.util.Stack;

public class J01018_SoKhongLienKe {
    public J01018_SoKhongLienKe() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char[] c = scanner.next().toCharArray();
            Stack<Character> st = new Stack<>();
            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                sum += c[i] - '0';
                if (st.size() == 0)
                    st.push(c[i]);
                else if (Math.abs(st.peek() - c[i]) == 2)
                    st.push(c[i]);
            }
            if (sum % 10 == 0 && (st.size() == c.length))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
