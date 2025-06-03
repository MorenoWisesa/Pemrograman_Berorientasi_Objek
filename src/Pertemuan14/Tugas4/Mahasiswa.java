package Pertemuan14.Tugas4;

public class Mahasiswa {

    private final String nim;            // NIM unik dan tidak berubah
    private String nama;
    private int sksDiambil;

    public static final int MAX_SKS = 24; // Maksimum SKS global, tidak bisa diubah

    public Mahasiswa(String nim, String nama, int sksDiambil) {
        this.nim = nim;
        this.nama = nama;

        if (sksDiambil > MAX_SKS) {
            System.out.println("SKS melebihi batas maksimum, disesuaikan ke " + MAX_SKS);
            this.sksDiambil = MAX_SKS;
        } else {
            this.sksDiambil = sksDiambil;
        }
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getSksDiambil() {
        return sksDiambil;
    }

    public void displayInfo() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("SKS   : " + sksDiambil);
        System.out.println("Maks SKS: " + MAX_SKS);
    }
}
