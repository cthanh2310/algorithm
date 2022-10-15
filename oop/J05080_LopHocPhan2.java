package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05080_LopHocPhan2 {
    private String ma, ten, nhom, giangVien;

    public J05080_LopHocPhan2(String ma, String ten, String nhom, String giangVien) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giangVien = giangVien;
    }

    @Override
    public String toString() {
        return ma + " " + ten+" "+nhom;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05080_LopHocPhan2> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            ds.add(new J05080_LopHocPhan2(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        int m = Integer.parseInt(scanner.nextLine());
        while (m-- > 0) {
            String giangVien = scanner.nextLine();
            System.out.println("Danh sach cho giang vien " + giangVien + ":");
            ArrayList<J05080_LopHocPhan2> list = new ArrayList<>();
            for (J05080_LopHocPhan2 x : ds) {
                if (x.giangVien.contains(giangVien)) {
                    list.add(x);
                }
            }
            Collections.sort(list, new Comparator<J05080_LopHocPhan2>() {
                @Override
                public int compare(J05080_LopHocPhan2 o1, J05080_LopHocPhan2 o2) {
                    if(!o1.ma.equals(o2.ma))
                        return o1.ma.compareTo(o2.ma);
                    else{
                        return o1.nhom.compareTo(o2.nhom);
                    }
                }
            });
            for (J05080_LopHocPhan2 x : list)
                System.out.println(x.toString());
        }
    }
}
