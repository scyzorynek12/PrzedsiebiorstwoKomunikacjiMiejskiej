package pl.Gornik.Trasa;

public class Linia10 extends Trasa {
    Object kierowca;
    public Linia10(int numerTrasy, double dlugoscTrasy, int liczbaPrzystankow, Object kierowca) {
        super(numerTrasy, dlugoscTrasy, liczbaPrzystankow);
        this.kierowca = kierowca;
    }

    @Override
    public String toString() {
        return "Trasa{" +
                " numerTrasy = " + getNumerTrasy() +
                ", dlugoscTrasy = " + getDlugoscTrasy() +
                ", liczbaPrzystankow = " + getLiczbaPrzystankow() +
                " kierowca = " + kierowca +
                '}';
    }
}
