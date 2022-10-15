package practice.graph;

import java.util.*;

public class DSA09018_LietKeDinhTru {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt(), m = scanner.nextInt();
            for (int i = 0; i <= n; i++)
                ke[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            for (int u = 1; u <= n; u++) {
                Arrays.fill(chuaXet,0,n+5,true);// thừa tý không sao
                int dem = 1;
                chuaXet[u] = false;
                if(u == 1)
                    bfs(2);
                else bfs(1);
                for(int i = 1; i <=n;i++){
                    if(chuaXet[i]) {
                        dem++;
                        bfs(i);
                    }
                }
                if(dem > 1)
                    System.out.print(u+" ");
            }
            System.out.println();
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        chuaXet[start] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int x : ke[v]) {
                if (chuaXet[x]) {
                    q.add(x);
                    chuaXet[x] = false;
                }
            }
        }
    }
}
