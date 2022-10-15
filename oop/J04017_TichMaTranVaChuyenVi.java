package practice.oop;

import java.util.Scanner;

public class J04017_TichMaTranVaChuyenVi {
    public static class Matrix{
        private int n,m;
        private int a[][];

        public int[][] getA() {
            return a;
        }

        public Matrix(int n, int m) {
            this.n = n;
            this.m = m;
            a = new int[n][m];
        }

        public Matrix(int[][] a) {
            this.n = a.length;
            this.m = a[0].length;
            this.a = a;
        }

        public void nextMatrix(Scanner sc) {
            for(int i = 0; i < n;i++){
                for(int j = 0; j < m;j++)
                    a[i][j] = sc.nextInt();
            }
        }

        public Matrix trans() {
            Matrix mt = new Matrix(m,n);
            int b[][] = mt.getA();
            for(int i = 0 ; i < n;i++){
                for(int j =0;j < m;j++)
                    b[j][i] = a[i][j];
            }
            mt.setA(b);
            return mt;
        }

        public void setA(int[][] a) {
            this.a = a;
        }

        public Matrix mul(Matrix mt) {
            int b[][] = mt.getA();
            int col = b[0].length;
            int c[][] = new int[n][col];
            for(int i = 0 ; i< n;i++){
                for(int j = 0; j < col;j++ ){
                    int t = 0;
                    for(int k = 0; k<m;k++)
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
                for(int j =0;j < m;j++)
                    rs += a[i][j]+" ";
                rs += '\n';
            }
            return rs;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
