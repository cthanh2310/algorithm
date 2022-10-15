package practice.stack;

import java.util.Scanner;
import java.util.Stack;

/*
- + 8 / 6 3 2 = 6/3 + 8 - 2 = 8
*/
public class T217_GiaTriTienTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s = scanner.nextLine();
            Stack<Integer> st = new Stack<>();
            for(int i = s.length()-1; i >= 0; i--){
                if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '^' || s.charAt(i) == '%'){
                    int so1 = st.pop(), so2 = st.pop();
                    int tmp = 0;
                    switch (s.charAt(i)){
                        case '+': tmp = so1+so2; break;
                        case '-': tmp = so1-so2; break;
                        case '*': tmp = so1*so2; break;
                        case '/': tmp = so1/so2; break;
                        case '^': tmp = (int) Math.pow(so1,so2); break;
                        case '%': tmp = so1%so2; break;
                    }
                    st.push(tmp);
                }
                else st.push(Integer.parseInt(s.charAt(i)+""));
            }
            System.out.println(st.pop());
        }
    }
}
