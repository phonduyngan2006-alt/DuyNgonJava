package ThucHanhJava;

public class Invoice {

    private String maMatHang;
    private String moTaMatHang;
    private int soLuong;
    private double giaMoiMatHang;

    public Invoice(
            String maMatHang,
            String moTaMatHang,
            int soLuong,
            double giaMoiMatHang) {

        this.maMatHang = maMatHang;
        this.moTaMatHang = moTaMatHang;

        if (soLuong > 0) {
            this.soLuong = soLuong;
        } else {
            this.soLuong = 0;
        }

        if (giaMoiMatHang > 0) {
            this.giaMoiMatHang = giaMoiMatHang;
        } else {
            this.giaMoiMatHang = 0;
        }
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public String getMoTaMatHang() {
        return moTaMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaMoiMatHang() {
        return giaMoiMatHang;
    }

    public double getInvoiceAmount() {

        return soLuong * giaMoiMatHang;
    }

    public void hienThiThongTin() {

        System.out.println("Ma mat hang: "
                + maMatHang);

        System.out.println("Mo ta: "
                + moTaMatHang);

        System.out.println("So luong: "
                + soLuong);

        System.out.println("Gia: "
                + giaMoiMatHang);

        System.out.println("Tong tien: "
                + getInvoiceAmount());
    }
}