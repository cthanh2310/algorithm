package practice.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            System.out.println(a.gcd(b));
        }
    }
}
