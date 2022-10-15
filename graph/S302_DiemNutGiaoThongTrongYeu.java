package practice.graph;

import java.util.*;

public class S302_DiemNutGiaoThongTrongYeu {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt(), m= scanner.nextInt();
            for(int i=0;i<=n;i++){
                ke[i] = new ArrayList<>();
            }
            for(int i = 0;i<m;i++){
                int u = scanner.nextInt(), v= scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            int dem = 0;
            ArrayList<Integer> kq = new ArrayList<>();
            for(int i= 1;i <=n;i++){
                boolean check = false;
                Arrays.fill(chuaXet, true);
                chuaXet[i] = false;
                if(i == 1)
                    bfs(2);
                else bfs(1);
                for(int j = 1; j <=n;j++)
                    if(chuaXet[j])
                        check = true;
                if(check) {
                    kq.add(i);
                    dem++;
                }
            }
            System.out.println(dem);
            for(int x : kq)
                System.out.print(x+" ");
            System.out.println();
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
