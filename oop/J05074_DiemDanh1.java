package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J05074_DiemDanh1 {
    private String ma, ten,lop;
    private int diemChuyenCan = 10;

    public J05074_DiemDanh1(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    private void diemDanh(String s){
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == 'm')
                diemChuyenCan -=1;
            else if(s.charAt(i) == 'v')
                diemChuyenCan -=2;
        }
        if(diemChuyenCan < 0) diemChuyenCan = 0;
    }
    @Override
    public String toString() {
        String dcc = (diemChuyenCan > 0) ? diemChuyenCan+"" : diemChuyenCan+" KDDK";
        return ma+" "+ten+" "+lop+" "+ dcc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<J05074_DiemDanh1> ds = new ArrayList<>();
        for(int i = 1;i<=t;i++){
            ds.add(new J05074_DiemDanh1(scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        for(int i = 1; i <=t;i++){
            String[] s = scanner.nextLine().split("\\s+");
            for(J05074_DiemDanh1 x : ds){
                if(x.ma.equals(s[0])) {
                    x.diemDanh(s[1]);
                    break;
                }
            }
        }
        for(J05074_DiemDanh1 x : ds)
            System.out.println(x.toString());
    }
}
