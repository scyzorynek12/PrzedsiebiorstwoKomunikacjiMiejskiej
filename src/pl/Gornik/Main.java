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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pracownik> pracownik = new ArrayList<>();
        initializePracownik(pracownik);

        System.out.println("Czy chcesz kontynuować");
        String wybor = scanner.nextLine();
//        while(wybor.equalsIgnoreCase("T") || wybor.equalsIgnoreCase("Tak") ||
//                wybor.equalsIgnoreCase("Yes") || wybor.equalsIgnoreCase("Y")) {

        System.out.println("1. Bilety");
        System.out.println("2. Trasy");
        System.out.println("3. Lista pracowników");



            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Jaki bilet chcesz zobaczyc");
                    System.out.println("1. Ulgowy");
                    System.out.println("2. Normalny");
                    System.out.println("3. Miesieczny");
                    int bilety = scanner.nextInt();
                    switch (bilety) {
                        case 1:
                            Bilet bilet = new Bilet("ulgowy", Bilet.UstawCene("ulgowy"));
                            System.out.println(bilet);
                            break;
                        case 2:
                            Bilet bilet2 = new Bilet("normalny", Bilet.UstawCene("normalny"));
                            System.out.println(bilet2);
                            break;
                        case 3:
                            Bilet bilet3 = new Bilet("miesieczny", Bilet.UstawCene("miesieczn"));
                            System.out.println(bilet3);
                            break;
                        default:
                            System.out.println("Podaj poprawną wartość");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Jaką trase chcesz sprawdzic");
                    System.out.println("1. Linia 4");
                    System.out.println("2. Linia 9");
                    System.out.println("3. Linia 10");
                    int trasy = scanner.nextInt();
                    switch (trasy) {
                        case 1:
                            Linia4 linia4 = new Linia4(4, 38, 9, pracownik.get(2));
                            System.out.println(linia4);
                            break;
                        case 2:
                            Linia9 linia9 = new Linia9(9, 24, 6, pracownik.get(1));
                            System.out.println(linia9);
                            break;
                        case 3:
                            Linia10 linia10 = new Linia10(10, 79, 14, pracownik.get(3));
                            System.out.println(linia10);
                            break;
                        default:
                            System.out.println("Podaj poprawną wartość");
                            break;
                    }
                    break;
                case 3:
                    for (Pracownik prac : pracownik) {
                        prac.displayPracownik();
                    }
                    break;
                default:
                    System.out.println("Podaj poprawną wartość");
            }
        }
//    }

    public static void initializePracownik(List<Pracownik> pracownik){
        pracownik.add(new Szef(1, "Adam", "Kowalski", 52, 4200));
        pracownik.add(new Kierowca(2, "Igor", "Pietrzyk", 42, 3200, true));
        pracownik.add(new Kierowca(3, "Amadeusz", "Adamczyk", 47, 3400, true));
        pracownik.add(new Kierowca(4, "Maurycy", "Koźlaż", 37, 3100, true));
        pracownik.add(new Mechanik(5, "Krystian", "Kowal", 38, 3800, "Średnie"));
        pracownik.add(new Mechanik(6, "Henryk", "Łudzki", 34, 3200, "Podstawowe"));
    }
}