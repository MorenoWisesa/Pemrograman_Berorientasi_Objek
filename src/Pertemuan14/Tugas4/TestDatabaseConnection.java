package Pertemuan14.Tugas4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Static block di DatabaseConnection sudah otomatis jalan sebelum baris ini
        System.out.println("Connection String: " + DatabaseConnection.connectionString);
    }
}
