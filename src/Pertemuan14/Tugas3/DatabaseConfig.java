package Pertemuan14.Tugas3;

public class DatabaseConfig {

    public static String dbUrl;
    public static String username;
    public static String password;

    // Static block untuk inisialisasi kompleks
    static {
        System.out.println("Inisialisasi konfigurasi database...");
        // Simulasi konfigurasi yang kompleks
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        username = "root";
        password = "password123";

        // Bisa juga panggil method konfigurasi lain di sini
        // misal load dari file config atau environment variable
    }

    public static void printConfig() {
        System.out.println("DB URL   : " + dbUrl);
        System.out.println("Username : " + username);
        // Password biasanya tidak dicetak untuk alasan keamanan
    }
}
