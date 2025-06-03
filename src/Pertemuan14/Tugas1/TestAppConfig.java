package Pertemuan14.Tugas1;

class RekeningBank {

    private final String nomorRekening; // Tidak boleh berubah
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public final void tampilkanInfo() {
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.println("Saldo          : " + saldo);
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }
}

    
