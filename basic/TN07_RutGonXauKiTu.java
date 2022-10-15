package practice.basic;

import java.util.Scanner;
import java.util.Stack;

public class TN07_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c = scanner.nextLine().toCharArray();
        Stack<Character> st = new Stack<>();
        for(char x : c){
            if(st.size() == 0)
                st.push(x);
            else if (st.peek() == x)
                st.pop();
            else st.push(x);
        }
        if(st.size() != 0){
            for(char x : st) System.out.print(x);
        }
        else System.out.println("Empty String");

    }
}
