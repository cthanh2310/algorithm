package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05020_SapXepLopSinhVien {
    private String ma, ten, lop, email;

    public J05020_SapXepLopSinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+email;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<J05020_SapXepLopSinhVien> ds = new ArrayList<>();
        while(t-->0){
            J05020_SapXepLopSinhVien p = new J05020_SapXepLopSinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J05020_SapXepLopSinhVien>() {
            @Override
            public int compare(J05020_SapXepLopSinhVien o1, J05020_SapXepLopSinhVien o2) {
                if(o1.lop.compareTo(o2.lop) != 0){
                    return o1.lop.compareTo(o2.lop);
                }
                else
                    return o1.ma.compareTo(o2.ma);
            }
        });
        for(J05020_SapXepLopSinhVien x : ds)
            System.out.println(x.toString());
    }
}
