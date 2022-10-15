package practice.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class J05022_LietKeSinhVienTheoLop {
    private String ma, ten,lop,email;

    public J05022_LietKeSinhVienTheoLop(String ma, String ten, String lop, String email) {
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
        ArrayList<J05022_LietKeSinhVienTheoLop> ds = new ArrayList<>();
        while(t-->0){
            J05022_LietKeSinhVienTheoLop p = new J05022_LietKeSinhVienTheoLop(scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-->0){
            String s = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+s+":");
            for(J05022_LietKeSinhVienTheoLop x : ds){
                if(x.lop.equals(s))
                    System.out.println(x.toString());
            }
        }
    }
}
