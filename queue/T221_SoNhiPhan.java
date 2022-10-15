package practice.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T221_SoNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            int n = Integer.parseInt(scanner.nextLine());
            Queue<String> q = new LinkedList<>();
            q.add("1");
            while(n-->0){
                String tmp = q.poll();
                System.out.print(tmp+" ");
                q.add(tmp+"0");
                q.add(tmp+"1");
            }
            System.out.println();
        }
    }
}
