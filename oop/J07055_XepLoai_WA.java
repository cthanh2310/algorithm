package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07055_XepLoai_WA {
    private String ten, ma, xepLoai;
    private float lt, th, thi;
    private float diemTB;

    public J07055_XepLoai_WA(int ma, String ten, float lt, float th, float thi) {
        this.ma = "SV"+String.format("%02d",ma);
        this.ten = chuanHoa(ten);
        this.lt = lt;
        this.th = th;
        this.thi = thi;
        diemTB = (float)(lt*25+th*35+thi*40)/100;
        xepLoai = getXepLoai();
    }

    public String getXepLoai() {
        if(diemTB >= 8)
            return "GIOI";
        if(diemTB >= 6.5 )
            return "KHA";
        if(diemTB >= 5)
            return "TRUNG BINH";
        return "KEM";
    }

    private String chuanHoa(String ten) {
        String[] s = ten.trim().toLowerCase().split("\\s+");
        ten = "";
        for (String x : s)
            ten += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return ten.trim();
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.2f",diemTB)+" "+xepLoai;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner  = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J07055_XepLoai_WA> ds = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            J07055_XepLoai_WA p = new J07055_XepLoai_WA(i,scanner.nextLine(),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()),Float.parseFloat(scanner.nextLine()));
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J07055_XepLoai_WA>() {
            @Override
            public int compare(J07055_XepLoai_WA o1, J07055_XepLoai_WA o2) {
                return Float.compare(o2.diemTB,o1.diemTB);
            }
        });
        for(J07055_XepLoai_WA x : ds)
            System.out.println(x);
    }
}
