package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TN02019_HoaDon {
    public static class KhachHang{
        private String ma,ten,gioiTinh, diaChi;
        private Date ngaySinh;

        public KhachHang(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
            this.ma = "KH"+String.format("%03d",ma);
            this.ten = chuanHoa(ten);
            this.gioiTinh = gioiTinh;
            this.diaChi = diaChi;
            this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        }

        private String chuanHoa(String ten) {
            StringBuilder sb = new StringBuilder();
            String[] s = ten.trim().toLowerCase().split("\\s+");
            for(String x : s)
                sb.append(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
            return sb.toString().trim();
        }
    }

    public static class MatHang{
        private String ma,ten,donVi;
        private int giaMua,giaBan;

        public MatHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
            this.ma = "MH"+String.format("%03d",ma);
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }
    }
    public static class HoaDon{
        private String ma;
        private KhachHang kh;
        private MatHang mh;
        private int soLuong, thanhTien;

        public HoaDon(int ma, KhachHang kh, MatHang mh, int soLuong) {
            this.ma = "HD"+String.format("%03d",ma);
            this.kh = kh;
            this.mh = mh;
            this.soLuong = soLuong;
        }
        public HoaDon(int ma) {
            this.ma = "HD"+String.format("%03d",ma);
        }

        public void setKh(KhachHang kh) {
            this.kh = kh;
        }

        public void setMh(MatHang mh) {
            this.mh = mh;
        }

        public void setSoLuong(int soLuong) {
            this.soLuong = soLuong;
        }

        public void setThanhTien(int thanhTien) {
            this.thanhTien = thanhTien;
        }

        @Override
        public String toString() {
            return ma+" "+kh.ten+" "+kh.diaChi+" "+mh.ten+" "+mh.donVi+" "+mh.giaMua+" "+mh.giaBan+" "+soLuong+" "+thanhTien;
        }
    }
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        ArrayList<MatHang> listMH = new ArrayList<>();
        ArrayList<HoaDon> listHD = new ArrayList<>();
        for(int i = 1;i <=n;i++){
            listKH.add(new KhachHang(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),scanner.nextLine()));
        }
        int m = Integer.parseInt(scanner.nextLine().trim());
        for(int i = 1;i <=m;i++){
            listMH.add(new MatHang(i,scanner.nextLine(),scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }
        int k = Integer.parseInt(scanner.nextLine().trim());
        for(int i = 1; i<=k;i++){
            String s[] = scanner.nextLine().split("\\s+");
            HoaDon hd = new HoaDon(i);
            for(KhachHang x : listKH)
                if(x.ma.equalsIgnoreCase(s[0]))
                    hd.setKh(x);
            for(MatHang x : listMH)
                if(x.ma.equalsIgnoreCase(s[1]))
                    hd.setMh(x);
            hd.setSoLuong(Integer.parseInt(s[2]));
            hd.setThanhTien(hd.mh.giaBan* hd.soLuong);
            listHD.add(hd);
        }

        for(HoaDon hd : listHD)
            System.out.println(hd.toString());
    }
}