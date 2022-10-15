package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J04005_ThiSinh {
    private String hoTen;
    private Date ngaySinh;
    private Float diem1, diem2, diem3, tongDiem;

    public J04005_ThiSinh(String hoTen, String ngaySinh, Float diem1, Float diem2, Float diem3) throws ParseException {
        this.hoTen = hoTen;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = diem1+diem2+diem3;
    }

    @Override
    public String toString() {
        return hoTen+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+String.format("%.1f",tongDiem);
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        J04005_ThiSinh t = new J04005_ThiSinh(scanner.nextLine(),scanner.nextLine(),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()));
        System.out.println(t);
    }
}
