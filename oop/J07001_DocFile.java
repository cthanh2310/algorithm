package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DocFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
