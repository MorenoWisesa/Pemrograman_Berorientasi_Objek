package Pertemuan14.Tugas2;

public class SavingAccount {
    public class SavingsAccount extends BankAccount {

        public SavingsAccount(String accountNumber, double initialBalance) {
            super(accountNumber, initialBalance);
        }

        // ❌ Ini akan menghasilkan error karena displayAccountInfo() di superclass adalah final
        // @Override
        // public void displayAccountInfo() {
        //     System.out.println("Akun Tabungan");
        //     super.displayAccountInfo();
        // }

    }

}
