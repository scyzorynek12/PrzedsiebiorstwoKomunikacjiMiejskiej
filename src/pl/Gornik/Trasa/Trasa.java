package pl.Gornik.Trasa;

public class Trasa {
    private int numerTrasy;
    private double dlugoscTrasy;
    private int liczbaPrzystankow;

    public Trasa(int numerTrasy, double dlugoscTrasy, int liczbaPrzystankow) {
        this.numerTrasy = numerTrasy;
        this.dlugoscTrasy = dlugoscTrasy;
        this.liczbaPrzystankow = liczbaPrzystankow;
    }

    public int getNumerTrasy() {
        return numerTrasy;
    }

    public double getDlugoscTrasy() {
        return dlugoscTrasy;
    }

    public int getLiczbaPrzystankow() {
        return liczbaPrzystankow;
    }

    @Override
    public String toString() {
        return "Trasa{" +
                "numerTrasy=" + numerTrasy +
                ", dlugoscTrasy=" + dlugoscTrasy +
                ", liczbaPrzystankow=" + liczbaPrzystankow +
                '}';
    }
}
