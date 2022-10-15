package practice.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S308_MangXaHoiHoanHao {
    static ArrayList<Integer> dske[] = new ArrayList[100001];
    static boolean chuaxet[] = new boolean[100001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                dske[i].add(i);
            }
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                Collections.sort(dske[i]);
            }
            System.out.println(check(n));
        }
    }

    private static String check(int n) {
        for (int i = 1; i <= n; i++) {
            if (dske[i].size() == 1) continue;
            for (int x : dske[i]) {
                if (dske[x].equals(dske[i]) == false) return "NO";
            }
        }
        return "YES";
    }
}
