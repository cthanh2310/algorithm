package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J04022_WordSet {
    public static class WordSet {
        TreeSet<String> t;
        WordSet(String str){
            t = new TreeSet<>();
            String s[] = str.toLowerCase().split("\\s+");
            for(String x : s)
                t.add(x);
        }

        public TreeSet<String> getT() {
            return t;
        }

        public void setT(TreeSet<String> t) {
            this.t = t;
        }

        public String union(WordSet s2) {
            String result = "";
            TreeSet<String> t1 = new TreeSet<>();
            t1.addAll(this.getT());
            TreeSet<String> t2 = s2.getT();
            t1.addAll(t2);
            for(String x : t1)
                result += x+" ";
            return result;
        }

        public String intersection(WordSet s2) {
            String result = "";
            TreeSet<String> t1 = new TreeSet<>();
            t1.addAll(this.getT());
            TreeSet<String> t2 = s2.getT();
            t1.retainAll(t2);
            for(String x : t1)
                result += x+" ";
            return result;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

