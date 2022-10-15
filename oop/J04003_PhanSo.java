package practice.oop;

import java.util.Scanner;

public class J04003_PhanSo {
    private long tu, mau;

    public J04003_PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void rutGon() {
        long x = usc(tu, mau);
        tu /= x;
        mau /= x;
    }

    // 5 60
    private long usc(long a, long b) {
        long t;
        while (b > 0) {
            t = a % b; // t = 0
            a = b; // a = 5
            b = t; // b = 0
        }
        return a;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        J04003_PhanSo p = new J04003_PhanSo(scanner.nextLong(), scanner.nextLong());
        p.rutGon();
        System.out.println(p);
    }
}
