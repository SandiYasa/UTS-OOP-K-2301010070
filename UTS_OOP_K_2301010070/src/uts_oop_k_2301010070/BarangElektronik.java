package uts_oop_k_2301010070;

public class BarangElektronik {
    protected String nama;
    protected String jenis;
    protected double harga;

    public BarangElektronik() {}

    public BarangElektronik(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: Rp " + harga);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
