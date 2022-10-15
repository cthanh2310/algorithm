package practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class DSA07021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String s = scanner.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);// them phan tu co so vao stack de tranh st rong khi gap s[0] = ')' lan dau tien. vd: )()())
            // phai chay debug moi hieu duoc code
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    st.push(i);
                else {
                    st.pop();
                    if (!st.empty())// moi khi pop ra khoi stack thi phai kiem tra luon xem stack co empty khong
                        res = Math.max(res, i - st.peek());
                    else st.push(i); // bo sung ngay lap tuc
                }
            }
            System.out.println(res);
        }
    }
}

