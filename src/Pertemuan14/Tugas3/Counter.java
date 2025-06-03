package Pertemuan14.Tugas3;

public class Counter {

    private static int instanceCount = 0; // Variabel static untuk hitung objek

    public Counter() {
        instanceCount++; // Tambah setiap kali objek dibuat
    }

    public static int getInstanceCount() {
        return instanceCount; // Kembalikan jumlah objek yang sudah dibuat
    }
}

