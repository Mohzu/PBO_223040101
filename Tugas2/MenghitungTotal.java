package Tugas2;

import java.util.Scanner;

public class MenghitungTotal {
	public static void main(String [] args) {
		MenghitungTotal();
	}
	
	public static void MenghitungTotal() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Nilai N: ");
		int N = scanner.nextInt();
		
		// Menampilkan pesan jika N <= 0
		if (N <= 0) {
			System.out.println("N tidak boleh nol atau minus");
			System.out.println("Total = 0");
		} else {
			int total = 0;
			System.out.println("Masukkan " + "bilangan: ");
			
			for (int i = 0; i < N; i++) {
				int bilangan = scanner.nextInt();
				total += bilangan;
			}
			
			System.out.println("Total = " + total);
		}
		
	}
}
