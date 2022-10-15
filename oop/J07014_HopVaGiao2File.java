package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07014_HopVaGiao2File {
    public static class WordSet{
        TreeSet<String> t;
        public WordSet(String s) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(s));
            t = new TreeSet<>();
            while (scanner.hasNextLine()){
                String str[] = scanner.nextLine().toLowerCase().split("\\s+");
                for(String x : str)
                    t.add(x);
            }
        }

        public TreeSet<String> getT() {
            return t;
        }

        public void setT(TreeSet<String> t) {
            this.t = t;
        }

        public String union(WordSet s2) {
            String rs = "";
            TreeSet<String> tree = new TreeSet<>();
            tree.addAll(this.getT());
            tree.addAll(s2.getT());
            for(String x : tree)
                rs+= x+" ";
            return rs;
        }

        public String intersection(WordSet s2) {
            String rs = "";
            TreeSet<String> tree = new TreeSet<>();
            tree.addAll(this.getT());
            tree.retainAll(s2.getT());
            for(String x : tree)
                rs+= x+" ";
            return rs;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

