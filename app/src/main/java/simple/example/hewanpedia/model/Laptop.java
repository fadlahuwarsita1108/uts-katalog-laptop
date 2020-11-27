package simple.example.hewanpedia.model;

public class Laptop {
    private String model;
    private String seri;
    private String deskripsi;
    private int drawableRes;

    public Laptop(String model, String seri, String deskripsi, int drawableRes) {
        this.model = model;
        this.seri = seri;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
