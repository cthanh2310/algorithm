package practice.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DSA09006_DuongDiDFSVoHuong {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    static int truoc[] = new int[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), m = scanner.nextInt(), s = scanner.nextInt(), e = scanner.nextInt();
            for(int i=0;i<=1000;i++){ // lưu ý đoạn này, nếu không sẽ bị lỗi IR
                ke[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            dfs(s);
            if (chuaXet[e]) {
                System.out.println(-1);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                int x = e;
                while (x != s) {
                    list.add(x);
                    x = truoc[x];
                }
                list.add(s);
                Collections.reverse(list);
                for (int k : list)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }

    private static void dfs(int s) {
        chuaXet[s] = false;
        for (int x : ke[s]) {
            if (chuaXet[x]) {
                truoc[x] = s;
                dfs(x);
            }
        }
    }
}
