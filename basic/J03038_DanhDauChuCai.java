package practice.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c = scanner.next().toCharArray();
        TreeSet<Character> t = new TreeSet<>();
        for (char x : c) t.add(x);
        System.out.println(t.size());

    }
}
