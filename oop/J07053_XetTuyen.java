package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07053_XetTuyen {
    private String ten, ma, xepLoai,ngaySinh;
    private float lyThuyet, thucHanh, diemThuong;
    private int tuoi,diemXepLoai;

    public J07053_XetTuyen(int i, String ten, String ngaySinh, float lyThuyet, float thucHanh) throws ParseException {
        this.ma = "PH"+String.format("%02d",i);
        this.ten = chuanHoa(ten);
        this.ngaySinh = ngaySinh;
        this.tuoi = getTuoi();
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.diemThuong = getDiemThuong();
        this.diemXepLoai = Math.round((lyThuyet+thucHanh)/2 + diemThuong);
        if(diemXepLoai > 10) diemXepLoai = 10;
        this.xepLoai =getXepLoai();
    }

    private int getTuoi() {
        int yearNow = 2021;
        String s[] = ngaySinh.split("/");
        int yearBirth = 0;
        for(String x : s){
            yearBirth = Math.max(yearBirth, Integer.parseInt(x));
        }
        ;return yearNow-yearBirth;
    }

    private String chuanHoa(String ten) {
        String s[] = ten.trim().toLowerCase().split("\\s+");
        ten ="";
        for(String x : s)
            ten += x.substring(0,1).toUpperCase()+x.substring(1)+" ";
        return ten.trim();
    }

    public String getXepLoai() {
        if(diemXepLoai == 9 || diemXepLoai == 10)
            return "Xuat sac";
        if(diemXepLoai == 8)
            return "Gioi";
        if(diemXepLoai == 7)
            return "Kha";
        if(diemXepLoai == 5 || diemXepLoai == 6)
            return "Trung binh";
        if(diemXepLoai < 5)
            return "Truot";
        return null;
    }

    public float getDiemThuong() {
        if(lyThuyet >= 8 && thucHanh >=8)
            return 1;
        if(lyThuyet >= 7.5  && thucHanh >= 7.5 )
            return 0.5f;
        return 0f;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+tuoi+" "+diemXepLoai+" "+xepLoai;
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("XETTUYEN.in"));
        ArrayList<J07053_XetTuyen> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1;i <=n; i++){
            J07053_XetTuyen p = new J07053_XetTuyen(i,scanner.nextLine(),scanner.nextLine(),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        for(J07053_XetTuyen x : ds)
            System.out.println(x);
    }
}
