package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class TN02020_TinhGioChuan {
    public static class MonHoc {
        private String ma, ten;

        public MonHoc(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }


    }

    public static class GiangVien {
        private String ma, ten;
        private float tongGio = 0;

        public GiangVien(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void addTongGio(float tongGio) {
            this.tongGio += tongGio;
        }

        @Override
        public String toString() {
            return ten + " " + String.format("%.02f", tongGio);
        }
    }

    public static class LopHocPhan {
        private GiangVien g;
        private MonHoc m;
        private float soGio;

        public LopHocPhan() {
        }

        public LopHocPhan(GiangVien g, MonHoc m, float soGio) {
            this.g = g;
            this.m = m;
            this.soGio = soGio;
        }

        public GiangVien getGV() {
            return g;
        }

        public void setGV(GiangVien g) {
            this.g = g;
        }

        public MonHoc getMH() {
            return m;
        }

        public void setMH(MonHoc m) {
            this.m = m;
        }

        public float getSoGio() {
            return soGio;
        }

        public void setSoGio(float soGio) {
            this.soGio = soGio;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soMon = Integer.parseInt(scanner.nextLine());
        ArrayList<MonHoc> listMon = new ArrayList<>();
        ArrayList<GiangVien> listGV = new ArrayList<>();
        ArrayList<LopHocPhan> listLHP = new ArrayList<>();
        while (soMon-- > 0) {
            String s = scanner.nextLine();
            listMon.add(new MonHoc(s.substring(0, s.indexOf(" ")), s.substring(s.indexOf(" ") + 1)));
        }
        int soGV = Integer.parseInt(scanner.nextLine());
        while (soGV-- > 0) {
            String s = scanner.nextLine();
            listGV.add(new GiangVien(s.substring(0, s.indexOf(" ")), s.substring(s.indexOf(" ") + 1)));
        }
        int soLHP = Integer.parseInt(scanner.nextLine());
        while (soLHP-- > 0) {
            String s[] = scanner.nextLine().split("\\s+");
            for (GiangVien x : listGV)
                if (x.getMa().equalsIgnoreCase(s[0])) {
                    x.addTongGio(Float.parseFloat(s[2]));
                    break;
                }
        }

        for(GiangVien x : listGV)
            System.out.println(x.toString());
    }
}
