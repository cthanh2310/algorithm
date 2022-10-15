package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07057_DiemTuyenSinh {
    private String ma,ten, ketQua;
    private double diemThi;

    public J07057_DiemTuyenSinh(int ma, String ten, double diemThi, String danToc, int khuVuc) {
        this.ma = "TS"+String.format("%02d",ma);
        this.ten = chuanHoa(ten);
        this.diemThi = diemThi;
        if(khuVuc == 1)
            this.diemThi += 1.5;
        if(khuVuc ==2)
            this.diemThi += 1;
        if(!danToc.equals("Kinh"))
            this.diemThi += 1.5;
        if(this.diemThi >= 20.5)
            ketQua = "Do";
        else
            ketQua = "Truot";
    }

    private String chuanHoa(String ten) {
        StringBuilder sb = new StringBuilder();
        String s[] = ten.trim().toLowerCase().split("\\s+");
        for(String x : s)
            sb.append(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+diemThi+" "+ketQua;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J07057_DiemTuyenSinh> ds = new ArrayList<>();
        for(int i = 1;i <=n;i++){
            J07057_DiemTuyenSinh p = new J07057_DiemTuyenSinh(i, scanner.nextLine(), Double.parseDouble(scanner.nextLine()),scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J07057_DiemTuyenSinh>() {
            @Override
            public int compare(J07057_DiemTuyenSinh o1, J07057_DiemTuyenSinh o2) {
                return Double.compare(o2.diemThi,o1.diemThi);
            }
        });
        for(J07057_DiemTuyenSinh x : ds)
            System.out.println(x);
    }
}
