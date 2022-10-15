package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05007_SapXepNhanVien {
    private String ma,ten,gioiTinh;
    private Date ngaySinh;
    private String diaChi, maSoThue;
    private Date ngayKy;

    public J05007_SapXepNhanVien(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKy) throws ParseException {
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
        ArrayList<J05007_SapXepNhanVien> ds = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            J05007_SapXepNhanVien s = new J05007_SapXepNhanVien(i, scanner.nextLine() , scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            ds.add(s);
        }
        Collections.sort(ds, new Comparator<J05007_SapXepNhanVien>() {
            @Override
            public int compare(J05007_SapXepNhanVien o1, J05007_SapXepNhanVien o2) {
                return o1.ngaySinh.compareTo(o2.ngaySinh);
            }
        });
        for(J05007_SapXepNhanVien x : ds){
            System.out.println(x.toString());
        }
    }
}
