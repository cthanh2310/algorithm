package practice.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TN03_TongCacChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            char[] c = scanner.next().toCharArray();
            Arrays.sort(c);
            int tong = 0;
            for(int i = 0; i<c.length;i++){
                if(Character.isDigit(c[i]))
                    tong += c[i]-'0';
                else System.out.print(c[i]);
            }
            System.out.print(tong);
            System.out.println("");
        }
    }
}
