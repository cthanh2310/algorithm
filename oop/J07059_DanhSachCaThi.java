package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07059_DanhSachCaThi {
    private String ma, phong;
    private Date ngayThi, gioThi;

    public J07059_DanhSachCaThi(int ma, String ngayThi, String gioThi, String phong) throws ParseException {
        this.ma = "C"+String.format("%03d",ma);
        this.phong = phong;
        this.ngayThi = new SimpleDateFormat("dd/mm/yyyy").parse(ngayThi);
        this.gioThi = new SimpleDateFormat("HH:mm").parse(gioThi);
    }

    @Override
    public String toString() {
        return ma+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngayThi)+" "+new SimpleDateFormat("HH:mm").format(gioThi)+" "+phong;
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<J07059_DanhSachCaThi> ds = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            J07059_DanhSachCaThi p = new J07059_DanhSachCaThi(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        Collections.sort(ds,new Comparator<J07059_DanhSachCaThi>() {
            @Override
            public int compare(J07059_DanhSachCaThi o1, J07059_DanhSachCaThi o2) {
                if(o1.ngayThi.compareTo(o2.ngayThi) != 0)
                    return o1.ngayThi.compareTo(o2.ngayThi);
                else{
                    if(o1.gioThi.compareTo(o2.gioThi) != 0)
                        return o1.gioThi.compareTo(o2.gioThi);
                    else
                        return o1.ma.compareTo(o2.ma);
                }
            }
        });
        for(J07059_DanhSachCaThi x : ds)
            System.out.println(x);
    }
}
