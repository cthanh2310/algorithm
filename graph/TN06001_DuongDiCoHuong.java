package practice.graph;

import java.util.*;

public class TN06001_DuongDiCoHuong {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    static int truoc[] = new int[1001]; // bổ sung thêm mảng truoc[] để truy vết đường đi từ s đến e
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
            }
            bfs(s);
            if(chuaXet[e]) // Nếu đỉnh cuối cùng là e chưa được duyệt
                System.out.println(-1); // In ra -1 theo yêu cầu đề bài
            else{
                ArrayList<Integer> list = new ArrayList<>();
                int x = e;
                while(x != s){
                    list.add(x);
                    x = truoc[x]; // truy vết đường đi từ e tới s
                }
                list.add(s);// list này sẽ lưu đường đi ngược lại từ e tới s
                Collections.reverse(list); // đảo ngược để in ra đường đi từ s tới e
                String result = "";
                for(int k : list)
                    result += k +" -> "; // kiểu gì cũng bị in thừa " -> " ở cuối
                System.out.println(result.substring(0,result.lastIndexOf("-")));// cắt bỏ " -> " ở cuối
            }
        }
    }

    private static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        chuaXet[s] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int x : ke[v]) {
                if (chuaXet[x]) {
                    q.add(x);
                    chuaXet[x] = false;
                    truoc[x] = v;
                }
            }
        }
    }
}
