package practice.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006_HopHaiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        TreeSet<Integer> t = new TreeSet<>();
        for (int i = 0; i < n + m; i++)
            t.add(scanner.nextInt());
        for(int x : t)
            System.out.print(x+" ");
    }
}
