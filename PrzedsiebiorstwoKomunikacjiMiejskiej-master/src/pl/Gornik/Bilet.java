package pl.Gornik;

import pl.Gornik.Trasa.Trasa;

import java.util.ArrayList;

public class Bilet {

    private String imie;
    private Trasa trasa;
    private static int nextTicketNumber = 1;

    private int numerBiletu;
    private String typBiletu;
    private double cenaBiletu;


    public Bilet(String passengerName, double price, Trasa trasa) {
        this.imie = passengerName;
        this.cenaBiletu = price;
        this.trasa = trasa;

        trasa.kupBilet(passengerName, price);
    }
    public Bilet(String typBiletu, double cenaBiletu) {
        this.typBiletu = typBiletu;
        this.cenaBiletu = cenaBiletu;
    }

    public String getTypBiletu() {
        return typBiletu;
    }

    public void setCenaBiletu(double cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }


    private static int getNextTicketNumber() {
        return nextTicketNumber++;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                " typBiletu = '" + typBiletu + '\'' +
                ", cenaBiletu = " + cenaBiletu +
                '}';
    }

    public String displayTrasay() {
        return ("Bilet{" +
                " Imie = '" + typBiletu + '\'' +
                ", cenaBiletu = " + cenaBiletu +
                ", numer biletu = " + getNextTicketNumber() +
                '}');
    }

    public static double UstawCene(String typBiletu) {
        double cenaBiletu = 0;
        if (typBiletu.equalsIgnoreCase("Ulgowy")) {
            cenaBiletu = 1.60;
        } else if (typBiletu.equalsIgnoreCase("Normalny")) {
            cenaBiletu = 2.40;
        } else if (typBiletu.equalsIgnoreCase("Miesieczny")) {
            cenaBiletu = 38.20;
        }
        return cenaBiletu;
    }


}
