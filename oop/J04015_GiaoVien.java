package practice.oop;

import java.util.Scanner;

public class J04015_GiaoVien {
    private String ma, ten;
    private int luongCb, heSo, thuNhap;
    private String chucVu;

    public J04015_GiaoVien(String ma, String ten, int luongCb) {
        this.ma = ma;
        this.ten = ten;
        this.luongCb = luongCb;
        this.chucVu = ma.substring(0, 2);
        this.heSo = Integer.parseInt(ma.substring(2));
        this.thuNhap = luongCb*heSo+getPhuCap();

    }

    public int getPhuCap() {
        if (this.chucVu.equals("HT"))
            return 2000000;
        else if (this.chucVu.equals("HP"))
            return 900000;
        else if (this.chucVu.equals("GV"))
            return 500000;
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " +heSo+" "+getPhuCap()+" "+thuNhap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        J04015_GiaoVien p = new J04015_GiaoVien(scanner.nextLine(), scanner.nextLine(),Integer.parseInt(scanner.nextLine()));
        System.out.println(p.toString());
    }
}
