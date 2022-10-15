package practice.oop;

import java.util.Scanner;

public class TN02013_LopPhanSo_WA {
    public static class PhanSo{
        private long tu,mau;
        public PhanSo(String str) {
            String s[] = str.split("\\s+");
            tu = Long.parseLong(s[0]);
            mau = Long.parseLong(s[1]);
        }

        public PhanSo(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }

        public PhanSo cong(PhanSo b) {
            long tuSo = tu*b.getMau() + mau*b.getTu();
            long mauSo = mau*b.getMau();
            long usc = usc(tuSo, mauSo);
            tuSo /= usc;
            mauSo /= usc;
            return new PhanSo(tuSo, mauSo);
        }

        private long usc(long a, long b) {
            a = Math.abs(a);
            b= Math.abs(b);
            long t;
            while(b > 0){
                t = a%b;
                a = b;
                b = t;
            }
            return a;
        }

        public PhanSo nhan(PhanSo b) {
            long tuSo = tu*b.getTu();
            long mauSo = mau*b.getMau();
            long usc = usc(tuSo, mauSo);
            tuSo /= usc;
            mauSo /= usc;
            return new PhanSo(tuSo, mauSo);
        }

        public long getTu() {
            return tu;
        }

        public long getMau() {
            return mau;
        }


        @Override
        public String toString() {
            if(tu*mau > 0)
                return Math.abs(tu)+"/"+Math.abs(mau);
            else
                return "-"+Math.abs(tu)+"/"+Math.abs(mau);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            PhanSo A = new PhanSo(sc.nextLine());
            PhanSo B = new PhanSo(sc.nextLine());
            PhanSo tongAB = A.cong(B);
            PhanSo tichAB = A.nhan(B);
            PhanSo C = tongAB.nhan(tongAB);
            System.out.print(C);
            System.out.print(" ");
            System.out.println(tichAB.nhan(C));
        }
    }
}
