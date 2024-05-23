package TugasAbstrakInterface.latihan1;

public abstract class Bentuk {
    protected final double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    public abstract double luas();

    // setter & getter

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
