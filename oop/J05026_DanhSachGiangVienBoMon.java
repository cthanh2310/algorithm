package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J05026_DanhSachGiangVienBoMon {
    private String ma, ten, boMon;

    public J05026_DanhSachGiangVienBoMon() {
    }

    public J05026_DanhSachGiangVienBoMon(int ma, String ten, String boMon) {
        this.ma = "GV"+String.format("%02d",ma);
        this.ten = ten;
        this.boMon = getBoMon(boMon);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+boMon;
    }

    private String getBoMon(String boMon) {
        StringBuilder sb = new StringBuilder();
        String s[] = boMon.trim().toUpperCase().split("\\s+");
        for(String x : s)
            sb.append(x.substring(0,1));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05026_DanhSachGiangVienBoMon> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1;i <=n;i++){
            J05026_DanhSachGiangVienBoMon p = new J05026_DanhSachGiangVienBoMon(i, scanner.nextLine(), scanner.nextLine());
            ds.add(p);
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-->0){
            String s = new J05026_DanhSachGiangVienBoMon().getBoMon(scanner.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON "+s+":");
            for(J05026_DanhSachGiangVienBoMon x : ds){
                if(x.boMon.contains(s))
                    System.out.println(x.toString());
            }
        }
    }
}
