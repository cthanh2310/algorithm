package practice.basic;

import java.util.Scanner;

public class TN05_ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            String[] s = scanner.nextLine().trim().toLowerCase().split("\\s+");
            String result = "";
            for(int i = 0;i<s.length;i++){
                result += s[i].substring(0,1).toUpperCase() + s[i].substring(1) +" ";
            }
            System.out.println(result.trim());
        }
    }
}
