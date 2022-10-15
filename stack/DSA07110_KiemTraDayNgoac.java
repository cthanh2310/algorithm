package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class DSA07110_KiemTraDayNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s = scanner.nextLine();
            Stack<Character> st = new Stack<>();
            for(int i = 0;i<s.length();i++){
                if(st.empty()) // Bo sung ngay lap tuc
                    st.push(s.charAt(i));
                else if((s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == ']' && st.peek() == '[') || (s.charAt(i) == '}' && st.peek() == '{'))
                    st.pop(); // Moi khi pop ra khoi stack thi phai kiem tra luon xem stack co empty khong
                else st.push(s.charAt(i));
            }
            if(st.empty())
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
