package practice.oop;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class J07010_DanhSachSinhVienTrongFile {
    private String ma, ten;
    private Date ngaySinh;
    private String lop;
    private Float gpa;

    public J07010_DanhSachSinhVienTrongFile(int ma, String ten, String lop, String ngaySinh, Float gpa) throws ParseException {
        this.ma = "B20DCCN"+String.format("%03d",ma);
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+String.format("%.2f",gpa);
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("SV.in"));
        ArrayList<J07010_DanhSachSinhVienTrongFile> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++){
            J07010_DanhSachSinhVienTrongFile p = new J07010_DanhSachSinhVienTrongFile(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        for(J07010_DanhSachSinhVienTrongFile x : ds){
            System.out.println(x.toString());
        }
    }
}
