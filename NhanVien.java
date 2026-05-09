import java.util.Scanner;

class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoSP(int soSP) {
        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    public double tinhLuong() {
        double donGia;

        if (soSP >= 600) {
            donGia = 0.65;
        } else if (soSP >= 400) {
            donGia = 0.6;
        } else if (soSP >= 200) {
            donGia = 0.55;
        } else {
            donGia = 0.5;
        }

        return soSP * donGia;
    }

    public boolean lonHon(NhanVien nv2) {
        return this.soSP > nv2.soSP;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + ho + " " + ten);
        System.out.println("So san pham: " + soSP);
        System.out.println("Luong: " + tinhLuong());
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ho NV1:");
        String ho1 = sc.nextLine();

        System.out.println("Nhap ten NV1:");
        String ten1 = sc.nextLine();

        System.out.println("Nhap so san pham NV1:");
        int sp1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap ho NV2:");
        String ho2 = sc.nextLine();

        System.out.println("Nhap ten NV2:");
        String ten2 = sc.nextLine();

        System.out.println("Nhap so san pham NV2:");
        int sp2 = sc.nextInt();

        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);
        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        System.out.println("\nTHONG TIN NHAN VIEN 1");
        nv1.hienThi();

        System.out.println("\nTHONG TIN NHAN VIEN 2");
        nv2.hienThi();

        System.out.println("\nSO SANH DUNG HAM lonHon");

        if (nv1.lonHon(nv2)) {
            System.out.println("NV1 co so san pham nhieu hon NV2");
            System.out.println("Nhieu hon: "
                    + (nv1.getSoSP() - nv2.getSoSP())
                    + " san pham");
        } else if (nv2.lonHon(nv1)) {
            System.out.println("NV2 co so san pham nhieu hon NV1");
            System.out.println("Nhieu hon: "
                    + (nv2.getSoSP() - nv1.getSoSP())
                    + " san pham");
        } else {
            System.out.println("Hai nhan vien co so san pham bang nhau");
        }

        System.out.println("\nSO SANH KHONG DUNG HAM lonHon");

        if (nv1.getSoSP() > nv2.getSoSP()) {
            System.out.println("NV1 nhieu hon NV2");
        } else if (nv1.getSoSP() < nv2.getSoSP()) {
            System.out.println("NV2 nhieu hon NV1");
        } else {
            System.out.println("Hai nhan vien bang nhau");
        }

        sc.close();
    }
}