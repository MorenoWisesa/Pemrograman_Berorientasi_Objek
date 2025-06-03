package Pertemuan14.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040035", "Daffa");
        Mahasiswa m2 = new Mahasiswa("233040036", "Rina");

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();

        System.out.println("\nTotal Mahasiswa melalui static method: " + Mahasiswa.getTotalMahasiswa());
    }
}