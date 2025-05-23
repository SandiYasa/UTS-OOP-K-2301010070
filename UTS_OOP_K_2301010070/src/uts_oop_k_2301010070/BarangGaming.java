package uts_oop_k_2301010070;

public class BarangGaming extends BarangElektronik {
    private String spesifikasi;

    public BarangGaming() {}

    public BarangGaming(String nama, String jenis, double harga, String spesifikasi) {
        super(nama, jenis, harga);
        this.spesifikasi = spesifikasi;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Spesifikasi: " + spesifikasi);
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }
}
