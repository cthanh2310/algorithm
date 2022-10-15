package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J05052_TraCuuDonHang {
    private String ten, ma, stt;
    private int donGia, soLuong, giamGia, thanhTien;

    public J05052_TraCuuDonHang(String ten, String ma, int donGia, int soLuong) {
        this.ten = ten;
        this.ma = ma;
        this.stt = ma.substring(1,4);
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.giamGia = getGiamGia();
        this.thanhTien = donGia*soLuong - giamGia;
    }

    private int getGiamGia() {
        if(ma.charAt(4) == '1') {
            return (int) (0.5 * donGia * soLuong);
        }
        return (int) (0.3 * donGia * soLuong);
    }

    @Override
    public String toString() {
        return ten+" "+ma+" "+stt+" "+giamGia+" "+thanhTien;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05052_TraCuuDonHang> ds = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            J05052_TraCuuDonHang p = new J05052_TraCuuDonHang(scanner.nextLine(), scanner.nextLine(),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
            ds.add(p);
        }
        for(J05052_TraCuuDonHang x : ds)
            System.out.println(x.toString());
    }
}
