package practice.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA09002_DanhSachKeSangDanhSachCanh {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean visited[][] = new boolean[1001][1001]; // mặc định sẽ là false nên tận dụng luôn
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1;i <=n;i++){ // duyệt n đỉnh theo yêu cầu đề bài thôi
            ke[i] = new ArrayList<>();
            String s[] = scanner.nextLine().split("\\s+");
            for(int t =0; t < s.length;t++) {
                int u = Integer.parseInt(s[t]);
                ke[i].add(u); // lưu lại các đỉnh kề vào trong danh sách kề
                if(visited[i][u] == false){ // nếu đỉnh này chưa được duyệt
                    System.out.println(i+" "+u);
                    visited[i][u] = visited[u][i] = true; // vì khi duyệt danh sách cạnh thì chỉ xét cặp (i,u) chứ không duyệt lại cặp (u,i)
                }
            }
        }

    }
}
