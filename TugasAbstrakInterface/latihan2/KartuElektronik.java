package TugasAbstrakInterface.latihan2;

public class KartuElektronik extends Kartu {
    private String kodeBank;
    private String pin;

    public KartuElektronik(String kodeBank, String pin) {
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otentikasi(String pinInput) {
        return pin.equals(pinInput);
    }

    @Override
    public String encode(String pin) {
        return null;
    }
}

