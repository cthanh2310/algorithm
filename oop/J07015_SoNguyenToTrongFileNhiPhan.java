package practice.oop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class J07015_SoNguyenToTrongFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer i : list){
            if(isPrime(i)){
                if(map.containsKey(i)){
                    int tanSuat = map.get(i);
                    tanSuat++;
                    map.put(i,tanSuat);
                }
                else map.put(i,1);
            }
        }
        Iterator i = map.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key +" "+map.get(key));
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
