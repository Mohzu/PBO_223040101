package TugasAbstrakInterface.Tugas;

import java.util.List;

public interface KartuATMRiwayat extends KartuATM {
    // Metode untuk mendapatkan riwayat transaksi
    List<String> getRiwayatTransaksi();

    // Metode untuk menambahkan transaksi ke riwayat
    void tambahTransaksi(String transaksi);
}



