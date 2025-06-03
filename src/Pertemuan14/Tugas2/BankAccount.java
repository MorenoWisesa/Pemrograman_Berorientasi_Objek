package Pertemuan14.Tugas2;

public class BankAccount {

    private final String accountNumber; // Nomor rekening tetap
    private double balance;             // Saldo rekening

    // Constructor untuk inisialisasi nomor rekening dan saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method untuk menambah saldo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil: " + amount);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    // Method final untuk menampilkan informasi rekening
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo         : " + balance);
    }
}

