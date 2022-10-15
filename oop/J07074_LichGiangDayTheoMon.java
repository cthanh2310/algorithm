package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07074_LichGiangDayTheoMon {
    public static class MonHoc{
        private String ma, ten;
        private int soTc;

        public MonHoc(String ma, String ten, int soTc) {
            this.ma = ma;
            this.ten = ten;
            this.soTc = soTc;
        }
    }
    public static class NhomLop{
        private MonHoc mon;
        private String maNhom, maMon;
        private int thu, kip;
        private String giangVien, phongHoc;

        public NhomLop(int ma,String maMon, int thu, int kip, String giangVien, String phongHoc) {
            this.maNhom = "HP"+String.format("%03d",ma);
            this.maMon = maMon;
            this.thu = thu;
            this.kip = kip;
            this.giangVien = giangVien;
            this.phongHoc = phongHoc;
        }
        @Override
        public String toString() {
            return maNhom+" "+thu+" "+kip+" "+giangVien+" "+phongHoc;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sMonHoc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sMonHoc.nextLine());
        ArrayList<MonHoc> listMon = new ArrayList<>();
        while(t-->0){
            listMon.add(new MonHoc(sMonHoc.nextLine(), sMonHoc.nextLine(), Integer.parseInt(sMonHoc.nextLine())));
        }
        Scanner sLichGD = new Scanner(new File("LICHGD.in"));
        int k = Integer.parseInt(sLichGD.nextLine());
        ArrayList<NhomLop> listNhom = new ArrayList<>();
        for(int i = 1; i<=k;i++){
            listNhom.add(new NhomLop(i, sLichGD.nextLine(),Integer.parseInt(sLichGD.nextLine()),Integer.parseInt(sLichGD.nextLine()),sLichGD.nextLine(),sLichGD.nextLine()));
        }
        String searchMaMon = sLichGD.nextLine();
        String tenMon ="";
        for(int i = 0; i < listMon.size();i++){
            if(listMon.get(i).ma.equalsIgnoreCase(searchMaMon)){
                tenMon = listMon.get(i).ten;
                break;
            }
        }
        List<NhomLop> listKQ = new ArrayList<>();
        System.out.println("LICH GIANG DAY MON "+tenMon+":");
        for(NhomLop x : listNhom){
            if(x.maMon.equalsIgnoreCase(searchMaMon))
                listKQ.add(x);
        }
        Collections.sort(listKQ, new Comparator<NhomLop>() {
            @Override
            public int compare(NhomLop o1, NhomLop o2) {
                if(o1.thu-o2.thu != 0){
                    return o1.thu-o2.thu;
                }
                else{
                    if(o1.kip - o2.kip != 0){
                        return o1.kip-o2.kip;
                    }
                    else{
//                        String ten1 = o1.giangVien.substring(o1.giangVien.lastIndexOf(" ")+1)+o1.giangVien;
//                        String ten2 = o2.giangVien.substring(o2.giangVien.lastIndexOf(" ")+1)+o2.giangVien;
//                        return ten1.compareTo(ten2);
                        return o1.giangVien.compareTo(o2.giangVien);
                    }
                }
            }
        });
        for(NhomLop x : listKQ)
            System.out.println(x.toString());
    }
}
