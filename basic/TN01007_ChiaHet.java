package practice.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class TN01007_ChiaHet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            BigInteger c = new BigInteger("0");
            if (a.mod(b).compareTo(c) == 0 || b.mod(a).compareTo(c) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
