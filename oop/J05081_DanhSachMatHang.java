package practice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05081_DanhSachMatHang {
    private String ma, ten, donVi;
    private int giaMua, giaBan, loiNhuan;

    public J05081_DanhSachMatHang(int i,String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH"+String.format("%03d",i);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+donVi+" "+giaMua+" "+giaBan+" "+loiNhuan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<J05081_DanhSachMatHang> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i<=n;i++){
            J05081_DanhSachMatHang p = new J05081_DanhSachMatHang(i,scanner.nextLine(),scanner.nextLine(),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
            list.add(p);
        }
        Collections.sort(list,new Comparator<J05081_DanhSachMatHang>() {
            @Override
            public int compare(J05081_DanhSachMatHang o1, J05081_DanhSachMatHang o2) {
                if(o1.loiNhuan != o2.loiNhuan)
                    return o2.loiNhuan-o1.loiNhuan;
                else{
                    return o1.ma.compareTo(o2.ma);
                }
            }
        });
        for(J05081_DanhSachMatHang x : list){
            System.out.println(x.toString());
        }
    }
}
