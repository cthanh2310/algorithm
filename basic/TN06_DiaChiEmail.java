package practice.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TN06_DiaChiEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        HashMap<String, Integer> map = new HashMap();
        while(t-->0){
            String[] s = scanner.nextLine().trim().toLowerCase().split("\\s+");
            String result = s[s.length-1];
            for(int i =0;i<s.length-1;i++){
                result += s[i].substring(0,1);
            }
            if(map.containsKey(result)){
                int tanSo = map.get(result);
                tanSo++;
                map.put(result,tanSo);
            }
            else map.put(result,1);
            if(map.get(result) == 1)
                System.out.println(result+"@ptit.edu.vn");
            else System.out.println(result+map.get(result)+"@ptit.edu.vn");
        }
    }
}
