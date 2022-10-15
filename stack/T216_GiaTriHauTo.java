package practice.stack;

import java.util.Scanner;
import java.util.Stack;

/*
2 3 1 * + 9 – = 2 + 3*1 - 9 = -4
8 7 5 * + 9 - = 8 + 7*5 - 9 = 34
*/
public class T216_GiaTriHauTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s = scanner.nextLine();
            Stack<Integer> st = new Stack<>();
            for(int i = 0 ;i<s.length();i++){
                if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%' || s.charAt(i) == '^'){
                    int so1 = st.pop(), so2 = st.pop();
                    int tmp =0;
                    switch (s.charAt(i)){
                        case '+': tmp = so2+so1; break;
                        case '-': tmp = so2-so1; break;
                        case '*': tmp = so2*so1; break;
                        case '/': tmp = so2/so1; break;
                        case '^': tmp = (int) Math.pow(so2,so1); break;
                        case '%': tmp = so2%so1; break;
                    }
                    st.push(tmp);
                }
                else st.push(Integer.parseInt(s.charAt(i)+""));
            }
            System.out.println(st.peek());
        }
    }
}
