package ThucHanhJava;

import java.util.Scanner;

public class UCLN {

    public static int timUCLN(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static boolean soHoanThien(int n) {

        int tong = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    public static boolean toanChuSoChan(int n) {

        while (n > 0) {

            int chuSo = n % 10;

            if (chuSo % 2 != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    public static long giaiThua(int n) {

        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    public static double tinhS(double x, int n) {

        double tong = 0;

        for (int i = 0; i <= n; i++) {

            int mu = 2 * i + 1;

            tong += Math.pow(x, mu) / giaiThua(mu);
        }

        return tong;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===== CAU 1 =====");

            System.out.print("Nhap a: ");
            int a = sc.nextInt();

            System.out.print("Nhap b: ");
            int b = sc.nextInt();

            System.out.println("UCLN = " + timUCLN(a, b));

            System.out.println("\n===== CAU 2 =====");

            System.out.print("Nhap n: ");
            int n1 = sc.nextInt();

            if (soHoanThien(n1)) {
                System.out.println(n1 + " la so hoan thien");
            } else {
                System.out.println(n1 + " khong phai so hoan thien");
            }

            System.out.println("\n===== CAU 3 =====");

            System.out.print("Nhap n: ");
            int n2 = sc.nextInt();

            if (toanChuSoChan(n2)) {
                System.out.println(n2 + " co toan chu so chan");
            } else {
                System.out.println(n2 + " khong co toan chu so chan");
            }

            System.out.println("\n===== CAU 4 =====");

            System.out.print("Nhap x: ");
            double x = sc.nextDouble();

            System.out.print("Nhap n: ");
            int n = sc.nextInt();

            System.out.println("S(x,n) = " + tinhS(x, n));
        }
    }
}