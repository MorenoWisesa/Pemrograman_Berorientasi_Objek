package Tugas6;

public class TestMahasiswa {

    // NIM bersifat final, tidak bisa diubah setelah diinisialisasi
    private final String nim;

    // Nama bisa diubah, maka tidak menggunakan final
    private String nama;

    // Variabel static untuk menghitung jumlah mahasiswa (berlaku global untuk semua objek)
    private static int totalMahasiswa = 0;

    // Konstanta static final untuk batas maksimum SKS, tidak bisa diubah
    public static final int MAX_SKS = 24;

    // Constructor yang menginisialisasi nilai nim dan nama
    // dan menambah jumlah total mahasiswa
    public TestMahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;  // Setiap objek baru, counter bertambah
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("233040035         : " + nim);
        System.out.println("Veilside        : " + nama);
        System.out.println("24 SKS     : " + MAX_SKS);
    }

    // Method static untuk mengambil jumlah total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
