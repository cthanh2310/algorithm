package practice.oop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05018_BangDiemHocSinh_WA {
    private String ma, ten, xepLoai;
    private double diemTb;

    public J05018_BangDiemHocSinh_WA(int ma, String ten, double diemTb) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diemTb = diemTb;
        this.xepLoai = getXepLoai();
    }

    private String getXepLoai() {
        if (diemTb >= 9)
            return "XUAT SAC";
        if (diemTb >= 8)
            return "GIOI";
        if (diemTb >= 7 )
            return "KHA";
        if (diemTb >= 5)
            return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTb+ " " + xepLoai;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<J05018_BangDiemHocSinh_WA> ds = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = scanner.nextLine();
            String s[] = scanner.nextLine().split("\\s+");
            BigDecimal tong = BigDecimal.valueOf(0);
            for (int j = 0; j < s.length; j++) {
                if (j == 0 || j == 1)
                    tong = tong.add(new BigDecimal(s[j]).multiply(BigDecimal.valueOf(2)));
                else tong = tong.add(new BigDecimal(s[j]));
            }
            tong = tong.divide(BigDecimal.valueOf(12));
            double diemTb = Math.round(tong.doubleValue()*10.0)/10.0;
            J05018_BangDiemHocSinh_WA p = new J05018_BangDiemHocSinh_WA(i, ten, diemTb);
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J05018_BangDiemHocSinh_WA>() {
            @Override
            public int compare(J05018_BangDiemHocSinh_WA o1, J05018_BangDiemHocSinh_WA o2) {
                if(o1.diemTb != o2.diemTb){
                    return Double.compare(o2.diemTb,o1.diemTb);
                }
                else
                    return o1.ma.compareTo(o2.ma);
            }
        });
        for (J05018_BangDiemHocSinh_WA x : ds)
            System.out.println(x.toString());
    }

}
