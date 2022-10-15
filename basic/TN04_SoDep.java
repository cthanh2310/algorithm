package practice.basic;

import java.util.Scanner;

public class TN04_SoDep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            String str = new StringBuilder(s).reverse().toString();
            if ((Integer.parseInt(s.charAt(0) + "") % 2 == 0) && s.equals(str))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
