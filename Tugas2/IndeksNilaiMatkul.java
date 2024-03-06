package Tugas2;

import java.util.Scanner;

public class IndeksNilaiMatkul {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Memasukkan nilai matakuliah 
		System.out.print("Masukkan nilai matakuliah: ");
		String inputNilai = scanner.nextLine();
		
		
		if (inputNilai.isEmpty()) {
			System.out.println("Nilai harus di isi");
		} else {
			int nilai = Integer.parseInt(inputNilai);
			String indeks;
			
			// Mengonversi nilai menjadi indeks nilai
			if (nilai >= 81 && nilai <+ 100) {
				indeks = "A";
			} else if (nilai >= 76 && nilai <= 80) {
				indeks = "AB";
			} else if (nilai >= 56 && nilai <= 75) {
				indeks = "B";
			} else if (nilai >= 51 && nilai <= 55) {
				indeks = "BC";
			} else if (nilai >= 41 && nilai <= 50) {
				indeks = "C";
			} else if (nilai >= 21 && nilai <= 40) {
				indeks = "D";
			} else if (nilai >= 0 && nilai <= 20) {
				indeks = "E";
			} else {
				indeks = "Nilai di luar jangkauan";
			}
			
			System.out.println("Indeks nilai: " + indeks);
		}
		
		scanner.close();
	}
}
