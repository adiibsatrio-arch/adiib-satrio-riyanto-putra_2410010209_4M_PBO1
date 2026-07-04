public class Motor extends Kendaraan {
    private String merk;
    public Motor(String nama, int harga, String merk) {
        super(nama, harga);
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    @Override
    public void tampilkan() {
        System.out.println("Motor : " + getNama());
        System.out.println("Merk  : " + merk);
        System.out.println("Harga : Rp" + getHarga());
    }
}