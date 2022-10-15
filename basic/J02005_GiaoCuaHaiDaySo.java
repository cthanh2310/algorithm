package practice.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        TreeSet<Integer> t1 = new TreeSet<>();
        TreeSet<Integer> t2 = new TreeSet<>();
        for (int i = 0; i < n; i++)
            t1.add(scanner.nextInt());
        for (int i = 0; i < m; i++)
            t2.add(scanner.nextInt());
        t1.retainAll(t2);
        for (int x : t1)
            System.out.print(x + " ");
    }
}
