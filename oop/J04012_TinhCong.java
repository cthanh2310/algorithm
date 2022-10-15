package practice.oop;

import java.util.Scanner;

public class J04012_TinhCong {
    private String ma ="NV01",ten;
    private int luongCB,soNgay, phuCap, luongThang, thuong,thuNhap;
    private String chucVu;

    public J04012_TinhCong(String ten, int luongCB, int soNgay, String chucVu) {
        this.ten = ten;
        this.luongCB = luongCB;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
        this.luongThang = soNgay*luongCB;
        this.phuCap = getPhuCap();
        this.thuong = getThuong();
        this.thuNhap = luongThang+phuCap+thuong;
    }

    private int getThuong() {
        if(soNgay >= 25)
            return (int) (0.2*luongThang);
        if(soNgay >= 22 && soNgay < 25)
            return (int) (0.1*luongThang);
        return 0;
    }

    public int getPhuCap() {
        if(chucVu.equals("GD"))
            return 250000;
        if(chucVu.equals("PGD"))
            return 200000 ;
        if(chucVu.equals("TP"))
            return 180000 ;
        if(chucVu.equals("NV"))
            return 150000 ;
        return 0;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+luongThang+" "+thuong+" "+phuCap+" "+thuNhap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        J04012_TinhCong p = new J04012_TinhCong(scanner.nextLine(),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),scanner.nextLine());
        System.out.println(p.toString());
    }
}
