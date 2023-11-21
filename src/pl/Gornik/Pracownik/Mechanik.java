package pl.Gornik.Pracownik;

public class Mechanik extends Pracownik{
    int wyplata;
    String wykształcenie;
    public Mechanik(int numerPracownika, String imie, String nazwisko, int wiek, int wyplata, String wykształcenie) {
        super(numerPracownika, imie, nazwisko, wiek);
        this.wyplata = wyplata;
        this.wykształcenie = wykształcenie;
    }
}
