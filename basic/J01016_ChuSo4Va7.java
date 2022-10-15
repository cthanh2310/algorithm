package practice.basic;

import java.util.Scanner;

public class J01016_ChuSo4Va7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c = scanner.next().toCharArray();
        int sum = 0;
        for (char x : c)
            if (x == '4' || x == '7') sum++;
        if (c.length == 4 || c.length == 7)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
