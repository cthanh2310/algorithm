package practice.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA09004_DFSDoThiVoHuong {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt(), m= scanner.nextInt(), s = scanner.nextInt();
            for(int i = 1; i <=1001;i++){// lưu ý đoạn này, nếu không sẽ bị lỗi IR
                chuaXet[i] = true;
                ke[i] = new ArrayList<>();
            }
            for(int i = 0; i < m;i++){
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            dfs(s);
            System.out.println();
        }
    }

    private static void dfs(int s) {
        System.out.print(s+" "); // cứ mỗi lần gọi đệ quy dfs thì in đỉnh đó thôi
        chuaXet[s] = false; // tránh in lại các đỉnh đã duyệt
        for(int x : ke[s]){
            if(chuaXet[x]) // nếu đỉnh chưa được duyệt thì gọi đệ quy dfs
                dfs(x);
        }
    }
}
