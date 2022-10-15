package practice.basic;

import java.util.Scanner;
import java.util.Stack;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            char[] c = scanner.next().toCharArray();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < c.length; i++) {
                if (st.size() == 0)
                    st.push(c[i]);
                else if (Math.abs(st.peek() - c[i]) == 1)
                    st.push(c[i]);
            }
            if (c.length == st.size()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
