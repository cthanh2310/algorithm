package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J04007_NhanVien {
    private String ma = "00001",ten,gioiTinh;
    private Date ngaySinh;
    private String diaChi, maSoThue;
    private Date ngayKy;

    public J04007_NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) throws ParseException {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKy = new SimpleDateFormat("dd/mm/yyyy").parse(ngayKy);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+gioiTinh+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+diaChi+" "+maSoThue+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngayKy);
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        J04007_NhanVien s = new J04007_NhanVien(scanner.nextLine() , scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(s);
    }
}
