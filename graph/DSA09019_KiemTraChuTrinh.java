package practice.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DSA09019_KiemTraChuTrinh {
    /* Ví dụ về duyệt tìm chu trình bằng DFS
    DFS(1) = 1 4 2 3, tiếp theo khi duyệt đến các đỉnh kề của 3 gồm 2 đỉnh là 2 và 4 thì cả 2 đều đã
   được duyệt. Tuy nhiên đỉnh trước 3 trong DFS(1) là 2 thì đỉnh 2 và 3 không thể tạo thành 1 chu trình
   (như kiểu vòng tròn khép kín được). Còn lại là đỉnh 4, đỉnh 4 khác 2 (2 là đỉnh trước 3 trong DFS(1))
   nên ta sẽ có 1 chu trình là 4 2 3 4
   --> Như vậy thì trong lời gọi DFS thì chỉ khai báo thêm biến t là đỉnh trước s trong DFS, và khi duyệt
   đến đỉnh kề của s là x thì chỉ cần kiểm tra xem (x != t) không, nếu đúng thì ta được 1 chu trình

   private static void dfs(int s, int t) { // t là đỉnh trước s trong khi duyệt
        chuaXet[s] = false;
        for(int x : ke[s]){
            if(chuaXet[x])
                dfs(x,s); // lưu lại đỉnh s là đỉnh trước x trong khi duyệt
            else if(x != t)
                check = true; // tạo thành 1 chu trình
        }
    }

    Ban đầu khởi tạo thì phải chọn đỉnh t không nằm trong đồ thị --> t == 0
    */
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    static boolean check;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt(), m= scanner.nextInt();
            for(int i = 0; i <=n;i++)
                ke[i] = new ArrayList<>();
            for(int i = 0; i < m;i++){
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            Arrays.fill(chuaXet,0,n+5,true);
            check = false;
            for(int i =1 ;i<=n;i++){
                if(chuaXet[i])
                    dfs(i,0);
            }
            if(check)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void dfs(int s, int t) {
        chuaXet[s] = false;
        for(int x : ke[s]){
            if(chuaXet[x])
                dfs(x,s);
            else if(x != t)
                check = true;
        }
    }
}
