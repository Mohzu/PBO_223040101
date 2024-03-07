package Tugas4;

public class MatakuliahMain {
	 public static void main(String[] args)
	    {
	        Matakuliah mk1 = new Matakuliah("001","Algoritma Pemograman 1", "A", 3);
	        Matakuliah mk2 = new Matakuliah("002","Algoritma Pemograman 2", "BC", 3);
	        Matakuliah mk3 = new Matakuliah("003","Pemograman Berorientasi Objek", "B", 3);

	        System.out.println("--- DAFTAR matakuliah ---");
	        System.out.println(mk1.display());
	        System.out.println(mk2.display());
	        System.out.println(mk3.display());

	        System.out.println("--- NILAI IPK ---");
	        // Bagaimana Rumus IPK ?
	        // Rumus: (index nilai*sks) + (index nilai*sks) +..+ (index nilai*sks)/total_sks
	    }
}
