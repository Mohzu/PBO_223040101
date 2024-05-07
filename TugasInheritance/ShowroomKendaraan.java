package TugasInheritance;

public class ShowroomKendaraan {
 public static void main(String[] args) {
     Mobil mobil = new Mobil("Toyota", 200000000, 4);
     
     System.out.println("Merek: " + mobil.getMerek());
     System.out.printf("Harga: Rp %,.0f\n", mobil.getHarga());
     System.out.println("Jumlah Pintu: " + mobil.getJumlahPintu());
 }
}

