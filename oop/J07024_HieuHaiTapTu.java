package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07024_HieuHaiTapTu {

    public static class WordSet{
        TreeSet<String> t = new TreeSet<>();
        public WordSet(String file) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()){
                String[] s = scanner.nextLine().toLowerCase().split("\\s+");
                for(String x : s)
                    t.add(x);
            }
        }

        public TreeSet<String> getT() {
            return t;
        }

        public void setT(TreeSet<String> t) {
            this.t = t;
        }

        public String difference(WordSet s2) {
            String rs = "";
            TreeSet<String> tree = new TreeSet<>();
            tree.addAll(this.getT());
            tree.removeAll(s2.getT());
            for(String x : tree)
                rs += x +" ";
            return rs;
        }
    }

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
