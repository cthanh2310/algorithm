package practice.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TN05005_XoaDanCayKhung_DatGS {
    static List<Integer>[] dsKe = new List[100005];
    static boolean check[] = new boolean[100005];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                check[i] = true;
            }
            for (int i = 1; i < n; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            while (m-- > 0) {
                List<Integer> nodes = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    if (check[i] && dsKe[i].size() == 0)
                        check[i] = false;
                    if (check[i] && dsKe[i].size() == 1) {
                        check[i] = false;
                        nodes.add(i);
                    }
                }
                nodes.forEach(integer -> {
                    if (dsKe[integer].size() > 0) {
                        dsKe[dsKe[integer].get(0)].remove((Integer) integer);
                    }
                });

            }
            int res = 0;
            for (int i = 1; i <= n; i++) {
                if (check[i])
                    res++;
            }
            System.out.println(res);
        }
    }
}
