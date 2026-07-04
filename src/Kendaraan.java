public class Kendaraan {
    // Atribut (Encapsulation)
    private String nama;
    private int harga;
    // Constructor
    public Kendaraan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    // Getter
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    // Method
    public void tampilkan() {
        System.out.println("Nama Motor : " + nama);
        System.out.println("Harga Sewa : Rp" + harga);
    }
}