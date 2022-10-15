package practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DSA09010_KiemTraTinhLienThongManh {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt(), m= scanner.nextInt();
            for(int i=0;i<=1000;i++){
                ke[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for(int i = 0;i<m;i++){
                int u = scanner.nextInt(), v= scanner.nextInt();
                ke[u].add(v);
            }
            int dem = 0;
            for(int i= 1;i <=n;i++){
                if(chuaXet[i]){
                    dem++;
                    bfs(i);
                }
            }
            if(dem == 1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s); chuaXet[s] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            for(int x : ke[v]){
                if(chuaXet[x]){
                    chuaXet[x] = false;
                    q.add(x);
                }
            }
        }
    }
}
