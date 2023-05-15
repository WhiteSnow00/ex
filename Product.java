package ex;

public class Product {
    private String mahang;
    private String ten;
    private String nhasx;
    private int soluong;
    private float dongia;

    // Constructor
    public Product(String mahang, String ten, String nhasx, int soluong, float dongia) {
        this.mahang = mahang;
        this.ten = ten;
        this.nhasx = nhasx;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    // Getters and Setters
    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
}
