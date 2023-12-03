package pl.Gornik.Pracownik;

public class Pracownik {
    private int numerPracownika ;
    private String imie;
    private String nazwisko;
    private int wiek;

    public Pracownik(int numerPracownika, String imie, String nazwisko, int wiek) {
        this.numerPracownika = numerPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public int getNumerPracownika() {
        return numerPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void displayPracownik(){
        System.out.println("Pracownik:" +
                " numerPracownika = " + numerPracownika +
                ", imie = '" + imie + '\'' +
                ", nazwisko = '" + nazwisko + '\'' +
                ", wiek = " + wiek);
    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "numerPracownika=" + numerPracownika +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
