package practice.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA09001_DanhSachCangSangDanhSachKe {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt(), m = scanner.nextInt();// n số đỉnh, m số cạnh
            for(int i=0;i<=1000;i++) // lưu ý đoạn này, nếu không sẽ bị lỗi IR
                ke[i] = new ArrayList<>(); // lưu lại các đỉnh kề của mỗi đỉnh
            for(int i = 0; i < m;i++){ // duyệt m cạnh
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
                ke[v].add(u); // đồ thị có hướng thì bỏ dòng này đi nhé
            }
            for(int i = 1; i<=n;i++){
                System.out.print(i+": ");
                for(int x : ke[i])
                    System.out.print(x+" ");
                System.out.println();
            }
        }
    }
}
