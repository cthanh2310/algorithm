package practice.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class JP007_LocEmailTrung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> t = new TreeSet<>();
        while (scanner.hasNextLine()) {
            t.add(scanner.nextLine().toLowerCase());
        }
        for (String x : t)
            System.out.println(x);
    }
}
