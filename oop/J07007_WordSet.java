package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007_WordSet {
    public static class WordSet{
        TreeSet<String> t = new TreeSet<>();
        public WordSet(String s) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(s));
            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().toLowerCase().split("\\s+");
                for(String x : str)
                    t.add(x);
            }
        }

        @Override
        public String toString() {
            String rs = "";
            for(String x : t)
                rs += x +"\n";
            return rs;
        }
    }

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}