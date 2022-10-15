package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07060_SapXepLichThi {
    public static class MonHoc {
        private String ma, ten, hinhThuc;

        public MonHoc(String ma, String ten, String hinhThuc) {
            this.ma = ma;
            this.ten = ten;
            this.hinhThuc = hinhThuc;
        }
    }

    public static class CaThi {
        private String ma, phongThi;
        private Date ngayThi, gioThi;

        public CaThi(int ma, String ngayThi, String gioThi, String phongThi) throws ParseException {
            this.ma = "C" + String.format("%03d", ma);
            this.phongThi = phongThi;
            this.ngayThi = new SimpleDateFormat("dd/mm/yyyy").parse(ngayThi);
            this.gioThi = new SimpleDateFormat("HH:mm").parse(gioThi);
        }
    }

    public static class LichThi {
        private MonHoc mh;
        private CaThi ca;
        private String maNhom;
        private int soSV;

        public LichThi(MonHoc mh, CaThi ca, String maNhom, int soSV) {
            this.mh = mh;
            this.ca = ca;
            this.maNhom = maNhom;
            this.soSV = soSV;
        }

        public LichThi() {
        }

        public void setMh(MonHoc mh) {
            this.mh = mh;
        }

        public void setCa(CaThi ca) {
            this.ca = ca;
        }

        public void setMaNhom(String maNhom) {
            this.maNhom = maNhom;
        }

        public void setSoSV(int soSV) {
            this.soSV = soSV;
        }

        @Override
        public String toString() {
            return new SimpleDateFormat("dd/mm/yyyy").format(ca.ngayThi)+" "+new SimpleDateFormat("HH:mm").format(ca.gioThi)+" "+ca.phongThi+" "+mh.ten+" "+maNhom+" "+soSV;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scMonThi = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(scMonThi.nextLine());
        ArrayList<MonHoc> listMonHoc = new ArrayList<>();
        ArrayList<CaThi> listCaThi = new ArrayList<>();
        ArrayList<LichThi> listLichThi = new ArrayList<>();
        while (n-- > 0) {
            listMonHoc.add(new MonHoc(scMonThi.nextLine(), scMonThi.nextLine(), scMonThi.nextLine()));
        }
        Scanner scCaThi = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(scCaThi.nextLine());
        for (int i = 1; i <= m; i++) {
            listCaThi.add(new CaThi(i, scCaThi.nextLine(), scCaThi.nextLine(), scCaThi.nextLine()));
        }
        Scanner scLichThi = new Scanner(new File("LICHTHI.in"));
        int k = Integer.parseInt(scLichThi.nextLine());
        while (k-- > 0) {
            String s[] = scLichThi.nextLine().split("\\s+");
            LichThi l = new LichThi();
            for (CaThi x : listCaThi)
                if (x.ma.equalsIgnoreCase(s[0])) {
                    l.setCa(x);
                    break;
                }
            for (MonHoc x : listMonHoc)
                if (x.ma.equalsIgnoreCase(s[1])) {
                    l.setMh(x);
                    break;
                }
            l.setMaNhom(s[2]);
            l.setSoSV(Integer.parseInt(s[3]));
            listLichThi.add(l);
        }
        Collections.sort(listLichThi, new Comparator<LichThi>() {
            @Override
            public int compare(LichThi o1, LichThi o2) {
                if(o1.ca.ngayThi.compareTo(o2.ca.ngayThi) != 0)
                    return o1.ca.ngayThi.compareTo(o2.ca.ngayThi);
                else{
                    if(o1.ca.gioThi.compareTo(o2.ca.gioThi) != 0)
                        return o1.ca.gioThi.compareTo(o2.ca.gioThi);
                    else
                        return o1.ca.ma.compareTo(o2.ca.ma);
                }
            }
        });
        for(LichThi x : listLichThi)
            System.out.println(x.toString());
    }
}
