package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class T214_TienToHauTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String s = scanner.nextLine();
            Stack<String> st = new Stack<>();
            // chay debug de hieu code
            for (int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%' || s.charAt(i) == '^'){
                    String s1 = st.pop();
                    String s2 = st.pop();
                    st.push(s1+s2+s.charAt(i)+"");
                }
                else st.push(s.charAt(i)+"");
            }
            System.out.println(st.pop()); // in ra thang cuoi cung trong stack
        }
    }
}
