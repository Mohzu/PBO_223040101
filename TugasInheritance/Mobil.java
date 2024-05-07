package TugasInheritance;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String merek, double harga, int jumlahPintu) {
        super(merek, harga); 
        this.jumlahPintu = jumlahPintu;
    }
    
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
}

