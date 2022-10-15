package practice.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05011_TinhGio {
    private String ma, ten;
    private Date timeStart, timeEnd;
    private long timePlay, gio,phut;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    public J05011_TinhGio(String ma, String ten, String timeStart, String timeEnd) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.timeStart = sdf.parse(timeStart);
        this.timeEnd = sdf.parse(timeEnd);
        this.timePlay = this.timeEnd.getTime()- this.timeStart.getTime();
        this.gio = timePlay/(60*60*1000);
        this.phut = timePlay/(60*1000) - this.gio*60;
    }

    @Override
    public String toString() {
        return ma+"  "+ten+" "+gio+" gio "+phut+" phut";
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        ArrayList<J05011_TinhGio> ds = new ArrayList<>();
        while(t-->0){
            J05011_TinhGio p = new J05011_TinhGio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J05011_TinhGio>() {
            @Override
            public int compare(J05011_TinhGio o1, J05011_TinhGio o2) {
                return Long.compare(o2.timePlay, o1.timePlay);
            }
        });
        for(J05011_TinhGio x : ds)
            System.out.println(x.toString());
    }
}
