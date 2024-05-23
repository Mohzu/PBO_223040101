package TugasAbstrakInterface.Tugas;

import java.util.ArrayList;
import java.util.List;

public class KartuATMElektronikRiwayat implements KartuATMRiwayat {
    private String nomorKartu;
    private String pin;
    private double saldo;
    private List<String> riwayatTransaksi;

    public KartuATMElektronikRiwayat(String nomorKartu, String pin, double saldo) {
        this.nomorKartu = nomorKartu;
        this.pin = pin;
        this.saldo = saldo;
        this.riwayatTransaksi = new ArrayList<>();
    }

    @Override
    public boolean otorisasiPIN(String pinInput) {
        return pin.equals(pinInput);
    }

    @Override
    public double cekSaldo() {
        return saldo;
    }

    @Override
    public boolean tarikTunai(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
            tambahTransaksi("Penarikan gagal sebesar " + jumlah);
            return false;
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan tunai sebesar " + jumlah + " berhasil.");
            tambahTransaksi("Penarikan berhasil sebesar " + jumlah);
            return true;
        }
    }

    @Override
    public List<String> getRiwayatTransaksi() {
        return new ArrayList<>(riwayatTransaksi); // Mengembalikan salinan riwayat transaksi untuk menjaga enkapsulasi
    }

    @Override
    public void tambahTransaksi(String transaksi) {
        riwayatTransaksi.add(transaksi);
    }
}

