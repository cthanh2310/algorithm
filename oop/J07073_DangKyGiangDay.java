package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07073_DangKyGiangDay {
    private String ma,ten,lyThuyet, thucHanh;
    private int sotc;

    public J07073_DangKyGiangDay(String ma, String ten,int sotc,String lyThuyet, String thucHanh) {
        this.ma = ma;
        this.ten = ten;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.sotc = sotc;
    }

    public String getThucHanh() {
        return thucHanh;
    }

    public void setThucHanh(String thucHanh) {
        this.thucHanh = thucHanh;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+sotc+" "+lyThuyet+" "+thucHanh;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J07073_DangKyGiangDay> ds = new ArrayList<>();
        for(int i = 0; i<n;i++){
            J07073_DangKyGiangDay p = new J07073_DangKyGiangDay(scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine()),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J07073_DangKyGiangDay>() {
            @Override
            public int compare(J07073_DangKyGiangDay o1, J07073_DangKyGiangDay o2) {
                return o1.ma.compareTo(o2.ma);
            }
        });
        for(J07073_DangKyGiangDay x : ds){
            if(x.thucHanh.equals("Truc tuyen") || x.thucHanh.contains(".ptit.edu.vn"))
                System.out.println(x.toString());
        }
    }
}
