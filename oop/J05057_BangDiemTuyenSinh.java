package practice.oop;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J05057_BangDiemTuyenSinh {
    private String ma, ten, trangThai;
    private float toan, ly, hoa, khuVuc, diemUuTien, diemXetTuyen;

    public J05057_BangDiemTuyenSinh(String ma, String ten, float toan, float ly, float hoa) {
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
        float diemTrungTuyen = 24;
        this.trangThai = (diemXetTuyen >= diemTrungTuyen) ? "TRUNG TUYEN" : "TRUOT";

        String dut = (diemUuTien - (int) diemUuTien == 0) ? (int) diemUuTien + "" : diemUuTien + "";
        float diem = diemXetTuyen- diemUuTien;
        String dxt = (diem - (int) diem == 0) ? (int) diem + "" : diem + "";

        return ma + " " + ten + " " + dut + " " + dxt + " "+trangThai;
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
        ArrayList<J05057_BangDiemTuyenSinh> ds = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            J05057_BangDiemTuyenSinh p = new J05057_BangDiemTuyenSinh(scanner.nextLine(), scanner.nextLine(), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()), Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        for(J05057_BangDiemTuyenSinh x : ds)
            System.out.println(x.toString());
    }
}
