import java.util.Scanner;

class NhanVien {
    // Thuộc tính
    private String ho;
    private String ten;
    private int soSP;

    // Hàm khởi tạo
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Getter và Setter
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Tính lương
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

    // Hiển thị thông tin
    public void hienThi() {
        System.out.println("Ho ten: " + ho + " " + ten);
        System.out.println("So san pham: " + soSP);
        System.out.println("Luong: " + tinhLuong());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập nhân viên 1
        System.out.println("Nhap ho NV1:");
        String ho1 = sc.nextLine();

        System.out.println("Nhap ten NV1:");
        String ten1 = sc.nextLine();

        System.out.println("Nhap so san pham NV1:");
        int sp1 = sc.nextInt();
        sc.nextLine();

        // Nhập nhân viên 2
        System.out.println("Nhap ho NV2:");
        String ho2 = sc.nextLine();

        System.out.println("Nhap ten NV2:");
        String ten2 = sc.nextLine();

        System.out.println("Nhap so san pham NV2:");
        int sp2 = sc.nextInt();

        // Tạo đối tượng
        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);
        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        // Xuất thông tin
        System.out.println("\n--- THONG TIN NV1 ---");
        nv1.hienThi();

        System.out.println("\n--- THONG TIN NV2 ---");
        nv2.hienThi();
    }
}