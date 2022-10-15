package practice.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA10006_CayKhungDoThi_DFS {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    static ArrayList<Pair> st = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            st.clear();
            int n = scanner.nextInt(), m = scanner.nextInt(), s = scanner.nextInt();
            for (int i = 0; i < 1001; i++) { // Thiếu cái này sẽ bị lỗi IR
                ke[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            dfs(s);
            if(st.size() != n-1)
                System.out.println(-1);
            else{
                for(int i= 0; i <st.size();i++)
                    System.out.println(st.get(i).getSecond()+" "+st.get(i).getFirst());
            }
        }
    }

    public static void dfs(int s) {
        chuaXet[s] = false;
        for (int x : ke[s])
            if (chuaXet[x]) {
                st.add(new Pair(x,s));
                dfs(x);
            }
    }

    public static class Pair{
        private int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
