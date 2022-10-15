package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07052_DanhSachTrungTuyen {
    private String ma, ten;
    private float toan,ly,hoa, khuVuc,diemUuTien, diemXetTuyen;

    public J07052_DanhSachTrungTuyen(String ma, String ten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.khuVuc = Float.parseFloat(ma.substring(2,3));
        this.diemUuTien = getDiemUuTien();
        this.ten = chuanHoa(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemXetTuyen = toan*2+ly+hoa+diemUuTien;
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
        if(khuVuc == 1)
            return 0.5f;
        if(khuVuc == 2)
            return 1f;
        if(khuVuc == 3)
            return 2.5f;
        return 0f;

    }

    @Override
    public String toString() {
        String dut = (diemUuTien - (int)diemUuTien == 0) ? (int)diemUuTien +"" : diemUuTien+"";
        String dxt = (diemXetTuyen- (int)diemXetTuyen == 0) ? (int)diemXetTuyen+"" : diemXetTuyen+"";
        return  ma + " " + ten + " " + dut + " " + dxt+" ";
    }

    private String chuanHoa(String ten) {
        String s[] = ten.trim().toLowerCase().split("\\s+");
        ten = "";
        for(String x : s)
            ten += x.substring(0,1).toUpperCase()+ x.substring(1)+" ";
        return ten.trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J07052_DanhSachTrungTuyen> ds = new ArrayList<>();
        for(int i = 0; i<n;i++){
            J07052_DanhSachTrungTuyen p = new J07052_DanhSachTrungTuyen(scanner.nextLine(),scanner.nextLine(),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        int chiTieu = Integer.parseInt(scanner.nextLine());
        Collections.sort(ds, new Comparator<J07052_DanhSachTrungTuyen>() {
            @Override
            public int compare(J07052_DanhSachTrungTuyen o1, J07052_DanhSachTrungTuyen o2) {
                if(o1.getDiemXetTuyen() != o2.getDiemXetTuyen())
                    return Float.compare(o2.getDiemXetTuyen(),o1.getDiemXetTuyen());
                else{
                    return o1.getMa().compareTo(o2.getMa());
                }

            }
        });
        float diemTrungTuyen = ds.get(chiTieu-1).getDiemXetTuyen();
        System.out.println(diemTrungTuyen);
        for(J07052_DanhSachTrungTuyen x : ds){
            if(x.getDiemXetTuyen() >= diemTrungTuyen)
                System.out.println(x.toString() +"TRUNG TUYEN");
            else{
                System.out.println(x.toString() +"TRUOT");
            }
        }
    }

}
