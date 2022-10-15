package practice.oop;

import java.util.Scanner;

public class TN02013_Son {
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

class PhanSo{
    private long tuSo, mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo(String s) {
        String[] words = s.split(" ");
        this.tuSo = Long.valueOf(words[0]);
        this.mauSo = Long.valueOf(words[1]);
    }

    public long timUSCLN(long a, long b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

    public void toiGian() {
        long ucln = timUSCLN(this.tuSo, this.mauSo);
        this.setTuSo(this.tuSo / ucln);
        this.setMauSo(this.mauSo / ucln);
    }

    public PhanSo cong(PhanSo ps2) {
        long ts = tuSo * ps2.mauSo + mauSo * ps2.tuSo;
        long ms = mauSo * ps2.mauSo;
        PhanSo psCong = new PhanSo(ts, ms);
        psCong.toiGian();
        return psCong;
    }

    public PhanSo nhan(PhanSo ps2) {
        long ts = tuSo * ps2.tuSo;
        long ms = mauSo * ps2.mauSo;
        PhanSo psNhan = new PhanSo(ts, ms);
        psNhan.toiGian();
        return psNhan;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
