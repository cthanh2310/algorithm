package practice.queue;

import java.util.*;

public class S213_SoLocPhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            int n = Integer.parseInt(scanner.nextLine());
            Queue<String> q = new LinkedList<>();
            ArrayList<String> list= new ArrayList<>();
            q.add("6");
            q.add("8");
            while(true){
                String tmp = q.poll();
                if(tmp.length() > n)
                    break;
                list.add(tmp);
                q.add(tmp+"6");
                q.add(tmp+"8");
            }
            Collections.reverse(list);
            System.out.println(list.size());
            for(String x : list)
                System.out.print(x +" ");
            System.out.println();
        }
    }
}
