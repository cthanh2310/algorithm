package practice.oop;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class J04013_TuyenSinh {
    private String ma, ten;
    private float toan, ly, hoa, khuVuc, diemUuTien, diemXetTuyen;

    public J04013_TuyenSinh(String ma, String ten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.khuVuc = Float.parseFloat(ma.substring(2, 3));
        this.diemUuTien = getDiemUuTien();
        this.ten = chuanHoa(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemXetTuyen = toan * 2 + ly + hoa + diemUuTien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Float getDiemXetTuyen() {
        return diemXetTuyen;
    }

    public void setDiemXetTuyen(float diemXetTuyen) {
        this.diemXetTuyen = diemXetTuyen;
    }

    private Float getDiemUuTien() {
        if (khuVuc == 1)
            return 0.5f;
        if (khuVuc == 2)
            return 1f;
        if (khuVuc == 3)
            return 2.5f;
        return 0f;

    }

    @Override
    public String toString() {
        String dut = (diemUuTien - (int) diemUuTien == 0) ? (int) diemUuTien + "" : diemUuTien + "";
        float diem = diemXetTuyen- diemUuTien;
        String dxt = (diem - (int) diem == 0) ? (int) diem + "" : diem + "";
        return ma + " " + ten + " " + dut + " " + dxt + " ";
    }

    private String chuanHoa(String ten) {
        String s[] = ten.trim().toLowerCase().split("\\s+");
        ten = "";
        for (String x : s)
            ten += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return ten.trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        J04013_TuyenSinh p = new J04013_TuyenSinh(scanner.nextLine(), scanner.nextLine(), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()));
        float diemTrungTuyen = 24;
        if (p.getDiemXetTuyen() >= diemTrungTuyen)
            System.out.println(p.toString() + "TRUNG TUYEN");
        else {
            System.out.println(p.toString() + "TRUOT");
        }
    }
}
