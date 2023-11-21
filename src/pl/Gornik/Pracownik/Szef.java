package pl.Gornik.Pracownik;

public class Szef extends Pracownik{
    double wyplata;
    public Szef(int numerPracownika, String imie, String nazwisko, int wiek, double wyplata) {
        super(numerPracownika, imie, nazwisko, wiek);
        this.wyplata = wyplata;
    }

    @Override
    public String toString() {
        return "Szef:" +
                " numerPracownika = " + super.getNumerPracownika() +
                ", imie = " + super.getImie() +
                ", nazwisko = " + super.getNazwisko() +
                ", wiek = " + super.getWiek() +
                ", wyplata = " + wyplata;
    }
}
