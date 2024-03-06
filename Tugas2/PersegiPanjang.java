package Tugas2;
import java.util.Scanner;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    // Fungsi kelas untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Fungsi kelas untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    // Fungsi kelas untuk menampilkan nilai atribut dan hasil perhitungan
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Memasukkan nilai panjang dan lebar 
        System.out.print("Panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Lebar: ");
        double lebar = input.nextDouble();

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = panjang;
        persegiPanjang.lebar = lebar;

        persegiPanjang.tampil();

        input.close();
    }
}
