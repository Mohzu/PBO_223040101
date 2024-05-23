package TugasAbstrakInterface.Tugas;

public interface KartuATM {
    // Metode untuk mengotorisasi PIN
    boolean otorisasiPIN(String pin);
    
    // Metode untuk mengecek saldo
    double cekSaldo();
    
    // Metode untuk melakukan penarikan tunai
    boolean tarikTunai(double jumlah);
}

