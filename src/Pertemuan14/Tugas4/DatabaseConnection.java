package Pertemuan14.Tugas4;

public class DatabaseConnection {

    public static String connectionString;

    // Static block untuk inisialisasi
    static {
        connectionString = "jdbc:mysql://localhost:3306/mahasiswa_db";
        System.out.println("Inisialisasi connectionString telah dilakukan.");
    }
}

