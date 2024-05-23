package TugasAbstrakInterface.Tugas;

public class TestKartuATMRiwayat {
    public static void main(String[] args) {
        KartuATMElektronikRiwayat kartuATM = new KartuATMElektronikRiwayat("1234567890", "1234", 1000.0);

        // Memeriksa otorisasi PIN
        if (kartuATM.otorisasiPIN("1234")) {
            System.out.println("PIN Benar");
        } else {
            System.out.println("PIN Salah");
        }

        // Mengecek saldo
        System.out.println("Saldo sekarang: " + kartuATM.cekSaldo());

        // Menarik tunai
        kartuATM.tarikTunai(500.0);

        // Mengecek saldo setelah penarikan tunai
        System.out.println("Saldo sekarang: " + kartuATM.cekSaldo());

        // Menarik tunai lagi dengan jumlah yang lebih besar dari saldo
        kartuATM.tarikTunai(600.0);

        // Mengecek saldo setelah penarikan tunai kedua
        System.out.println("Saldo sekarang: " + kartuATM.cekSaldo());

        // Menampilkan riwayat transaksi
        System.out.println("Riwayat Transaksi:");
        for (String transaksi : kartuATM.getRiwayatTransaksi()) {
            System.out.println(transaksi);
        }
    }
}



