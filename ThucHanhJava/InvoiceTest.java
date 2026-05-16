package ThucHanhJava;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {

    static ArrayList<Invoice> ds =
            new ArrayList<>();

    public static boolean trungMa(String ma) {

        for (Invoice i : ds) {

            if (i.getMaMatHang()
                    .equalsIgnoreCase(ma)) {

                return true;
            }
        }

        return false;
    }

    public static void nhapDanhSach(
            Scanner sc) {

        System.out.println(
                "Nhap danh sach Invoice");

        while (ds.size() < 10) {

            System.out.println(
                    "\nInvoice "
                            + (ds.size() + 1));

            String ma;

            while (true) {

                System.out.print(
                        "Nhap ma mat hang: ");

                ma = sc.nextLine();

                if (!trungMa(ma)) {
                    break;
                }

                System.out.println(
                        "Ma bi trung!");
            }

            System.out.print(
                    "Nhap mo ta: ");

            String moTa =
                    sc.nextLine();

            System.out.print(
                    "Nhap so luong: ");

            int soLuong =
                    Integer.parseInt(
                            sc.nextLine());

            System.out.print(
                    "Nhap gia: ");

            double gia =
                    Double.parseDouble(
                            sc.nextLine());

            Invoice invoice =
                    new Invoice(
                            ma,
                            moTa,
                            soLuong,
                            gia);

            ds.add(invoice);
        }
    }

    public static void xuatDanhSach() {

        if (ds.isEmpty()) {

            System.out.println(
                    "Danh sach rong");

            return;
        }

        for (Invoice i : ds) {

            System.out.println(
                    "----------------");

            i.hienThiThongTin();
        }
    }

    public static void sapXepTheoMa() {

        for (int i = 0;
                i < ds.size() - 1;
                i++) {

            for (int j = i + 1;
                    j < ds.size();
                    j++) {

                if (ds.get(i)
                        .getMaMatHang()
                        .compareToIgnoreCase(
                                ds.get(j)
                                        .getMaMatHang())
                        > 0) {

                    Invoice temp =
                            ds.get(i);

                    ds.set(i,
                            ds.get(j));

                    ds.set(j,
                            temp);
                }
            }
        }

        System.out.println(
                "Da sap xep theo ma");
    }

    public static void sapXepTheoSoLuong() {

        for (int i = 0;
                i < ds.size() - 1;
                i++) {

            for (int j = i + 1;
                    j < ds.size();
                    j++) {

                if (ds.get(i)
                                .getSoLuong()
                        > ds.get(j)
                                .getSoLuong()) {

                    Invoice temp =
                            ds.get(i);

                    ds.set(i,
                            ds.get(j));

                    ds.set(j,
                            temp);
                }
            }
        }

        System.out.println(
                "Da sap xep theo so luong");
    }

    public static void timTheoMa(
            Scanner sc) {

        System.out.print(
                "Nhap ma can tim: ");

        String ma =
                sc.nextLine();

        for (Invoice i : ds) {

            if (i.getMaMatHang()
                    .equalsIgnoreCase(ma)) {

                System.out.println(
                        "Tim thay:");

                i.hienThiThongTin();

                return;
            }
        }

        System.out.println(
                "Khong tim thay");
    }

    public static void xoaTheoMa(
            Scanner sc) {

        System.out.print(
                "Nhap ma can xoa: ");

        String ma =
                sc.nextLine();

        for (Invoice i : ds) {

            if (i.getMaMatHang()
                    .equalsIgnoreCase(ma)) {

                ds.remove(i);

                System.out.println(
                        "Da xoa");

                return;
            }
        }

        System.out.println(
                "Khong tim thay");
    }

    public static void menu() {

        System.out.println(
                "\n===== MENU =====");

        System.out.println(
                "1. Nhap danh sach");

        System.out.println(
                "2. Xuat danh sach");

        System.out.println(
                "3. Sap xep theo ma");

        System.out.println(
                "4. Sap xep theo so luong");

        System.out.println(
                "5. Tim theo ma");

        System.out.println(
                "6. Xoa theo ma");

        System.out.println(
                "0. Thoat");
    }

    public static void main(
            String[] args) {

        try (Scanner sc =
                new Scanner(System.in)) {

            int chon;

            do {

                menu();

                System.out.print(
                        "Nhap lua chon: ");

                chon =
                        Integer.parseInt(
                                sc.nextLine());

                switch (chon) {

                    case 1:

                        nhapDanhSach(sc);

                        break;

                    case 2:

                        xuatDanhSach();

                        break;

                    case 3:

                        sapXepTheoMa();

                        break;

                    case 4:

                        sapXepTheoSoLuong();

                        break;

                    case 5:

                        timTheoMa(sc);

                        break;

                    case 6:

                        xoaTheoMa(sc);

                        break;

                    case 0:

                        System.out.println(
                                "Thoat chuong trinh");

                        break;

                    default:

                        System.out.println(
                                "Lua chon khong hop le");
                }

            } while (chon != 0);
        }
    }
}