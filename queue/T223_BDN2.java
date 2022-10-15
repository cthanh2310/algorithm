package practice.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T223_BDN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            Long s = scanner.nextLong();
            Queue<Long> q = new LinkedList<>();
            q.add(1l);
            while(true){
                Long x = q.poll();
                if(x %s ==0){
                    System.out.println(x);
                    break;
                }
                q.add(x*10);
                q.add(x*10+1);
            }
        }
    }
}
