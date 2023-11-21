package pl.Gornik.Trasa;

public class Linia4 extends Trasa {
    Object kierowca;
    public Linia4(int numerTrasy, double dlugoscTrasy, int liczbaPrzystankow, Object kierowca) {
        super(numerTrasy, dlugoscTrasy, liczbaPrzystankow);
        this.kierowca = kierowca;
    }

    @Override
    public String toString() {
        return "Linia 4{" +
                " numerTrasy = " + getNumerTrasy() +
                ", dlugoscTrasy = " + getDlugoscTrasy() +
                ", liczbaPrzystankow = " + getLiczbaPrzystankow() +
                " kierowca = " + kierowca +
                '}';
    }
}
