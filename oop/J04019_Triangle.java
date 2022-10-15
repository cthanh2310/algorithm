package practice.oop;

import java.util.Scanner;

public class J04019_Triangle {
    public static class Point{
        private float x,y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }


        public static Point nextPoint(Scanner sc) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            return new Point(x,y);
        }
    }

    public static class Triangle{
        private Point p1, p2, p3;
        private float len1,len2,len3;

        public Triangle(Point p1, Point p2, Point p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        public boolean valid() {
            len1 = (float) Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
            len2 = (float) Math.sqrt(Math.pow(p1.getX()-p3.getX(),2)+Math.pow(p1.getY()-p3.getY(),2));
            len3 = (float) Math.sqrt(Math.pow(p3.getX()-p2.getX(),2)+Math.pow(p3.getY()-p2.getY(),2));
            if(len1 + len2 <= len3 ||  len1 + len3 <= len2 || len2 + len3 <= len3)
                return false;
            return true;
        }

        public String getPerimeter() {
            return String.format("%.3f",(len1+len2+len3));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

