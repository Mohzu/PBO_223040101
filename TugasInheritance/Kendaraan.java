package TugasInheritance;

public class Kendaraan {
    protected String merek;
    protected double harga;
    
    public Kendaraan(String merek, double harga) {
        this.merek = merek;
        this.harga = harga;
    }
    
    public String getMerek() {
        return merek;
    }
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
}

