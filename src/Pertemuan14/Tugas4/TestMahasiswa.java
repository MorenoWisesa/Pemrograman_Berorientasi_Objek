package Pertemuan14.Tugas4;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("123456789", "Daffa", 20);
        Mahasiswa mhs2 = new Mahasiswa("987654321", "Rina", 30); // SKS melebihi maksimum

        mhs1.displayInfo();
        System.out.println();
        mhs2.displayInfo();
    }
}

