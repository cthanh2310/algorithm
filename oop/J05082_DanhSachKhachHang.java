package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05082_DanhSachKhachHang {
    private String ma, ten, gioiTinh;
    private Date ngaySinh;
    private String diaChi;

    public J05082_DanhSachKhachHang(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
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

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05082_DanhSachKhachHang> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1;i <=n;i++){
            ds.add(new J05082_DanhSachKhachHang(i, scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(ds, new Comparator<J05082_DanhSachKhachHang>() {
            @Override
            public int compare(J05082_DanhSachKhachHang o1, J05082_DanhSachKhachHang o2) {
                return o1.ngaySinh.compareTo(o2.ngaySinh);
            }
        });
        for(J05082_DanhSachKhachHang x : ds)
            System.out.println(x.toString());
    }
}
