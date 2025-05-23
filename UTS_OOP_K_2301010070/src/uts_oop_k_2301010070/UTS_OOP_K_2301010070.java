package uts_oop_k_2301010070;

import java.util.Scanner;

public class UTS_OOP_K_2301010070 {
    static BarangGaming[] daftarBarang = new BarangGaming[100];
    static int jumlahData = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\nMenu Aplikasi:");
            System.out.println("1. Tambah Data Barang");
            System.out.println("2. Tampilkan Data Barang");
            System.out.println("3. Ubah Data Barang");
            System.out.println("4. Hapus Data Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> tampilData();
                case 3 -> ubahData();
                case 4 -> hapusData();
                case 5 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Nama Barang: ");
        String nama = input.nextLine();
        System.out.print("Jenis Barang: ");
        String jenis = input.nextLine();
        System.out.print("Harga: ");
        double harga = input.nextDouble(); input.nextLine();
        System.out.print("Spesifikasi: ");
        String spesifikasi = input.nextLine();

        daftarBarang[jumlahData] = new BarangGaming(nama, jenis, harga, spesifikasi);
        jumlahData++;
        System.out.println("Data berhasil ditambahkan.");
    }

    static void tampilData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData ke-" + (i+1));
            daftarBarang[i].tampilInfo();
        }
    }

    static void ubahData() {
        tampilData();
        System.out.print("Pilih nomor data yang ingin diubah: ");
        int index = input.nextInt(); input.nextLine();
        if (index < 1 || index > jumlahData) {
            System.out.println("Index tidak valid.");
            return;
        }

        BarangGaming barang = daftarBarang[index - 1];
        System.out.print("Nama baru: ");
        barang.setNama(input.nextLine());
        System.out.print("Jenis baru: ");
        barang.setJenis(input.nextLine());
        System.out.print("Harga baru: ");
        barang.setHarga(input.nextDouble()); input.nextLine();
        System.out.print("Spesifikasi baru: ");
        barang.setSpesifikasi(input.nextLine());

        System.out.println("Data berhasil diubah.");
    }

    static void hapusData() {
        tampilData();
        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = input.nextInt(); input.nextLine();
        if (index < 1 || index > jumlahData) {
            System.out.println("Index tidak valid.");
            return;
        }

        for (int i = index - 1; i < jumlahData - 1; i++) {
            daftarBarang[i] = daftarBarang[i + 1];
        }
        jumlahData--;
        System.out.println("Data berhasil dihapus.");
    }
}
