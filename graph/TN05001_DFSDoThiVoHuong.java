package practice.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class TN05001_DFSDoThiVoHuong {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    static String result = ""; // tránh in thừa " -> " ở cuối
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt(),m = scanner.nextInt(), s = scanner.nextInt();
            for(int i=0;i<=1000;i++){ // lưu ý đoạn này, nếu không sẽ bị lỗi IR
                chuaXet[i] = true;
                ke[i] = new ArrayList<>();
            }
            for(int i = 0;i <m;i++){
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            System.out.println("DFS("+s+") = "+dfs(s));
            result ="";
        }
    }

    private static String dfs(int s) {
        result += s+" -> "; // kiểu gì cũng bị in thừa " -> " ở cuối
        chuaXet[s] = false;
        for(int x : ke[s]){
            if(chuaXet[x]) {
                dfs(x);
            }
        }
        return result.substring(0,result.lastIndexOf("-")); // cắt bỏ " -> " ở cuối
    }
}
