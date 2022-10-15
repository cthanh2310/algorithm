package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05009_ThuKhoa {
    private String ma, ten;
    private String ngaySinh;
    private float diem1, diem2, diem3,tongDiem;


    public J05009_ThuKhoa(String ma, String ten, String ngaySinh, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = diem1+diem2+diem3;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+ngaySinh+" "+tongDiem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<J05009_ThuKhoa> ds = new ArrayList<>();
        for(int i = 1;i<=t;i++){
            J05009_ThuKhoa p = new J05009_ThuKhoa(i+"", scanner.nextLine(), scanner.nextLine(), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J05009_ThuKhoa>() {
            @Override
            public int compare(J05009_ThuKhoa o1, J05009_ThuKhoa o2) {
                if(o1.tongDiem != o2.tongDiem){
                    return Float.compare(o2.tongDiem,o1.tongDiem);
                }
                else
                    return o1.ma.compareTo(o2.ma);
            }
        });
        float diemMax = ds.get(0).tongDiem;
        for(J05009_ThuKhoa x : ds){
            if(x.tongDiem == diemMax)
                System.out.println(x.toString());
        }
    }
}
