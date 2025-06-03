package Pertemuan14.Tugas5;

public class Mahasiswa {

    private final String nim;                 // NIM bersifat tetap
    private String nama;                      // Nama mahasiswa
    private static int totalMahasiswa = 0;    // Menghitung total objek Mahasiswa
    public static final int MAX_SKS = 24;     // Konstanta batas maksimum SKS

    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Tambah setiap kali objek dibuat
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Max SKS      : " + MAX_SKS);
        System.out.println("Total Mahasiswa Saat Ini: " + totalMahasiswa);
    }

    // Method static opsional untuk mendapatkan total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

