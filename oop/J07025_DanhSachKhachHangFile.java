package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07025_DanhSachKhachHangFile {
    private String ma, ten, gioiTinh;
    private Date ngaySinh;
    private String diaChi;

    public J07025_DanhSachKhachHangFile(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH"+String.format("%03d",ma);
        this.ten = chuanHoa(ten);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
    }

    private String chuanHoa(String ten) {
        StringBuilder sb = new StringBuilder();
        String[] s = ten.trim().toLowerCase().split("\\s+");
        for(String x : s)
            sb.append(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+gioiTinh+" "+diaChi+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh);
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        ArrayList<J07025_DanhSachKhachHangFile> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1;i <=n;i++){
            ds.add(new J07025_DanhSachKhachHangFile(i, scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(ds, new Comparator<J07025_DanhSachKhachHangFile>() {
            @Override
            public int compare(J07025_DanhSachKhachHangFile o1, J07025_DanhSachKhachHangFile o2) {
                return o1.ngaySinh.compareTo(o2.ngaySinh);
            }
        });
        for(J07025_DanhSachKhachHangFile x : ds)
            System.out.println(x.toString());
    }
}
