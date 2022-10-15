package practice.basic;

import java.util.Scanner;

public class TN27_NhamChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.next().toCharArray();
        char[] b = scanner.next().toCharArray();
        int tongMin = 0, tongMax = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == '6') a[i] = '5';
        for (int i = 0; i < b.length; i++)
            if (b[i] == '6') b[i] = '5';
        tongMin = Integer.valueOf(String.valueOf(a)) + Integer.valueOf(String.valueOf(b));
        for (int i = 0; i < a.length; i++)
            if (a[i] == '5') a[i] = '6';
        for (int i = 0; i < b.length; i++)
            if (b[i] == '5') b[i] = '6';
        tongMax = Integer.valueOf(String.valueOf(a)) + Integer.valueOf(String.valueOf(b));
        System.out.println(tongMin + " " + tongMax);
    }
}
