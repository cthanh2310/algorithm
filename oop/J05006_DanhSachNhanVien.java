package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05006_DanhSachNhanVien {
    private String ma,ten,gioiTinh;
    private Date ngaySinh;
    private String diaChi, maSoThue;
    private Date ngayKy;

    public J05006_DanhSachNhanVien(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) throws ParseException {
        this.ma = String.format("%05d",ma);
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
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J05006_DanhSachNhanVien> ds = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            J05006_DanhSachNhanVien s = new J05006_DanhSachNhanVien(i, scanner.nextLine() , scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            ds.add(s);
        }

        for(J05006_DanhSachNhanVien x : ds){
            System.out.println(x.toString());
        }
    }
}
