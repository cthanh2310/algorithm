package practice.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07084_ThoiGianOnline {
    private String ten;
    private Date timeStart, timeEnd;
    private long timeOnline;

    public J07084_ThoiGianOnline(String ten, String timeStart, String timeEnd) throws ParseException {
        this.ten = chuanHoa(ten);
        this.timeStart = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss").parse(timeStart);
        this.timeEnd = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss").parse(timeEnd);
        this.timeOnline = (this.timeEnd.getTime()-this.timeStart.getTime())/(60*1000);
    }

    private String chuanHoa(String ten) {
        StringBuilder sb = new StringBuilder();
        String[] s = ten.trim().toLowerCase().split("\\s+");
        for(String x : s)
            sb.append(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return ten+" "+timeOnline;
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("ONLINE.in"));
        ArrayList<J07084_ThoiGianOnline> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++){
            J07084_ThoiGianOnline p = new J07084_ThoiGianOnline(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            ds.add(p);
        }
        Collections.sort(ds, new Comparator<J07084_ThoiGianOnline>() {
            @Override
            public int compare(J07084_ThoiGianOnline o1, J07084_ThoiGianOnline o2) {
                if(o1.timeOnline != o2.timeOnline)
                    return Long.compare(o2.timeOnline,o1.timeOnline);
                else
                    return o1.ten.compareTo(o2.ten);
            }
        });
        for (J07084_ThoiGianOnline x :ds)
            System.out.println(x);
    }
}
