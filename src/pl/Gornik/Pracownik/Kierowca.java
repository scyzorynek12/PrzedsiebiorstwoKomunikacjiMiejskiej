package pl.Gornik.Pracownik;

public class Kierowca extends Pracownik{
    double wyplata;
    boolean prawoJazdy;
    public Kierowca(int numerPracownika, String imie, String nazwisko, int wiek, double wyplata, boolean prawoJazdy) {
        super(numerPracownika, imie, nazwisko, wiek);
        this.wyplata = wyplata;
        this.prawoJazdy = prawoJazdy;
    }

    @Override
    public String toString() {
        return "Kierowca:" +
                " numerPracownika = " + super.getNumerPracownika() +
                ", imie = " + super.getImie() +
                ", nazwisko = " + super.getNazwisko() +
                ", wiek = " + super.getWiek() +
                ", wyplata = " + wyplata +
                ", prawoJazdy = " + prawoJazdy;
    }
}
