package practice.oop;

import java.util.Scanner;

public class TN02004_TichHaiMaTran {
    public static class Matrix{
        private int n,m;
        private int a[][];

        public Matrix(int n, int m) {
            this.n = n;
            this.m = m;
            a = new int[n][m];
        }

        public Matrix(int[][] a) {
            this.a = a;
            this.n = a.length;
            this.m =a[0].length;
        }

        public void nextMatrix(Scanner sc) {
            for(int i = 0; i<n;i++){
                for(int j = 0; j < m;j++)
                    a[i][j] = sc.nextInt();
            }
        }

        public int getHang() {
            return n;
        }

        public void getHang(int n) {
            this.n = n;
        }

        public int getCot() {
            return m;
        }

        public void setCot(int m) {
            this.m = m;
        }

        public int[][] getMaTrix() {
            return a;
        }

        public void setMaTrix(int[][] a) {
            this.a = a;
        }

        public Matrix mul(Matrix mt) {
            int b[][] = mt.getMaTrix();
            int m = mt.getCot();
            int l = getCot();
            int c[][] = new int[n][m];
            for(int i = 0; i<n;i++){
                for(int j = 0; j < m;j++){
                    int t = 0;
                    for(int k = 0; k < l; k++)
                        t += a[i][k]*b[k][j];
                    c[i][j] = t;
                }
            }
            return new Matrix(c);
        }

        @Override
        public String toString() {
            String rs = "";
            for(int i = 0 ; i < n;i++){
                for(int j = 0 ; j < m; j++){
                    rs+= a[i][j]+" ";
                }
                rs += '\n';
            }
            return rs;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}