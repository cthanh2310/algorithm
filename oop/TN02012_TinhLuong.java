package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class TN02012_TinhLuong {
    public static class NhanVien{
        private String ma, ten, maPhong;
        private long tongLuong;
        private PhongBan pb;

        public NhanVien(String ma, String ten, long luongcb, long soNgay) {
            this.ma = ma;
            int soNam = Integer.parseInt(ma.substring(1,3));
            String loai = ma.substring(0,1);
            this.maPhong = ma.substring(3,5);
            int heSo = getHeSo(loai,soNam);
            this.ten = ten;
            this.tongLuong = soNgay*luongcb*heSo*1000;
        }

        public void setPb(PhongBan pb) {
            this.pb = pb;
        }

        private int getHeSo(String loai, int soNam) {
            if(loai.startsWith("A")){
                if(soNam >= 16)
                    return 20;
                else if(soNam >= 9)
                    return 14;
                else if(soNam >= 4)
                    return 12;
                else if(soNam >= 1)
                    return 10;
            }
            else if(loai.startsWith("B")){
                if(soNam >= 16)
                    return 16;
                else if(soNam >= 9)
                    return 13;
                else if(soNam >= 4)
                    return 11;
                else if(soNam >= 1)
                    return 10;
            }
            else if(loai.startsWith("C")){
                if(soNam >= 16)
                    return 14;
                else if(soNam >= 9)
                    return 12;
                else if(soNam >= 4)
                    return 10;
                else if(soNam >= 1)
                    return 9;
            }
            else if(loai.startsWith("D")){
                if(soNam >= 16)
                    return 13;
                else if(soNam >= 9)
                    return 11;
                else if(soNam >= 4)
                    return 9;
                else if(soNam >= 1)
                    return 8;
            }
            return 0;
        }

        @Override
        public String toString() {
            return ma+" "+ten+" "+pb.ten+" "+tongLuong;
        }
    }

    public static class PhongBan{
        private String ma,ten;

        public PhongBan(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        ArrayList<PhongBan> listPhongBan = new ArrayList<>();
        while(n-->0){
            String s = scanner.nextLine();
            listPhongBan.add(new PhongBan(s.substring(0,s.indexOf(" ")),s.substring(s.indexOf(" ")+1)));
        }
        int m = Integer.parseInt(scanner.nextLine());
        while(m-->0){
            NhanVien p = new NhanVien(scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
            for(PhongBan x : listPhongBan)
                if(x.ma.equalsIgnoreCase(p.maPhong)) {
                    p.setPb(x);
                    break;
                }
            listNhanVien.add(p);
        }

        for(NhanVien x : listNhanVien)
            System.out.println(x.toString());
    }
}
