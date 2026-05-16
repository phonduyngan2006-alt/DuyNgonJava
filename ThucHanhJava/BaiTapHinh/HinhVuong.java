package ThucHanhJava.BaiTapHinh;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(String mau, double canh) {

        super(mau, canh, canh);
    }

    @Override
    public String layThongTin() {

        return "Hinh vuong - Mau: " + mau
                + ", Canh: " + chieuDai;
    }
}