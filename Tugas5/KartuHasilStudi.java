package Tugas5;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester){
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    public void addMatakuliah(Matakuliah Matakuliah){
        daftarMatakuliah.add(Matakuliah);
    }
    public String display(){
        StringBuilder sb = new StringBuilder();
        for(Matakuliah mk : daftarMatakuliah){
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public double getIps() {
        return ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void hitungIPS() { //?? rumus hitungIPS
        double totalBobot = 0.0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        if (totalSKS > 0) {
            ips = totalBobot / totalSKS;
        } else {
            ips = 0; // jika totalSKS adalah 0, maka IPS dianggap 0
        }
    }

    //Setter & Getter
    public int getTotalSKS(){
        int totalSKS = 0;
        for(Matakuliah mk : daftarMatakuliah){
            totalSKS += mk.getSKS();
        }
        return totalSKS;
    }

}