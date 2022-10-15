package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        while (scanner.hasNext()) {
            int key = scanner.nextInt();
            if(map.containsKey(key)){
                int tanSuat = map.get(key);
                tanSuat++;
                map.put(key,tanSuat);
            }
            else map.put(key,1);
        }
        Iterator i = map.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key +" "+map.get(key));
        }
    }
}
