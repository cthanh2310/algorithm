package practice.oop;

import java.util.Scanner;
import java.util.TreeSet;

public class TN02015_WordSet {
    public static class WordSet{
        TreeSet<String> t = new TreeSet<>();
        public WordSet(Scanner scanner)  {
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

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        WordSet ws = new WordSet(input);
        System.out.println(ws);
    }
}



