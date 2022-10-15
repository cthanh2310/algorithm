package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05021_SapXepMaSinhVien {
    private String ma, ten, lop, email;

    public J05021_SapXepMaSinhVien(String ma, String ten, String lop, String email) {
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
        ArrayList<J05021_SapXepMaSinhVien> ds = new ArrayList<>();
        while (scanner.hasNextLine()) {
            ds.add(new J05021_SapXepMaSinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(ds, new Comparator<J05021_SapXepMaSinhVien>() {
            @Override
            public int compare(J05021_SapXepMaSinhVien o1, J05021_SapXepMaSinhVien o2) {
                return o1.ma.compareTo(o2.ma);
            }
        });
        for (J05021_SapXepMaSinhVien x : ds)
            System.out.println(x.toString());
    }
}
