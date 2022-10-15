package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class T213_SuaLaiDauNgoac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String s = scanner.nextLine();
            Stack<Character> st = new Stack<>();
            // B1: Loai bo het cac dau ngoac dung: Y tuong giong bai DSA07110_KiemTraDayNgoac
            for(int i = 0; i < s.length();i++){
                if(st.empty()) // Bo sung ngay lap tuc
                    st.push(s.charAt(i));
                else if(s.charAt(i) == ')' && st.peek() == '(')
                    st.pop();
                else st.push(s.charAt(i));
            }
            // B2: Dem so lan doi dau de tro thanh dau ngoac dung
            // Vd: ) ) ) --> ( ) ( --> soLan = 3/2 + 3%2 = 2
            int a = 0, b = 0;
            while(!st.empty()){
                if(st.pop() == '(')
                    a++;
                else b++;
            }
            int soLan = a/2 + a%2 + b/2 + b%2;
            System.out.println(soLan);
        }
    }
}
