package practice.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015_Hieu2SoNguyenLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.subtract(b));
    }
}
