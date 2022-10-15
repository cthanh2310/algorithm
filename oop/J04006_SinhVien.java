package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J04006_SinhVien {
    private String ma, hoTen, lop;
    private Date ngaySinh;
    private Float gpa;

    public J04006_SinhVien(String hoTen, String lop, String ngaySinh, Float gpa) throws ParseException {
        this.ma = "B20DCCN001";
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma +" "+hoTen+" "+lop+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+String.format("%.2f",gpa);
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        J04006_SinhVien s = new J04006_SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), Float.parseFloat(scanner.nextLine()));
        System.out.println(s);
    }
}
