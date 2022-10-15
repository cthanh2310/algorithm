package practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class TN09_HoanViKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int a[] = new int[n+5];
            for(int i =1; i <= n;i++)
                a[i] = scanner.nextInt();
            int i = n-1, check = 0;
            while(a[i] < a[i-1])  i--; // tìm ra vị trí đầu tiên mà a[i] > a[i-1]
            if(i == 0){
                for(int j = 1; j <=n;j++)
                    System.out.print(j+" ");
            }
            else{
                int k = n;
                while(a[k] < a[i]) k--;
                swap(a[k],a[i]);
                Arrays.sort(a,i+1,n+1);
                for(int v = 1; v <=n;v++)
                    System.out.print(a[v]+" ");
            }
        }
    }

    private static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
}
