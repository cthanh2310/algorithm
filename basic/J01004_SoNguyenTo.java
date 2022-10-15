package practice.basic;

import java.util.Scanner;

public class J01004_SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
