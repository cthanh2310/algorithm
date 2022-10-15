package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Data.in"));
        long kq = 0;
        while (scanner.hasNextLine()) {
            String tmp = scanner.next();
            try{
                kq += Integer.parseInt(tmp);
            }catch (NumberFormatException e){
                continue;
            }
        }
        System.out.println(kq);
    }
}
