package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TN02011_LietKeNhapXuatHangTheoNhom {
    private String ma;
    private int xuat, nhap, donGia;
    private long tongTien;
    private int thue;

    public TN02011_LietKeNhapXuatHangTheoNhom(String ma, int nhap) {
        this.ma = ma;
        this.nhap = nhap;
        if(ma.startsWith("A"))
            xuat = (int) Math.round(0.6*nhap);
        else
            xuat = (int) Math.round(0.7*nhap);
        if(ma.endsWith("Y"))
            donGia = 110000;
        else
            donGia = 135000;
        tongTien = xuat*donGia;
        if(ma.startsWith("A") && ma.endsWith("Y"))
            thue = (int) (0.08*tongTien);
        else if (ma.startsWith("A") && ma.endsWith("N"))
            thue = (int) (0.11*tongTien);
        else if (ma.startsWith("B") && ma.endsWith("Y"))
            thue = (int) (0.17*tongTien);
        else if (ma.startsWith("B") && ma.endsWith("N"))
            thue = (int) (0.22*tongTien);
    }

    @Override
    public String toString() {
        return ma+" "+nhap+" "+xuat+" "+donGia+" "+tongTien+" "+thue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TN02011_LietKeNhapXuatHangTheoNhom> list = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while(t-->0){
            list.add(new TN02011_LietKeNhapXuatHangTheoNhom(scanner.nextLine(),Integer.parseInt(scanner.nextLine())));
        }
        String s =scanner.nextLine();
        ArrayList<TN02011_LietKeNhapXuatHangTheoNhom> listKQ = new ArrayList<>();
        for(TN02011_LietKeNhapXuatHangTheoNhom x : list){
            if(x.ma.startsWith(s))
                listKQ.add(x);
        }
        Collections.sort(listKQ, new Comparator<TN02011_LietKeNhapXuatHangTheoNhom>() {
            @Override
            public int compare(TN02011_LietKeNhapXuatHangTheoNhom o1, TN02011_LietKeNhapXuatHangTheoNhom o2) {
                return o2.thue-o1.thue;
            }
        });
        for(TN02011_LietKeNhapXuatHangTheoNhom x : listKQ)
            System.out.println(x.toString());
    }
}
