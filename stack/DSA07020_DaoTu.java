package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class DSA07020_DaoTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String[] s = scanner.nextLine().split("\\s+");
            Stack<Character> st = new Stack<>();
            for(String x : s){
                for(int i = 0 ;i <x.length();i++)
                    st.push(x.charAt(i));
                while(!st.empty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
