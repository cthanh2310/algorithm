package practice.basic;

import java.util.Scanner;

public class TN08_XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t  = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            char c[] = scanner.nextLine().toCharArray();
            int i = c.length-1;
            while(i>=0 && c[i] == '1'){
                c[i] ='0';
                i--;
            }
            if(i >= 0)  c[i] = '1';
            System.out.println(String.valueOf(c));
        }
    }
}
