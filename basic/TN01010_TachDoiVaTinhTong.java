package practice.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class TN01010_TachDoiVaTinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (s.length() > 1) {
            BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger b  = new BigInteger(s.substring(s.length() / 2));
            BigInteger c = a.add(b);
            s = c.toString();
            System.out.println(s);
        }
    }
}
