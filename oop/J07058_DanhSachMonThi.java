package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07058_DanhSachMonThi {
    private String ma, ten, hinhThuc;

    public J07058_DanhSachMonThi(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+hinhThuc;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        ArrayList<J07058_DanhSachMonThi> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++){
            J07058_DanhSachMonThi p = new J07058_DanhSachMonThi(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J07058_DanhSachMonThi>() {
            @Override
            public int compare(J07058_DanhSachMonThi o1, J07058_DanhSachMonThi o2) {
                return o1.ma.compareTo(o2.ma);
            }
        });
        for(J07058_DanhSachMonThi x : ds)
            System.out.println(x);
    }
}
