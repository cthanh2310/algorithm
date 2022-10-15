package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07071_TenVietTat {
    private String tenDayDu, ho, ten;
    private String[]  tenVietTat;

    public J07071_TenVietTat(String tenDayDu) {
        this.tenDayDu = tenDayDu;
        this.tenVietTat = getTenVietTat(tenDayDu);
    }

    private String[] getTenVietTat(String tenDayDu) {
        String s[] = tenDayDu.split("\\s+");
        this.ho = tenDayDu.substring(0,tenDayDu.lastIndexOf(" "));
        this.ten = s[s.length-1];
        String str[] = new String[s.length];
        for(int i = 0;i<s.length;i++)
            str[i] = s[i].substring(0,1).toUpperCase();
        return str;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<J07071_TenVietTat> ds = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            ds.add(new J07071_TenVietTat(scanner.nextLine()));
        }
        int soLuong = Integer.parseInt(scanner.nextLine());
        while(soLuong-->0){
            ArrayList<J07071_TenVietTat> list = new ArrayList<>();
            String[] s = scanner.nextLine().split("\\.");

            for(J07071_TenVietTat x : ds){
                if(check(x.tenVietTat,s))
                    list.add(x);
            }

            Collections.sort(list, new Comparator<J07071_TenVietTat>() {
                @Override
                public int compare(J07071_TenVietTat o1, J07071_TenVietTat o2) {
                    if(o1.ten.compareTo(o2.ten) != 0)
                        return o1.ten.compareTo(o2.ten);
                    else
                        return o1.ho.compareTo(o2.ho);
                }
            });
            for(J07071_TenVietTat x : list)
                System.out.println(x.tenDayDu);
        }
    }

    private static boolean check(String[] tenVietTat, String[] s) {
        if(tenVietTat.length != s.length)
            return false;
        for(int i = 0; i < tenVietTat.length;i++){
            if(!tenVietTat[i].equalsIgnoreCase(s[i]) && !s[i].equalsIgnoreCase("*"))
                return false;
        }
        return true;
    }
}
