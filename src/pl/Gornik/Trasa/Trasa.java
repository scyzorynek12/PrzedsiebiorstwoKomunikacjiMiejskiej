package pl.Gornik.Trasa;

import pl.Gornik.Bilet;

import java.util.ArrayList;

public class Trasa {
    private int numerTrasy;
    private double dlugoscTrasy;
    private int liczbaPrzystankow;

    private ArrayList<Bilet> bilety = new ArrayList<>();

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

    public void displayTrasa(){
        System.out.println("Trasa{" +
                "numerTrasy=" + numerTrasy +
                ", dlugoscTrasy=" + dlugoscTrasy +
                ", liczbaPrzystankow=" + liczbaPrzystankow +
                '}');
    }

    @Override
    public String toString() {
        return "Trasa{" +
                "numerTrasy=" + numerTrasy +
                ", dlugoscTrasy=" + dlugoscTrasy +
                ", liczbaPrzystankow=" + liczbaPrzystankow +
                '}';
    }

    public void kupBilet(String passengerName, double price) {
        Bilet bilet = new Bilet(passengerName, price);
        bilety.add(bilet);
        System.out.println("Pomyślnie kupiono bilet dla trasy " + numerTrasy);
    }

    public void displayBilety() {
        System.out.println("Bilet dla trasy " + numerTrasy + ":");
        for (Bilet bilet : bilety) {
            System.out.println(bilet.displayTrasay());
        }
    }
}
