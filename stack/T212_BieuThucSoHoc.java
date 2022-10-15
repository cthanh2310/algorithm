package practice.stack;

import java.util.Scanner;
import java.util.Stack;


/*
    a + b la khong thua
    (a + b) la khong thua
    --> So sanh so luong cua toan tu va dau ngoac ')' la ok
    Ngoai le: () la khong thua, (a) la thua

*/
public class T212_BieuThucSoHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String s = scanner.nextLine();
            if(check(s))
                System.out.println("Yes");
            else System.out.println("No");
        }
    }

    private static boolean check(String s) {
        Stack<Integer> st = new Stack<>();
        int toanTu = 0, dauNgoac = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')')
                return false;
            if(s.charAt(i) == '(' && s.charAt(i+2) == ')')
                return true;
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
                toanTu++;
            if(s.charAt(i) == ')')
                dauNgoac++;
        }
        if(dauNgoac > toanTu) return true;
        return false;
    }
}