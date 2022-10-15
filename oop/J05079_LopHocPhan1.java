package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05079_LopHocPhan1 {
    private String ma, ten, nhom, giangVien;

    public J05079_LopHocPhan1(String ma, String ten, String nhom, String giangVien) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giangVien = giangVien;
    }

    @Override
    public String toString() {
        return nhom+" "+giangVien;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05079_LopHocPhan1> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while(n-->0){
            ds.add(new J05079_LopHocPhan1(scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        int m = Integer.parseInt(scanner.nextLine());
        while(m-->0){
            String ma = scanner.nextLine();
            for(J05079_LopHocPhan1 x : ds){
                if(x.ma.contains(ma)){
                    System.out.println("Danh sach nhom lop mon "+x.ten+":");
                    break;
                }
            }
            ArrayList<J05079_LopHocPhan1> list  = new ArrayList<>();
            for(J05079_LopHocPhan1 x : ds){
                if(x.ma.contains(ma)){
                    list.add(x);
                }
            }
            Collections.sort(list, new Comparator<J05079_LopHocPhan1>() {
                @Override
                public int compare(J05079_LopHocPhan1 o1, J05079_LopHocPhan1 o2) {
                    return o1.nhom.compareTo(o2.nhom);
                }
            });
            for(J05079_LopHocPhan1 x : list)
                System.out.println(x.toString());
        }
    }
}
