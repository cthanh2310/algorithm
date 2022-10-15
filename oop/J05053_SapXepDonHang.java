package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05053_SapXepDonHang {
    private String ten, ma, stt;
    private int donGia, soLuong, giamGia, thanhTien;

    public J05053_SapXepDonHang(String ten, String ma, int donGia, int soLuong) {
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
        ArrayList<J05053_SapXepDonHang> ds = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            J05053_SapXepDonHang p = new J05053_SapXepDonHang(scanner.nextLine(), scanner.nextLine(),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J05053_SapXepDonHang>() {
            @Override
            public int compare(J05053_SapXepDonHang o1, J05053_SapXepDonHang o2) {
                return Integer.parseInt(o1.stt) - Integer.parseInt(o2.stt);
            }
        });
        for(J05053_SapXepDonHang x : ds)
            System.out.println(x.toString());
    }
}
