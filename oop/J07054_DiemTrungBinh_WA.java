package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07054_DiemTrungBinh_WA {
    private String ten, ma;
    private float diem1, diem2, diem3;
    private float diemTB;

    private int stt;

    public J07054_DiemTrungBinh_WA(int ma, String ten, float diem1, float diem2, float diem3) {
        this.ma = "SV" + String.format("%02d", ma);
        this.ten = chuanHoa(ten);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemTB = (float) (Math.round(((diem1 * 3 + diem2 * 3 + diem3 * 2) / 8 * 100.0)) / 100.0);
    }

    private String chuanHoa(String ten) {
        String[] s = ten.trim().toLowerCase().split("\\s+");
        ten = "";
        for (String x : s)
            ten += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return ten.trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTB + " " + stt;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/BANGDIEM.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J07054_DiemTrungBinh_WA> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            J07054_DiemTrungBinh_WA p = new J07054_DiemTrungBinh_WA(i, scanner.nextLine(), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J07054_DiemTrungBinh_WA>() {
            @Override
            public int compare(J07054_DiemTrungBinh_WA o1, J07054_DiemTrungBinh_WA o2) {
                if (o1.diemTB != o2.diemTB)
                    return Float.compare(o2.diemTB, o1.diem1);
                else {
                    return o1.ma.compareTo(o2.ma);
                }
            }
        });
        ds.get(0).setStt(1);
        System.out.println(ds.get(0));
        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).diemTB == ds.get(i - 1).diemTB) {
                ds.get(i).setStt(ds.get(i-1).getStt());
            } else
                ds.get(i).setStt(i + 1);
            System.out.println(ds.get(i).toString());
        }
    }
}
