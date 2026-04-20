package thigk2.NguyenThiYenLy;
public class ItemData {
    private int hinhAnh;
    private String tieuDe;
    private String moTa;

    public ItemData(int hinhAnh, String tieuDe, String moTa) {
        this.hinhAnh = hinhAnh;
        this.tieuDe = tieuDe;
        this.moTa = moTa;
    }

    public int getHinhAnh() { return hinhAnh; }
    public String getTieuDe() { return tieuDe; }
    public String getMoTa() { return moTa; }
}