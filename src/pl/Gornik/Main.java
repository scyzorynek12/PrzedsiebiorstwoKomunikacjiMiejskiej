package pl.Gornik;

import pl.Gornik.Pracownik.Kierowca;
import pl.Gornik.Pracownik.Mechanik;
import pl.Gornik.Pracownik.Pracownik;
import pl.Gornik.Pracownik.Szef;
import pl.Gornik.Trasa.Linia10;
import pl.Gornik.Trasa.Linia4;
import pl.Gornik.Trasa.Linia9;
import pl.Gornik.Trasa.Trasa;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pracownik> pracownik = new ArrayList<>();
        initializePracownik(pracownik);

        List<Trasa> trasa = new ArrayList<>();
        initializeTrasa(trasa);

        String next;
        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Zobaczyć bilety");
            System.out.println("2. Sprawdzić trasy");
            System.out.println("3. Zobaczyć listę pracowników");
            System.out.println("4. Kup bilet dla danej trasy");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Bilet bilet = new Bilet("ulgowy", Bilet.UstawCene("ulgowy"));
                    System.out.println(bilet);
                    Bilet bilet1 = new Bilet("normalny", Bilet.UstawCene("normalny"));
                    System.out.println(bilet1);
                    Bilet bilet2 = new Bilet("miesieczny", Bilet.UstawCene("miesieczny"));
                    System.out.println(bilet2);
                    break;
                case 2:
                    System.out.println("Sprawdz dostepne trasy");
                    for (Trasa tra : trasa) {
                        tra.displayTrasa();
                    }

                    break;
                case 3:
                    for (Pracownik prac : pracownik) {
                        prac.displayPracownik();
                    }
                    break;

                case 4:
                    System.out.println("Dla jakiej trasy chcesz kupic bilet");
                    int numerTrasy = scanner.nextInt();
                    Trasa trasa1 = new Trasa(numerTrasy, 32, 4);
                    System.out.println("Jaki bilet chcesz kupić");
                    scanner.nextLine();
                    String bilety = scanner.nextLine();
                    System.out.println("Imie pasazera:");
                    String imie = scanner.nextLine();
                    Bilet bilet4 = new Bilet(imie, Bilet.UstawCene(bilety), trasa1);

                    trasa1.displayBilety();
                    break;

                default:
                    System.out.println("Podaj poprawną wartość");
                    break;
            }
            System.out.print("Czy chcesz kontynuować? (T/N): ");

            next = scanner.nextLine();

        } while (next.equalsIgnoreCase("T"));

        System.out.println("Koniec programu.");

    }


    public static void initializePracownik(List<Pracownik> pracownik) {
        pracownik.add(new Szef(1, "Adam", "Kowalski", 52, 4200));
        pracownik.add(new Kierowca(2, "Igor", "Pietrzyk", 42, 3200, true));
        pracownik.add(new Kierowca(3, "Amadeusz", "Adamczyk", 47, 3400, true));
        pracownik.add(new Kierowca(4, "Maurycy", "Koźlaż", 37, 3100, true));
        pracownik.add(new Mechanik(5, "Krystian", "Kowal", 38, 3800, "Średnie"));
        pracownik.add(new Mechanik(6, "Henryk", "Łudzki", 34, 3200, "Podstawowe"));
    }

    public static void initializeTrasa(List<Trasa> trasa) {
        List<Pracownik> pracownik = new ArrayList<>();
        initializePracownik(pracownik);
        trasa.add(new Linia4(4, 38, 9, pracownik.get(2)));
        trasa.add(new Linia9(9, 24, 6, pracownik.get(1)));
        trasa.add(new Linia10(10, 79, 14, pracownik.get(3)));
    }

}