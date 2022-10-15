package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024_LietKeSinhVienTheoNganh {
    private String ma, ten,lop,email;

    public J05024_LietKeSinhVienTheoNganh(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+email;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =Integer.parseInt(scanner.nextLine());
        ArrayList<J05024_LietKeSinhVienTheoNganh> ds = new ArrayList<>();
        while(t-->0){
            J05024_LietKeSinhVienTheoNganh p = new J05024_LietKeSinhVienTheoNganh(scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-->0){
            String s = scanner.nextLine();
            String maNganh ="";
            switch(s.trim().toLowerCase()){
                case "ke toan": maNganh = "DCKT"; break;
                case "cong nghe thong tin": maNganh = "DCCN"; break;
                case "an toan thong tin": maNganh = "DCAT"; break;
                case "vien thong": maNganh = "DCVT"; break;
                case "dien tu": maNganh = "DCDT"; break;
            }
            System.out.println("DANH SACH SINH VIEN NGANH "+s.toUpperCase()+":");
            if(maNganh.equalsIgnoreCase("DCCN") || maNganh.equalsIgnoreCase("DCAT")){
                for(J05024_LietKeSinhVienTheoNganh x : ds){
                    if(x.ma.contains(maNganh) && !x.lop.startsWith("E"))
                        System.out.println(x.toString());
                }
            }
            else{
                for(J05024_LietKeSinhVienTheoNganh x : ds){
                    if(x.ma.contains(maNganh))
                        System.out.println(x.toString());
                }
            }
        }
    }
}
