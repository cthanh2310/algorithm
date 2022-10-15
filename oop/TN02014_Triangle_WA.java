package practice.oop;

import java.util.Scanner;

public class TN02014_Triangle_WA {
    public static class Triangle {
        private float a[];
        private float len1, len2, len3;

        public Triangle(String str) {
            String s[] = str.trim().split("\\s+");
            a = new float[s.length];
            for (int i = 0; i < s.length; i++)
                a[i] = Float.parseFloat(s[i]);
        }

        public boolean valid() {
            len1 = (float) Math.sqrt(Math.pow(a[0] - a[2], 2) + Math.pow(a[1] - a[3], 2));
            len2 = (float) Math.sqrt(Math.pow(a[2] - a[4], 2) + Math.pow(a[3] - a[5], 2));
            len3 = (float) Math.sqrt(Math.pow(a[0] - a[4], 2) + Math.pow(a[1] - a[5], 2));
            if (len1 + len2 <= len3 || len1 + len3 <= len2 || len2 + len3 <= len3)
                return false;
            return true;
        }

        public String getPerimeter() {
            return String.format("%.3f", (len1 + len2 + len3));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            Triangle a = new Triangle(sc.nextLine());
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}