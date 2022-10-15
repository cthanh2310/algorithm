package practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DSA09005_BFSDoThiVoHuong {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt(), m = scanner.nextInt(), s = scanner.nextInt();
            for(int i=0;i<=1000;i++){ // lưu ý đoạn này, nếu không sẽ bị lỗi IR
                ke[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for(int i = 0; i < m;i++){
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            bfs(s);
            System.out.println();
        }
    }

    private static void bfs(int start) {// bfs bản chất là dùng queue, khác với dfs đệ quy
        Queue<Integer> q = new LinkedList<>();
        q.add(start); chuaXet[start] = false; // thêm đỉnh xuất phát là start vào trong queue và đánh dấu là đỉnh đã được duyệt
        // Bản chất BFS: Hiểu đơn giản thì muốn đẩy các đỉnh kề của v vào trong queue thì TRƯỚC HẾT phải in ra v và đẩy v ra khỏi queue đã
        while(!q.isEmpty()){
            int v = q.poll(); // (4) đẩy đỉnh v ra khỏi queue và in ra luôn
            System.out.print(v+" ");
            for(int x : ke[v]){ // (1) duyệt các đỉnh kề của v
                if(chuaXet[x]) {
                    q.add(x); // (2) Muốn đẩy các đỉnh kề của v vào trong queue
                    chuaXet[x] = false; // (3) đánh dấu là đã được đẩy vào queue
                }
            }
        }
    }
}
