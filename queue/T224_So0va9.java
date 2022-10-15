package practice.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T224_So0va9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            Queue<Long> q = new LinkedList<>();
            q.add(9l);
            while (true) {
                Long x = q.poll();
                if (x % n == 0) {
                    System.out.println(x + " ");
                    break;
                }
                q.add(x*10);
                q.add(x*10+9);
            }
        }
    }
}

